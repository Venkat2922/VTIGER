package testNG_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelFileUtility;
import GenericUtility.WebDriverUtility;
import objectRepository.HomePageClass;
import objectRepository.LeadPageClass;

public class CreateLeadTest_2 extends BaseClass{
	
	@Test(groups = "integration")
public void createLeadTest() throws Throwable
{
	WebDriverUtility webdriverUtility = new WebDriverUtility(driver);
	
	ExcelFileUtility efu=new ExcelFileUtility();
	String data = efu.readDatafromExcelFile("Sheet1", 10, 0);
	String data1=efu.readDatafromExcelFile("Sheet1", 10, 1);
	String data2 = efu.readDatafromExcelFile("Sheet1", 10, 2);
	String data3 = efu.readDatafromExcelFile("Sheet1", 10, 3);
	String data4 = efu.readDatafromExcelFile("Sheet1", 10, 4);
	String data5 = efu.readDatafromExcelFile("Sheet1", 10, 5);
	
	HomePageClass homePageClass = new HomePageClass(driver);
	homePageClass.leadB();
	
	
	LeadPageClass leadpageclass=new LeadPageClass(driver);
	leadpageclass.getLeadPlusBtn().click();;
	leadpageclass.nameTypeDd(data);
	leadpageclass.leadPageDetails();
	leadpageclass.getSaveButton().click();
//    WebElement leadButton = driver.findElement(By.linkText("Leads"));
//    leadButton.click();
    
//    WebElement plusButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
//    plusButton.click();
//    
//    WebElement leadDd = driver.findElement(By.name("salutationtype"));
//    webdriverUtility.selectByvalue(leadDd, data);
//    
//    WebElement fName = driver.findElement(By.name("firstname"));
//    fName.sendKeys(data1);
//    
//    WebElement lName = driver.findElement(By.name("lastname"));
//    lName.sendKeys(data2);
//    
//    WebElement cName = driver.findElement(By.name("company"));
//    cName.sendKeys(data3);
//    
//    WebElement leadsrcDd = driver.findElement(By.name("leadsource"));
//    webdriverUtility.selectByvalue(leadsrcDd, data4);
//    
//    WebElement indDd = driver.findElement(By.name("industry"));
//    webdriverUtility.selectByvalue(indDd, data5);
//    
//    WebElement saveButton = driver.findElement(By.name("button"));
//    saveButton.click();
     
}

}


