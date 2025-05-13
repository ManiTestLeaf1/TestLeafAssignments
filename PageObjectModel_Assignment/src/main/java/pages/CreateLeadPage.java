package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	public CreateLeadPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
         return this;
	}
	
public CreateLeadPage enterFirstName(String fName ) {
		
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
     return this;	
}

public CreateLeadPage enterLastName(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
     return this;
}

public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    return new ViewLeadPage(driver);
}

}
