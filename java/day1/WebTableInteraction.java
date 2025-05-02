package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableInteraction {

    public static void main(String[] args) {
        // Initialize Browser driver

        EdgeDriver driver = new EdgeDriver();

        // Get the URL
        driver.get("https://erail.in/");

        // Maximize and Add implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Locate the elements, Clear th etext fields, send the station codes and uncheck select days check box
        driver.findElement(By.id("txtStationFrom")).clear();
        driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");

        driver.findElement(By.id("txtStationTo")).clear();
        driver.findElement(By.id("txtStationTo")).sendKeys("MDU");

        driver.findElement(By.id("chkSelectDateOnly")).click();

        // Find the table body - Header is also included
        /* WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody"));
 List<WebElement> tableList = table.findElements(By.tagName("tr"));
 int NoOfRows = tableList.size();
 //Exclude the header to fetch the row count aka train count
  System.out.println(NoOfRows-1);
  */
        // Print the table with all the info
        /*for(int i=0;i<NoOfRows;i++) {
	  System.out.println(tableList.get(i).getText());
  }
   List<WebElement> trainCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
  System.out.println(trainCount.size());
  */

        System.out.println("--------------------------------------------------------------");
        System.out.println("The train list from MAS to MDU is: ");
        System.out.println("--------------------------------------------------------------");
        List < WebElement > trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));

        for (int i = 0; i < trainList.size(); i++) {

            System.out.println(i + 1 + "   " + trainList.get(i).getText());
        }
        System.out.println("--------------------------------------------------------------");
        
    }
}