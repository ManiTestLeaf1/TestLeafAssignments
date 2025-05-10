package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceAccountCreation extends BaseClass {
	
	
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
		EdgeOptions options = new EdgeOptions();
		  options.addArguments("disable-notifications");
		  driver = new EdgeDriver(options);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
	}

	@And("Load the URL")
	public void load_the_url() {
     driver.get("https://login.salesforce.com/ ");
	}
	
	@And("Enter the username")
	public void enter_the_username() {
	   driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	}

	@And("Enter the password")
	public void enter_the_password() {
		 driver.findElement(By.name("pw")).sendKeys("Sales@123");
	}

	@And("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
	}

	@And("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		Thread.sleep(3000);
	}

	@And("Click view All")
	public void click_view_all() throws InterruptedException {
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(3000);
	}

	@And("Click Sales from App Launcher")
	public void click_sales_from_app_launcher() {
	   driver.findElement(By.xpath("//div[@data-id='02u5h0000050FQSAA2']")).click();
	}

	@And("Click on Accounts tab")
	public void click_on_accounts_tab() {
	   driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left_none'])[5]")).click();
	}

	@And("Click on New button")
	public void click_on_new_button() throws InterruptedException {
		
		//driver.findElement(By.xpath("(//lightning-icon[@icon-name='utility:add'])[2]")).click();
		
		WebElement icon = driver.findElement(By.xpath("(//lightning-icon[@icon-name='utility:add'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", icon);
		
	}

	@And("Enter Mani as account name")
	public void enter_as_account_name() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Mani");
	}

	@And("Select Ownership as Public")
	public void select_ownership_as_public() {
	    driver.findElement(By.xpath("//button[contains(@class, 'slds-combobox__input') and @aria-label='Ownership']")).click();
    driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']")).click();
	}

	@When("Click save")
	public void click_save() {
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("Account name should be created")
	public void account_name_should_be_created() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
