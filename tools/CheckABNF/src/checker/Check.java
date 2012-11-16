package checker;

import grammar.GrammarUnderTest;
import grammar.GrammarUnderTest.RuleNames;

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


public class Check {

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
		Parser p = new Parser(GrammarUnderTest.getInstance());
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

				Result r = parse(p, ts, tc.Trace(), out);

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
					parse(p, ts, true, err);
				}
			} catch (InvalidRuleName e) {
				failures++;
				err.println("\nERROR: " + tc.Name() + ": " + e.getMessage()
						+ "\n");
			} catch (Exception e) {
				failures++;
				err.println("\nERROR: " + tc.Name() + ": " + tc.Input()
						+ ": " + e.getMessage() + "\n");
				e.printStackTrace(err);
			}
		}
		if (failures == 0) {
			int coveredRules = coveredRules(s, ts, out);
			int coverage = (100 * coveredRules) / GrammarUnderTest.ruleCount;
			out.println("\nAll " + ts.TestCases().size()
					+ " test cases passed, " + coveredRules + " of "
					+ GrammarUnderTest.ruleCount + " rules covered (" + coverage + "%)");
		} else {
			err.println("\n" + failures + " of " + ts.TestCases().size()
					+ " test cases failed\n");
		}
	}

	private Result parse(Parser p, TestSuite ts, boolean doTrace, PrintStream ps)
			throws Exception {
		Trace t = p.enableTrace(doTrace);
		if (doTrace) {
			trace = ps;
			t.setOut(trace);
			// TODO: add recursive disabling to Java APG?
			for (String rule : ts.DisableTrace()) {
				t.enableRule(false, ruleID(rule));
			}
		}

		Result r = p.parse();

		if (doTrace) {
			trace.println();
			trace.flush();
			trace = null;
		}
		return r;
	}

	int ruleID(String ruleName) {
		try {
			return GrammarUnderTest.RuleNames.valueOf(
					ruleName.toUpperCase().replace('-', '_')).ruleID();
		} catch (IllegalArgumentException e) {
			throw new Check.InvalidRuleName("unknown rule " + ruleName);
		}
	}

	private String highlight(String input, int pos) {
		return input.substring(0, pos) + "[" + input.substring(pos) + "]";
	}

	private int coveredRules(Statistics s, TestSuite ts, PrintStream out) {
		int unMatchedRules = 0;
		HashSet<String> matchedRuleNames = new HashSet<String>();

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
					matchedRuleNames.add(words[5]);
			}

			if (matchedRuleNames.size() < GrammarUnderTest.RuleNames.values().length) {
				out.println("\nUncovered rules:");
				unMatchedRules = 0;
				for (RuleNames r : GrammarUnderTest.RuleNames.values()) {
					if (!matchedRuleNames.contains(r.ruleName())) {
						if (unMatchedRules < ts.MaxUncoveredRules())
							out.println("  " + r.ruleName());
						else if (unMatchedRules == ts.MaxUncoveredRules())
							out.println("  ...");
						unMatchedRules++;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		statOut.close();
		return matchedRuleNames.size();
	}
}
