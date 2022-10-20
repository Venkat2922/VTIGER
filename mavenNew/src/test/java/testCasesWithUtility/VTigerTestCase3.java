package testCasesWithUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.protobuf.Duration;

import GenericUtility.JavaUtility;
import GenericUtility.PropertyFileUtility1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VTigerTestCase3 {

		public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();

			driver.manage().window().maximize();
			Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(Duration.OfSeconds)

			PropertyFileUtility1 pfu=new PropertyFileUtility1();

			String uRl = pfu.readDatafromPropertyFile("url");
			String uName = pfu.readDatafromPropertyFile("username");
			String pWd = pfu.readDatafromPropertyFile("password");


			driver.get(uRl);

			WebElement name=driver.findElement(By.name("user_name"));
			name.sendKeys(uName);

			WebElement pwd=driver.findElement(By.name("user_password"));
			pwd.sendKeys(pWd);

			WebElement	loginButton=driver.findElement(By.id("submitButton"));
			loginButton.click();
			String orgname1="Testyantra solutions"+JavaUtility.generateRanNum();

			WebElement orgclick=driver.findElement(By.xpath("//a[text()='Organizations']"));
			orgclick.click();

			WebElement createorgclick=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
			createorgclick.click();

			WebElement orgname=driver.findElement(By.name("accountname"));
			orgname.sendKeys(orgname1);

			WebElement indname=driver.findElement(By.name("industry"));
			Select select=new Select(indname);
			System.out.println(select.isMultiple());
			select.selectByValue("Biotechnology");

			WebElement savebutton=driver.findElement(By.name("button"));
			savebutton.click();

			Thread.sleep(3000);

			//		WebElement orgname2=driver.findElement(By.xpath("//a[text()='Testyantra']"));
			//		orgname2.click();
			String orgnametext=driver.findElement(By.className("dvHeaderText")).getText();
			if(orgnametext.contains(orgname1))
			{
				System.out.println("validation successful");
			}
			else
			{
				System.out.println("validation not successful");
			}
			WebElement admdd=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions act=new Actions(driver);
			act.moveToElement(admdd);
			Thread.sleep(3000);

//			WebElement signout=driver.findElement(By.linkText("Sign Out'"));
//			signout.click();
//
//			driver.close();
			WebElement WebElement = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Thread.sleep(3000);
			Actions actions=new Actions(driver);
			act.moveToElement(WebElement).perform();
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			driver.close();


		}

	
	}


