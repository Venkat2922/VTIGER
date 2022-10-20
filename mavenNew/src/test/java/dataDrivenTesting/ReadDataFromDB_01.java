package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDB_01{
	@Test
	public void readDataTest() throws Throwable {
		Connection con=null;
		try {
			
			//step-1 register the Driver
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		
		//step-2 connect to database
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		
		//step-3 create statement
	    java.sql.Statement stmt = con.createStatement();
	    System.out.println("Statement created");
		
		//step-4 Execute query
		ResultSet result=stmt.executeQuery("select*from students_info;");
		
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2));
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
		//step=5 close connection with database
		con.close();
		System.out.println("connection closed");
		}
	}

	
}

