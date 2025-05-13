package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_004CreateAccountFunctionality extends BaseClass {
	@BeforeTest
	public void setValue() {
		filename="CreateAccount";
	}
	
	@Test(dataProvider="fetchData")
	public void runCreateAccount(String username, String password, String randomAccountName) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFALink()
		.clickAccountsTab()
		.clickCreateAccountLink()
		.enterAccountName(randomAccountName)
		.clickCreateAccountButton()
		.verifyAccount();

	}

}
