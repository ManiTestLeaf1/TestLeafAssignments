package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreateLeadFunctionality extends BaseClass {
	

	@BeforeTest
	public void setValue() {
		filename="CreateLead";

	}
	@Test(dataProvider="fetchData")
	public void runCreateLead(String username, String password, String cName, String fName, String lName) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyLead();

	}

}

//@Test  @BeforeMethod  @AfterMethod
