package vTigerMainTestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.protobuf.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VTigerTestCase1 {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();  
			driver.manage().window().maximize();
			driver.get("http://localhost:8888/");
			
			
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
			WebElement name=driver.findElement(By.name("user_name"));
			name.sendKeys("admin");
			
		    WebElement pwd=driver.findElement(By.name("user_password"));
		    pwd.sendKeys("admin");
		    
	        WebElement	loginButton=driver.findElement(By.id("submitButton"));
	        loginButton.click();
	        
	       WebElement conButton=driver.findElement(By.linkText("Contacts"));
	       conButton.click();
	       
	       WebElement plusButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
	       plusButton.click();
	       
	       WebElement namedd = driver.findElement(By.name("salutationtype"));
	       Select select=new Select(namedd);
	       select.selectByValue("Mr.");
	       
	       WebElement firstNameTf = driver.findElement(By.name("firstname"));
	       firstNameTf.sendKeys("Bahubali");
	       
	       WebElement lastNameTf = driver.findElement(By.name("lastname"));
	       lastNameTf.sendKeys("Amarendra");
	       
	       WebElement selectorg = driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']"));
	       selectorg.click();
	       
	       String parentwin = driver.getWindowHandle();
	       System.out.println(parentwin);
	       
	       Set<String> allwin = driver.getWindowHandles();
	       
	       for(String awindow:allwin)
	       {
	    	   driver.switchTo().window(awindow);
	    	   System.out.println(awindow);
	       }
	       WebElement orgnameTf = driver.findElement(By.name("search_text"));
	       orgnameTf.sendKeys("amsa");
	       
	       WebElement searchButton = driver.findElement(By.name("search"));
	       searchButton.click();
	      
	       
	           WebElement orgclick = driver.findElement(By.linkText("amsa"));
	       orgclick.click();
	       
	       driver.switchTo().window(parentwin);
	       
	       WebElement saveButton = driver.findElement(By.name("button"));
	       saveButton.click();
	      
	       
	       WebElement admdd=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		      Actions act=new Actions(driver);
		      act.moveToElement(admdd).perform();
		      
		      
		      WebElement signout=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		      signout.click();
		      
		      driver.close();
		      
	        
			
		}

	

	}


