package pages;

import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	public ViewLeadPage(EdgeDriver driver) {
		this.driver=driver;
	}
	
	public void verifyLead() {
		System.out.println("Lead is created");

	}

}
