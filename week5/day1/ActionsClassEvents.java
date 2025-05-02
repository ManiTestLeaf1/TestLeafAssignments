package week5.day1;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassEvents {
	
	public static void main(String[] args) throws InterruptedException {
        // Initialize Browser driver

        EdgeDriver driver = new EdgeDriver();

        // Get the URL
        driver.get("https://www.amazon.in/");

        // Maximize and Add implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
      //Mouse hover the signIn section
        
    	WebElement elementSignIn = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']")); 
    		
    		Actions act = new Actions(driver);
    		
    		act.moveToElement(elementSignIn).perform();
    		
    		WebElement elementWish = driver.findElement(By.xpath("//div[@id='nav-al-wishlist']"));
    		
    		String strWish = elementWish.getText();
    		
    		if(strWish.contains("Your Lists")) {
    	    System.out.println("===================================================================");
    		System.out.println("Mouse hover works fine in SignIn section");
    		}
    		driver.navigate().refresh();
        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
        
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        
        /*
        //mouse hover the rating
        
        Actions mouseHoverObj = new Actions(driver);
        
       WebElement elementStarRating =  driver.findElement(By.xpath("//i[@data-cy='reviews-ratings-slot']"));
        
        //driver.findElement(By.xpath("//i[@data-cy='reviews-ratings-slot']")).click();
       
        
        //Use the method to mouse hover
        mouseHoverObj.moveToElement(elementStarRating).perform();
        
        //Find the rating of the product
        
        WebElement elementProductRating = driver.findElement(By.xpath("//h2[@data-hook='acr-average-stars-rating-text']"));
        
        String productRating = elementProductRating.getText();
        
        System.out.println("===================================================================");
        
        System.out.println("the rating is "+productRating);
        System.out.println("===================================================================");
        
        */
        System.out.println("===================================================================");
        driver.findElement(By.xpath("//img[@data-image-source-density='1']")).click();
        
        Thread.sleep(2000);
        
        //Fetch the window ref ids
        
        Set<String> phoneDetails = driver.getWindowHandles();
        
        //convert into List to use index method
        
        List<String> nextWindow1 = new ArrayList<String>(phoneDetails);
        
        //Switch to child page
        
        driver.switchTo().window(nextWindow1.get(1));
        
        //Locate the price element which is common even if the search results are changing every time 
        
        WebElement elementPrice = driver.findElement(By.xpath("//div[@id='corePriceDisplay_desktop_feature_div']/div/span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']"));
        
        String subTotalDP = elementPrice.getText().replaceAll("[^\\d.]", "");
        
        WebElement elementName = driver.findElement(By.id("productTitle"));
        
        System.out.println("Price of "+elementName.getText()+ " is  - ");
        System.out.println("₹"+subTotalDP);
        System.out.println("===================================================================");
        
       //Locate Rating element
        WebElement elementRateDP = driver.findElement(By.xpath("//span[@class='reviewCountTextLinkedHistogram noUnderline']"));
        
        System.out.println("Total number of rating for this product is - "+elementRateDP.getText());
        //Locate Review element
        WebElement elementRating = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText']"));
        
        String ratingText = elementRating.getText();
        
        //remove the Ratings Text to print only numbers
        
        String ratingNumbers = ratingText.replaceAll("[^0-9]", "");
        
        System.out.println("Total number of reviews for this product is - "+ratingNumbers);
        System.out.println("===================================================================");
        
        //click the first image 
        
        driver.findElement(By.xpath("//li[@data-csa-c-action='image-block-alt-image-hover'][1]")).click();
        
        //screenshot is not covered so leaving that part of the assignment 
        
        //add the item to cart, As there are so many add to cart buttons, locate the primary one which position will never change even after search results change
        driver.findElement(By.xpath("//input[@formaction='/cart/add-to-cart/ref=dp_start-bbf_1_glance' and @class='a-button-input']")).click();
        
 
        		//Click the cart button
   
        driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
        
        //Locate the subtotal in Cart page and verify if it's same as the subtotal in Details page
        
        WebElement elementSubTotalCart = driver.findElement(By.id("sc-subtotal-amount-activecart"));
        
        String subTotalCart = elementSubTotalCart.getText().replaceAll("[^\\d.]", "");
        
        BigDecimal num1 = new BigDecimal(subTotalDP);
        BigDecimal num2 = new BigDecimal(subTotalCart);
        Thread.sleep(5000);
        if(num1.compareTo(num2) == 0)  {
        	System.out.println("Test Pass");
        	System.out.println("The subtotal ₹"+subTotalCart + " is same between cart and Details page");
        	   System.out.println("===================================================================");
        	
        }
        else {
        	
        	System.out.println("Test Fail");
        	System.out.println("The subtotal ₹"+subTotalCart + " is different between cart and Details page");
        	   System.out.println("===================================================================");
        }
        
        driver.quit();
        
	}

}
