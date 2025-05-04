package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceDynamicDataProvider extends ProjectSpecificMethod {

@DataProvider(name="fetchdata")	

public String[][] sendData() {
	String[][] data = new String[1][1];
	data[0][0]="'Salesforce Automation by Mani";
	return data;
	
}
	
	@Test(dataProvider="fetchdata")
	public void runSalesForce(String legal) throws InterruptedException {

driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Legal Entities");
Thread.sleep(3000);
driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']")).click();
driver.findElement(By.xpath("//li[contains(@class,'slds-button slds-button--neutral')]//a[1]")).click();
driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(legal);

driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")).click();
driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']")).click();
driver.findElement(By.xpath("//li[@data-target-selection-name='sfdc:StandardButton.LegalEntity.SaveEdit']")).click();



	}

}
