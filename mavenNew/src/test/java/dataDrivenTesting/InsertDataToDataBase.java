package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class InsertDataToDataBase {
	@Test
	public void insertDataToDatabase() throws Throwable {
		//step-2 connect to database
	Connection con=null;
	try {
		//step-1 register the Driver
	Driver dref=new Driver();
	DriverManager.registerDriver(dref);
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
	//step-3 create statement
    java.sql.Statement stmt = con.createStatement();
    int result= stmt.executeUpdate("insert into students_info(regno,firstname,middlename,lastname) values(20,'raj','reddy','N')");
    if(result==1) {
    	System.out.println("Data is stored");
    }
    else {
    	System.out.println("Data is not stored");
    	
    } 
	} catch (SQLException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	finally
	{
		con.close();
		System.out.println("connection closed");
	}
    }
}
