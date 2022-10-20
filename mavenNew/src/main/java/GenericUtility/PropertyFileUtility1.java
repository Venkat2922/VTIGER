package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtility1 {
	public String readDatafromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./CommonDataNew/CommonD.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}


			

	
	}
