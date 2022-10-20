package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class ReadDataFromDataBase {
	
	@Test
	public void readDataTest() throws Throwable {
		//step-1 register the Driver
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		
		//step-2 connect to database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		
		//step-3 create statement
	    java.sql.Statement stmt = con.createStatement();
		
		//step-4 Execute query
		ResultSet result=stmt.executeQuery("select*from students_info;");
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2));
		}
		//step=5
		con.close();
		
	}

}
