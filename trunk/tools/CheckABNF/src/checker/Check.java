package checker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import com.coasttocoastresearch.apg.Parser;
import com.coasttocoastresearch.apg.Parser.Result;
import com.coasttocoastresearch.apg.Statistics;
import com.coasttocoastresearch.apg.Trace;

import OData.OData;

public class Check {

	private class InvalidRuleName extends Exception {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Will run all test cases in the provided files
		for (String filename : args) {
			System.out.println("Running test cases from " + filename + "\n");
			List<TestCase> tcs = TestCase.read(filename);
			Check c = new Check();
			c.run(tcs, System.out, System.err);
		}
	}

	public void run(List<TestCase> tcs, PrintStream out, PrintStream err) {
		int failures = 0;
		Parser p = new Parser(OData.getInstance());
		Statistics s = p.enableStatistics(true);
		s.enableCumulate(true);

		for (TestCase tc : tcs) {
			try {
				p.setStartRule(ruleID(tc));
				p.setInputString(tc.Input());
				p.enableTrace(false);

				Result r = p.parse();

				if (r.success() && tc.FailAt() == TestCase.NOWHERE) {
					out.println("OK: " + tc.Name() + ": " + tc.Input() + " is "
							+ tc.Rule());
				} else if (!r.success()
						&& tc.FailAt() == r.getMaxMatchedPhraseLength()) {
					out.println("OK: " + tc.Name() + " fails at " + tc.FailAt()
							+ ": " + highlight(tc.Input(), tc.FailAt())
							+ " is no " + tc.Rule());
				} else {
					failures++;
					out.flush();
					err.print("\nERROR: " + tc.Name());

					if (r.success())
						err.print(" succeeds instead of failing at "
								+ tc.FailAt() + ": " + tc.Input() + " is ");
					else {
						err.print(" fails at " + r.getMaxMatchedPhraseLength());
						if (tc.FailAt() != TestCase.NOWHERE)
							err.print(" instead of " + tc.FailAt());
						err.print(": "
								+ highlight(tc.Input(),
										r.getMaxMatchedPhraseLength())
								+ " is no ");
					}

					err.println(tc.Rule() + "\n");

					// parse again with trace enabled
					Trace t = p.enableTrace(true);
					t.setOut(err);
					t.enableRule(false, OData.RuleNames.ODATAIDENTIFIER.ruleID());
					t.enableRule(false, OData.RuleNames.IDENTIFIERLEADINGCHARACTER.ruleID());
					t.enableRule(false, OData.RuleNames.IDENTIFIERCHARACTER.ruleID());
					t.enableRule(false, OData.RuleNames.ALPHA.ruleID());
					t.enableRule(false, OData.RuleNames.DIGIT.ruleID());
					p.parse();
					err.println();
					err.flush();
				}
			} catch (InvalidRuleName e) {
				failures++;
				err.println("\nERROR: " + tc.Name() + ": unknown rule "
						+ tc.Rule() + "\n");
			} catch (Exception e) {
				failures++;
				e.printStackTrace(err);
			}
		}
		if (failures == 0) {
			int coveredRules = coveredRules(s);
			int coverage = (100 * coveredRules) / OData.ruleCount;
			out.println("\nAll " + tcs.size() + " test cases passed, "
					+ coveredRules + " of " + OData.ruleCount
					+ " rules covered (" + coverage + "%)");
		} else {
			err.println("\n" + failures + " of " + tcs.size()
					+ " test cases failed\n");
		}
	}

	private int ruleID(TestCase tc) throws InvalidRuleName {
		try {
			return OData.RuleNames.valueOf(
					tc.Rule().toUpperCase().replace('-', '_')).ruleID();
		} catch (IllegalArgumentException e) {
			throw new InvalidRuleName();
		}
	}

	private String highlight(String input, int pos) {
		return input.substring(0, pos) + "[" + input.substring(pos) + "]";
	}

	private int coveredRules(Statistics s) {
		int matchedRules = 0;
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(os);
		try {
			s.displayStats(out, "rules");
			String statString = os.toString("UTF8");
			String stats[] = statString.split(System
					.getProperty("line.separator"));
			for (int i = 1; i < stats.length; i++) {
				String[] words = stats[i].split("\\s+");
				if (!words[1].equals("0")) {
					// words[5] contains the rule name
					matchedRules++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.close();
		return matchedRules;
	}
}
