package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC_Software");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Doe");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf account creation Mani");
		
		driver.findElement(By.name("submitButton")).click();
		
		String Title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		
		
		if(Title.contains("TestLeaf account creation Mani")) {
			System.out.println("Test Pass, Created test lead ");
		}
		else {
			System.out.println("Test Fail - Not able to create lead ");
		}
		driver.close();
	}

}
