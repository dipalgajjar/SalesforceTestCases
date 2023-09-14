import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonShoppingExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("kindle");
        searchBox.submit();
        WebElement amazonChoice = driver.findElement(By.xpath("//span[contains(@aria-label, \"Amazon's Choice\")]"));
        if (amazonChoice.isDisplayed()) {
        	
            System.out.println("Amazon's Choice badge is present.");
            WebElement imageElement = driver.findElement(By.className("s-image"));
            imageElement.click();
            
            WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
            addToCart.click();
           // Thread.sleep(3000);    
            WebElement cart = driver.findElement(By.id("nav-cart"));
            cart.click();
          //  Thread.sleep(3000);
            WebElement itemAdded = driver.findElement(By.className("sc-product-image"));
            if(itemAdded.isDisplayed()) {
            	System.out.println("AItem is added in to the cart.");
            }
            else {
            	System.out.println("AItem is not added in to the cart.");
            }
            
        } else {
            System.out.println("Amazon's Choice badge is not present.");
        }
    }
}
