package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
         return new CreateLeadPage(driver);
	}

}
