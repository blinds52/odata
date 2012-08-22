package checker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class TestCase {
	public static final int NOWHERE = -1;
	private String name;
	private String rule;
	private String input;
	private int failAt;

	public static List<TestCase> read(String filename) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		List<TestCase> tcs = new ArrayList<TestCase>();
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document dom = db.parse(new File(filename));
			Element root = dom.getDocumentElement();

			NodeList tcEls = root.getElementsByTagName("TestCase");
			for (int i = 0; i < tcEls.getLength(); i++) {
				TestCase tc = new TestCase();
				Element tcEl = (Element) tcEls.item(i);

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

				tcs.add(tc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tcs;
	}

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
