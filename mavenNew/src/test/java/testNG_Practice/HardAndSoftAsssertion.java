package testNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class HardAndSoftAsssertion {
//	@Test
//	public void hardassert()
//	{
//		String actdata="homepage displayed";
//		String expdata="homepage disp";
//		System.out.println("Login Successfull");
//		//To perform Hard Assert
//		Assert.assertEquals(actdata, expdata);
//		System.out.println("Homepage is displayed");
//	}
	
	@Test
	public void SoftAssert()
	{
		String actdata="homepage displayed";
		String expdata="homepage disp";
		System.out.println("Login Successfull");
		//To perform Soft Assert
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actdata,expdata);
		System.out.println("Homepage is displayed");
		sf.assertAll();
	}

}
