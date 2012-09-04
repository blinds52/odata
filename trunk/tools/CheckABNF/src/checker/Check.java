package checker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import checker.TestSuite.TestCase;

import com.coasttocoastresearch.apg.Parser;
import com.coasttocoastresearch.apg.Parser.Result;
import com.coasttocoastresearch.apg.Parser.RuleCallback;
import com.coasttocoastresearch.apg.Statistics;
import com.coasttocoastresearch.apg.Trace;

import OData.OData;

public class Check {

	private static final int MAX_UNMATCHED_RULES = 25;
	private PrintStream trace;

	private class InvalidRuleName extends IllegalArgumentException {

		private static final long serialVersionUID = 1L;

		public InvalidRuleName(String ruleName) {
			super(ruleName);
		}
	}

	private class ModelElementCheck extends RuleCallback {

		private String ruleName;
		private Set<String> allowed;

		private ModelElementCheck(Parser p, String ruleName, Set<String> names)
				throws InvalidRuleName {
			super(p);
			this.ruleName = ruleName;
			this.allowed = names;
			p.setRuleCallback(ruleID(ruleName), this);
		}

		public int postBranch(int offset, int length)
				throws java.lang.Exception {
			if (length <= 0)
				return -1;

			String match = new String(callbackData.inputString, offset, length);
			if (allowed.contains(match))
				return -1;
			else {
				if (trace != null)
					trace.println("=> " + match + " is no " + ruleName);
				return -2;
			}
		}
	}

	/**
	 * Executes all test cases in the given XML files
	 * 
	 * @param args
	 *            list of XML file names containing test cases
	 */
	public static void main(String[] args) {
		// Will run all test cases in the provided files
		for (String filename : args) {
			System.out.println("Running test cases from " + filename + "\n");
			TestSuite ts = TestSuite.read(filename);
			Check c = new Check();
			c.run(ts, System.out, System.err);
		}
	}

	public void run(TestSuite ts, PrintStream out, PrintStream err) {
		int failures = 0;
		Parser p = new Parser(OData.getInstance());
		Statistics s = p.enableStatistics(true);
		s.enableCumulate(true);

		try {
			for (Map.Entry<String, HashSet<String>> c : ts.Constraints()
					.entrySet())
				new ModelElementCheck(p, c.getKey(), c.getValue());
		} catch (InvalidRuleName e) {
			e.printStackTrace();
			return;
		}

		for (TestCase tc : ts.TestCases()) {
			try {
				p.setStartRule(ruleID(tc.Rule()));
				p.setInputString(tc.Input());
				p.enableTrace(false);

				Result r = p.parse();

				if (r.success() && tc.FailAt() == TestSuite.NOWHERE) {
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
						if (tc.FailAt() != TestSuite.NOWHERE)
							err.print(" instead of " + tc.FailAt());
						err.print(": "
								+ highlight(tc.Input(),
										r.getMaxMatchedPhraseLength())
								+ " is no ");
					}

					err.println(tc.Rule() + "\n");

					// parse again with trace enabled
					trace = err;
					Trace t = p.enableTrace(true);
					t.setOut(err);
					// TODO: move these to test suite XML file
					// TODO: add recursive disabling to Java APG?
					t.enableRule(false,
							OData.RuleNames.ODATAIDENTIFIER.ruleID());
					t.enableRule(false,
							OData.RuleNames.IDENTIFIERLEADINGCHARACTER.ruleID());
					t.enableRule(false,
							OData.RuleNames.IDENTIFIERCHARACTER.ruleID());
					t.enableRule(false, OData.RuleNames.ALPHA.ruleID());
					t.enableRule(false, OData.RuleNames.DIGIT.ruleID());
					p.parse();
					err.println();
					err.flush();
					trace = null;
				}
			} catch (InvalidRuleName e) {
				failures++;
				err.println("\nERROR: " + tc.Name() + ": " + e.getMessage()
						+ "\n");
			} catch (Exception e) {
				failures++;
				e.printStackTrace(err);
			}
		}
		if (failures == 0) {
			int coveredRules = coveredRules(s, out);
			int coverage = (100 * coveredRules) / OData.ruleCount;
			out.println("\nAll " + ts.TestCases().size()
					+ " test cases passed, " + coveredRules + " of "
					+ OData.ruleCount + " rules covered (" + coverage + "%)");
		} else {
			err.println("\n" + failures + " of " + ts.TestCases().size()
					+ " test cases failed\n");
		}
	}

	int ruleID(String ruleName) {
		try {
			return OData.RuleNames.valueOf(
					ruleName.toUpperCase().replace('-', '_')).ruleID();
		} catch (IllegalArgumentException e) {
			throw new Check.InvalidRuleName("unknown rule " + ruleName);
		}
	}

	private String highlight(String input, int pos) {
		return input.substring(0, pos) + "[" + input.substring(pos) + "]";
	}

	private int coveredRules(Statistics s, PrintStream out) {
		int matchedRules = 0;
		int unMatchedRules = 0;
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		PrintStream statOut = new PrintStream(os);
		try {
			s.displayStats(statOut, "rules");
			String statString = os.toString("UTF8");
			String stats[] = statString.split(System
					.getProperty("line.separator"));
			for (int i = 1; i < stats.length; i++) {
				String[] words = stats[i].split("\\s+");
				if (!words[1].equals("0"))
					matchedRules++;
				else {
					if (unMatchedRules == 0)
						out.println("\nUncovered rules:");
					else if (unMatchedRules < MAX_UNMATCHED_RULES)
						out.println("  " + words[5]);
					else if (unMatchedRules == MAX_UNMATCHED_RULES)
						out.println("  ...");
					unMatchedRules++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		statOut.close();
		return matchedRules;
	}
}
