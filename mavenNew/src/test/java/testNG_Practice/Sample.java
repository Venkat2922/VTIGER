package testNG_Practice;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void a()
	{
		System.out.println("a");
		
	}
	@Test
public void A() {
	System.out.println("A");
	
}

@BeforeSuite
public void bt()
{
	System.out.println("Before Suite");
}
@AfterSuite
public void at()
{
	System.out.println("After Suite");
}
@org.testng.annotations.BeforeClass
public void ac()
{
	System.out.println("After cclass");
	
}
@BeforeMethod
public void bm()
{
System.out.println("Before Method");
}
@AfterMethod
public void am()
{
	System.out.println("after method");
}
@BeforeTest
public void beforetest()
{
	System.out.println("before Test");
}
@AfterTest
public void afterTest()
{
	System.out.println("after Test");
}
}




