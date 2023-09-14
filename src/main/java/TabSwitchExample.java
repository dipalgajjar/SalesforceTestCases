import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TabSwitchExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.CONTROL + "t");
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.get("https://www.google.com");
        driver.switchTo().window(tabs.get(0));
        body.sendKeys(Keys.CONTROL + "t");
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));

        driver.get("https://www.github.com");

        driver.switchTo().window(tabs.get(1));  // Switch to the second tab
        driver.switchTo().window(tabs.get(2));  // Switch to the third tab
        driver.switchTo().window(tabs.get(1));  // Switch back to the second tab

        driver.quit();
    }
}
