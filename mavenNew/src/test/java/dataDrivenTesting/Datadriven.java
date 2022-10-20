package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileCacheImageInputStream;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		// step-1 convert propertyfile into java objects
		FileInputStream fis=new FileInputStream("./venkat.prorerties");
		Properties p=new Properties();
		
		// step-2 load java object
		p.load(fis);
		
		// step-3Read the data
		String v1=p.getProperty("url");
		System.out.println(v1);
		String v2=p.getProperty("password");
		System.out.println(v2);
		String v3=p.getProperty("username");
		System.out.println(v3);
		String v4=p.getProperty("location");
		System.out.println(v4);
		String v5=p.getProperty("state");
		System.out.println(v5);
		String v6=p.getProperty("country");
		System.out.println(v6);

	}

}
