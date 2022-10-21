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
	public void createContactWithOrgName() throws Throwable {
		WebDriverUtility webDriverUtility = new WebDriverUtility(driver);
		//ExcelFileUtility excelFileUtility = new ExcelFileUtility();
		//String data = excelFileUtility.readDatafromExcelFile("Sheet1", 10, 0);
		//String data1 = excelFileUtility.readDatafromExcelFile("Sheet1", 10, 1);
		//String data2 = excelFileUtility.readDatafromExcelFile("Sheet1", 10, 2);
		HomePageClass homePageClass = new HomePageClass(driver);
		homePageClass.conB();
		
		CreateConPageClass cpc = new CreateConPageClass(driver);
		cpc.createCon();

		ContactDetailsPageClass contactDetailsPageClass = new ContactDetailsPageClass(driver);
		
		contactDetailsPageClass.firstNameType("Mr.");

		contactDetailsPageClass.firstName("venkanna");
		contactDetailsPageClass.lastName("babu");
		contactDetailsPageClass.orgClick();
	
		
		String parentWindow = webDriverUtility.switchToParent();
		webDriverUtility.allHandles(parentWindow);
		contactDetailsPageClass.getSrchTxt().sendKeys("amsa");
		contactDetailsPageClass.searchClick();
		
		contactDetailsPageClass.orgNameClick();

		driver.switchTo().window(parentWindow);
		contactDetailsPageClass.sBtn();
		Thread.sleep(3000);

	}

}
