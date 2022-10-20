package dataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

import com.mysql.cj.xdevapi.JsonParser;

public class ReadDatafromJSONTest {

	public static void main(String[] args) throws Throwable {
		
	//step=1 convert JSON object into java object
	FileReader fr =new FileReader("./CommonDataNew/Data.json");
	
	//step=2 convert Json object into java object
	JSONParser jp=new JSONParser();
	Object jobj=jp.parse(fr);
	
	//step=3 use Hashmap to read data
	HashMap hp=(HashMap)jobj;
	String value=(String) hp.get("url");
	System.out.println(value);
	String v2=(String) hp.get("username");
	System.out.println(v2);
	String v3=(String) hp.get("password");
	System.out.println(v3);

	}

}
