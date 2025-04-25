package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		/* Application issue, After clicking the search the below results are shown
		 Access Denied
You don't have permission to access "http://www.ajio.com/s/bags-5513-47911?" on this server.
Reference #18.abbce17.1745552676.118b0c96

https://errors.edgesuite.net/18.abbce17.1745552676.118b0c96
		*/

	}

}
