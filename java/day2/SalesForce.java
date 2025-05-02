package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SalesForce extends ProjectSpecificMethod {
@Test
	public void runSalesForce() throws InterruptedException {

driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
//driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Legal Entities");


Thread.sleep(500);		 
WebElement legalLink=driver.findElement(By.xpath("(//p[@class='slds-truncate'])[96]"));
Actions act=new Actions(driver);
act.scrollToElement(legalLink).perform(); 
legalLink.click(); 

driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left_none slds-p-right_x-small']")).click();
driver.findElement(By.xpath("//a[contains(@href, 'sObjectName=LegalEntity') and contains(., 'New Legal Entity')]")).click();
//WebElement link1=driverindElement(By.xpath("//div[@title='New']")); 
//link1.click(); 

	}

}
