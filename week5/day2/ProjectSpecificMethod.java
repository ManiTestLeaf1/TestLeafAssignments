package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectSpecificMethod {
	
	ChromeDriver driver = new ChromeDriver();
	ChromeOptions options = new ChromeOptions();
  

	
@BeforeMethod
	public void preCondition() {
	  options.addArguments("--disable-notifications");
			driver.get("https://login.salesforce.com/");
	//driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.name("username")).sendKeys("vidyar@testleaf.com");
	driver.findElement(By.name("pw")).sendKeys("Sales@123");
	driver.findElement(By.id("Login")).click();
	
	}
@AfterMethod
public void postCondition() {
//driver.quit();
}

}
