package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesForce extends ProjectSpecificMethod {
@Test
	public void runSalesForce() throws InterruptedException {

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
driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__control slds-grow')]//textarea)[2]")).sendKeys("Salesforce");

driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")).click();
driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Active']")).click();
driver.findElement(By.xpath("//li[@data-target-selection-name='sfdc:StandardButton.LegalEntity.SaveEdit']")).click();
WebElement elementError = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]"));

String errorMsg = elementError.getText();
System.out.println("====== Error message ========================");
System.out.println(errorMsg);
System.out.println("==============================");
	}

}
