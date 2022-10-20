package testNG_Practice;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelFileUtility;
import GenericUtility.WebDriverUtility;
import objectRepository.ContactDetailsPageClass;
import objectRepository.CreateConPageClass;
import objectRepository.HomePageClass;

public class CreateContactWithOrgname extends BaseClass {
	@Test(groups = "smoke")
	public void createContactWithOrgName() throws Throwable
	{
		WebDriverUtility webDriverUtility=new WebDriverUtility(driver);
		ExcelFileUtility excelFileUtility=new ExcelFileUtility();
		String data = excelFileUtility.readDatafromExcelFile("Sheet1", 1, 0);
		String data1=excelFileUtility.readDatafromExcelFile("Sheet1", 1, 1);
		String data2 = excelFileUtility.readDatafromExcelFile("Sheet1", 1, 2);
		HomePageClass homePageClass=new HomePageClass(driver);
		homePageClass.conB();
		CreateConPageClass cpc=new CreateConPageClass(driver);
		cpc.createCon();
       
       ContactDetailsPageClass contactDetailsPageClass=new ContactDetailsPageClass(driver);
       contactDetailsPageClass.firstNameType(data);
      
       contactDetailsPageClass.firstName(data1);
       contactDetailsPageClass.lastName(data2);
       contactDetailsPageClass.orgClick();    
      String parentWindow = webDriverUtility.switchToParent();
           webDriverUtility.allHandles(parentWindow);
           contactDetailsPageClass.getSrchTxt().sendKeys("amsa");   
           contactDetailsPageClass.searchClick();
           Thread.sleep(3000);
           contactDetailsPageClass.orgNameClick();
       
      driver.switchTo().window(parentWindow);
    contactDetailsPageClass.sBtn();
   
	}


}


