package testCasesWithUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class VTigerTestCase2 {

		public static void main(String[] args) throws InterruptedException {
			//WebDriver driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("http://localhost:8888/index.php?action=index&module=Home");
			Thread.sleep(3000);
			driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.SPACE,Keys.ENTER);
			/*driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			driver.findElement(By.name("accountname")).sendKeys("Testyantra99");
			driver.findElement(By.xpath("//input[@type='button']")).click();*/
			driver.findElement(By.linkText("Organizations")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("VENKAT")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String data=driver.findElement(By.xpath("//span[text()='[ ACC1 ] VENKAT -  Organization Information']")).getText();
			String data1="Testyantra";
			Thread.sleep(3000);
			System.out.println(data.contains(data1));
			WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions act=new Actions(driver);
			act.moveToElement(ele).perform();
			driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
			driver.close();

			
		    
		}

	}


