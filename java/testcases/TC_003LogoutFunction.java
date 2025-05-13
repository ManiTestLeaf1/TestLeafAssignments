package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_003LogoutFunction extends BaseClass {
	
	@Test(dataProvider="fetchData")
	public void runLogout(String username, String password) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.logout();

	}

}
