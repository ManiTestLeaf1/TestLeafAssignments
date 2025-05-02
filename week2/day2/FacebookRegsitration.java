package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegsitration {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(".//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("testleafmanifirst");
		driver.findElement(By.name("lastname")).sendKeys("testleafmaniLast");
		
		WebElement elementDay = driver.findElement(By.id("day"));
		Select dayDropdown = new Select(elementDay);
		dayDropdown .selectByValue("10");
		
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select monthDropdown = new Select(elementMonth);
		monthDropdown .selectByValue("5");
		
		WebElement elementYear = driver.findElement(By.id("year"));
		Select yearDropdown = new Select(elementYear);
		yearDropdown .selectByValue("1995");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]/input[@type='radio']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("teatleafmani1@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Testing@123");
		driver.findElement(By.name("websubmit")).click();
	}

}
