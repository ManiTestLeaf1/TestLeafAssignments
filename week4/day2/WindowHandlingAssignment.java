package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		//EdgeDriver driver = new EdgeDriver();
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Thread.sleep(2000); 
		Set<String> Popup1 = driver.getWindowHandles();
		List<String> TestLeafSite1 = new ArrayList<String>(Popup1);
		System.out.println(TestLeafSite1);
		
		driver.switchTo().window(TestLeafSite1.get(1));
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]")).click();
		
		driver.switchTo().window(TestLeafSite1.get(0));
        driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
    	Thread.sleep(2000); 
		Set<String> Popup2 = driver.getWindowHandles();
		List<String> TestLeafSite2 = new ArrayList<String>(Popup2);
		System.out.println(TestLeafSite2);
	
		driver.switchTo().window(TestLeafSite2.get(1));
		 
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		System.out.println("---------");
	System.out.println(TestLeafSite1);
	System.out.println(TestLeafSite2);

		driver.switchTo().window(TestLeafSite2.get(0));
	
		 driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000); 
		String PageTitle=driver.getTitle();
		System.out.println("Title of the page is " +PageTitle);

	}

}
