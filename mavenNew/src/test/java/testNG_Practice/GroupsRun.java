package testNG_Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupsRun {
		@Test(groups = "smoke")
		public void a1()
		{
			System.out.println("a");
			System.out.println("Venkat");
			
		}
		@Test(groups={"regression","smoke","integration"})
		//@Test(groups = "smoke")
	public void A2() {
		System.out.println("A");
		System.out.println("testyantra");
		
	}

	@Test(groups = "regression")
	public void bt()
	{
		System.out.println("Before Suite");
		System.out.println("aswaraopeta");
	}
	@Test(groups = "regression")
	public void at()
	{
		System.out.println("After Suite");
		System.out.println("narayanapuram");
	}
	@org.testng.annotations.BeforeClass
	public void ac()
	{
		System.out.println("After cclass");
		System.out.println("khammam");
		
	}
	
	//@Test(groups = "integration")
	public void bm()
	{
	System.out.println("Before Method");
	System.out.println("indian");
	}
	@Test(groups = "integration")
	public void am()
	{
		System.out.println("after method");
		System.out.println("location");
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


