package testNG_Practice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Demo {
	
	
		@Test(priority = 3)
		public void a()
		{
			System.out.println("a");
			
		}
		@Test(enabled = false)
	public void A() {
		System.out.println("A");
		
	}

	@Test
	public void bt()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void at()
	{
		System.out.println("After Suite");
	}
	@BeforeClass
	public void ac()
	{
		System.out.println("After cclass");
		
	}
    public static void main(String[] args) {
    	System.out.println("Testyantra Solutions");
    }
    @Test
	public void bm()
	{
	System.out.println("Before Method");
	}
	@Test
	public void am()
	{
		String actual="venkat";
		String expected="Venkat1";
	org.testng.Assert.assertEquals(actual, expected);
		System.out.println("after method");
	}
	@Test(enabled = true)
	public void beforetest()
	{
		System.out.println("before Test");
	}
	@Test(invocationCount = 3)
	public void afterTest()
	{
		System.out.println("after Test");
	}
	}



