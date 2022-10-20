package testNG_Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	public static WebDriver driver;

	@Test
	public void amazon() 
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://amazon.in");
		System.out.println(driver.getTitle());
		
		org.testng.Assert.assertEquals(false, true);
		

	}
	
	@Test
	public void flipkart() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://flipkart.com");
		System.out.println(driver.getTitle());

		org.testng.Assert.assertEquals(false, true);
		
	}
	
}


