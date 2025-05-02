package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameAlertAssignment {

    public static void main(String[] args) throws InterruptedException {
        // Initialize Browser driver

        EdgeDriver driver = new EdgeDriver();

        // Get the URL
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

        // Maximize and Add implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Switch to frame using the frame name
        driver.switchTo().frame("iframeResult");

        // click the Try it button using xpath
        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        // switch to alert and accept it

        driver.switchTo().alert().accept();

        // Print the button click result

        WebElement clickActionOK = driver.findElement(By.id("demo"));
        if (clickActionOK.getText().endsWith("OK!")) {
            System.out.println("Test is passed: " + clickActionOK.getText());
        } else {
            System.out.println("Test is Failed: " + clickActionOK.getText());
        }
        // dismiss the alert by clicking cancel and check if Cancel is printed

        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        driver.switchTo().alert().dismiss();

        WebElement clickActionCancel = driver.findElement(By.id("demo"));
        if (clickActionCancel.getText().endsWith("Cancel!")) {
            System.out.println("Test is passed: " + clickActionCancel.getText());
        } else {
            System.out.println("Test is Failed: " + clickActionCancel.getText());
        }
        driver.quit();
    }

}