package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002LoginFunction extends BaseClass {
	
	@BeforeTest
	public void setValue() {
		filename="Login";

	}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String username, String password) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton();

	}

}
