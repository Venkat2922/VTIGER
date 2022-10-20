package dataDrivenTesting;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class FetchXMLpr_1Test {
  @Test
  public void Fetch(XmlTest xml) {
	  String url=xml.getParameter("url");
		System.out.println(url);
		String password=xml.getParameter("password");
		System.out.println(password);
		String username=xml.getParameter("username");
		System.out.println(username);
  }
}
