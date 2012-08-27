package checker;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class TestSuite {
	public static final int NOWHERE = -1;

	private List<TestCase> testCases;
	private Map<String, HashSet<String>> constraints;

	private TestSuite() {
		testCases = new ArrayList<TestCase>();
		constraints = new HashMap<String, HashSet<String>>();
	}

	public static class TestCase {
		private String name;
		private String rule;
		private String input;
		private int failAt;

		public String Name() {
			return name;
		}

		public String Rule() {
			return rule;
		}

		public String Input() {
			return input;
		}

		public int FailAt() {
			return failAt;
		}
	}

	public static class Constraint {
		private String ruleName;
		private HashSet<String> matches;

		public boolean equals(Constraint c) {
			return this.ruleName.equals(c.ruleName);
		}

		public String RuleName() {
			return ruleName;
		}

		public HashSet<String> Matches() {
			return matches;
		}
	}

	public static TestSuite read(String filename) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		TestSuite ts = new TestSuite();

		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document dom = db.parse(new File(filename));
			Element root = dom.getDocumentElement();

			NodeList tcEls = root.getElementsByTagName("TestCase");
			for (int i = 0; i < tcEls.getLength(); i++) {
				Element tcEl = (Element) tcEls.item(i);

				TestCase tc = new TestCase();
				tc.name = tcEl.getAttribute("Name");
				tc.rule = tcEl.getAttribute("Rule");
				String failAt = tcEl.getAttribute("FailAt");
				if (failAt.length() > 0)
					tc.failAt = Integer.parseInt(failAt);
				else
					tc.failAt = NOWHERE;
				Element input = (Element) tcEl.getElementsByTagName("Input")
						.item(0);
				tc.input = input.getFirstChild().getNodeValue();

				ts.testCases.add(tc);
			}

			NodeList csEls = root.getElementsByTagName("Constraint");
			for (int i = 0; i < csEls.getLength(); i++) {
				Element csEl = (Element) csEls.item(i);

				String rule = csEl.getAttribute("Rule");
				HashSet<String> matches = ts.constraints.get(rule);
				if (matches == null) {
					matches = new HashSet<String>();
					ts.constraints.put(rule, matches);
				}
				NodeList matchEls = csEl.getElementsByTagName("Match");
				for (int j = 0; j < matchEls.getLength(); j++) {
					Element matchEl = (Element) matchEls.item(j);
					matches.add(matchEl.getFirstChild().getNodeValue());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ts;
	}

	public List<TestCase> TestCases() {
		return testCases;
	}

	public Map<String, HashSet<String>> Constraints() {
		return constraints;
	}

	public TestSuite clone(String name) {
		TestSuite ts = new TestSuite();
		ts.constraints = this.constraints;
		for (TestCase tc : this.testCases)
			if (tc.name.equals(name))
				ts.testCases.add(tc);
		return ts;
	}
}
