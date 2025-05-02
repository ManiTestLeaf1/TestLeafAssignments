package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class CreateAccountTestLeaf {
@Test
	public void runCreateAccountLead() {
	EdgeDriver driver=new EdgeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ManiTestLeaf");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement industryElement = driver.findElement(By.name("industryEnumId"));
		Select industryDropdown = new Select(industryElement);
		industryDropdown.selectByVisibleText("Computer Software");
		
		WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDropdown = new Select(ownershipElement);
		ownershipDropdown.selectByVisibleText("S-Corporation");
		
		
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
		Select sourceDropdown = new Select(sourceElement);
		sourceDropdown.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingcampaignElement = driver.findElement(By.id("marketingCampaignId"));
		Select marketingcampaignDropdown = new Select(marketingcampaignElement);
		marketingcampaignDropdown.selectByIndex(6);
		
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDrpdown = new Select(stateElement);
		stateDrpdown.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String AccountDetails = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
         if(AccountDetails.contains("Account")) {
        	 System.out.println("Test Pass - Account created successfully");
         }
         else {
        	 System.out.println("Test Fail - Account is NOT created");
         }

		driver.quit();
		
	}

}
