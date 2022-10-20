package testNG_Practice;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.JavaUtility;
import objectRepository.HomePageClass;
import objectRepository.OrganisationDetailsPageClass;
import objectRepository.OrganisationPageClass;

public class CreateOrganisation extends BaseClass {
	@Test(groups = "regression")
	public void createOrganisationOnly() throws Throwable {
		
		 String orgname1="amsa1"+JavaUtility.generateRanNum();
		 HomePageClass hpc=new HomePageClass(driver);
		 hpc.orgB();
		 Thread.sleep(3000);
		 
		 OrganisationPageClass opc=new OrganisationPageClass(driver);
		 opc.newOrgBtn();
		 
		 OrganisationDetailsPageClass odp = new OrganisationDetailsPageClass(driver);
		 odp.orgName(orgname1);
		 odp.saveB();
		 Thread.sleep(3000);
		 
		
	}

}
