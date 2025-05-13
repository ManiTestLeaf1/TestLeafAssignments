package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class AccountDetailsPage extends BaseClass{
	public AccountDetailsPage(EdgeDriver driver) {
		this.driver=driver;
	}
public AccountDetailsPage verifyAccount() {
	System.out.println("===============================================");
	System.out.println("Account created succesfully");
	System.out.println("===============================================");
	 WebElement elementAccount = driver.findElement(By.xpath("//span[text()='Account Name']/ancestor::td/following-sibling::td//span[contains(@class, 'tabletext')]"));
     String textAccount = elementAccount.getText();
     
     System.out.println("Account name is "+textAccount);
     System.out.println("===============================================");
     return this;
}
}
