package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(EdgeDriver driver) { //abc
		this.driver=driver;
	}
	
	public LoginPage enterUsername(String userename) {
		
		driver.findElement(By.id("username")).sendKeys(userename);
		return this;
	}
	
  public LoginPage enterPassword(String password) {
	  driver.findElement(By.id("password")).sendKeys(password);
      return this;
	}

  public WelcomePage clickLoginButton() {
	  driver.findElement(By.className("decorativeSubmit")).click();
       WelcomePage wp=new WelcomePage(driver);
       return wp;
}

}
