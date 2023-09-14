import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hackathon {

	@Test
	public void printiTo5() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");	
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(("KIndle"));
		
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
		searchbtn.click();
		
		Thread.sleep(3000);
	}

		
		
}
