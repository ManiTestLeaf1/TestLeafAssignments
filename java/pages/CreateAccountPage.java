package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class CreateAccountPage extends BaseClass {

		public CreateAccountPage(EdgeDriver driver) {
			this.driver=driver;
		}
//Random number generation method to append with user name to avoid duplicate name error 	
	public String generateRandomNumber() {
	    Random rand = new Random();
	    int randomNum = rand.nextInt(9000) + 1000; // Generates 1000–9999
	    return String.valueOf(randomNum);
	}
//Account name is entered with random number
	  public CreateAccountPage enterAccountName(String accountName) {
	        String randomAccountName = accountName + generateRandomNumber();
	        driver.findElement(By.id("accountName")).sendKeys(randomAccountName);
	        return this;

}
	  
public AccountDetailsPage clickCreateAccountButton() {
	driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	return new AccountDetailsPage(driver);

}

}
