package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	
  
@Parameters({"url","user","pwd"})
@BeforeMethod
	public void preConditions(String URL,String USR,String PWD) {
	ChromeOptions options = new ChromeOptions();
	  options.addArguments("disable-notifications");
	  driver = new ChromeDriver(options);
			driver.get(URL);
	//driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.name("username")).sendKeys(USR);
	driver.findElement(By.name("pw")).sendKeys(PWD);
	driver.findElement(By.id("Login")).click();

	}

  /* @AfterMethod
	public void postCondition() {
	driver.quit();
   }
*/
}
