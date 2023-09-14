import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class Hackathon2 {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open XE.com
        driver.get("https://www.xe.com/");

        // Find the "From" currency input field and enter "USD"
        driver.findElement(By.id("midmarketFromCurrency")).sendKeys("USD");
        Thread.sleep(2000);
        // Find the "To" currency input field and enter "INR"
        driver.findElement(By.id("midmarketToCurrency")).sendKeys("INR");
        Thread.sleep(2000);
        // Click on the "Convert" button
        driver.findElement(By.xpath("//button[text()='Convert']")).click();

        // Add a sleep for demonstration purposes (not recommended for real tests)
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
    }
}
