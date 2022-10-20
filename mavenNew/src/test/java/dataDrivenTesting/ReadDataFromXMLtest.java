
package dataDrivenTesting;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXMLtest {
	@Test
	public void readDataFromTest(XmlTest xml)
	{
		String URL=xml.getParameter("url");
	System.out.println(URL);
	String username=xml.getParameter("username");
	System.out.println(username);
    String password=xml.getParameter("password");
	System.out.println(password);
	//String location=xml.getParameter("location");
	//System.out.println(location);
	//String country=xml.getParameter("country");
	//System.out.println(country);
	//String language=xml.getParameter("language");
	//System.out.println(language);/*


}
}
