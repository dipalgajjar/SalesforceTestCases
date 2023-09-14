import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("dipal@test.com");
		driver.findElement(By.id("password")).sendKeys("Diptest@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		WebElement account = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		account.click();
		
		Thread.sleep(3000);
		
		WebElement newaccount = driver.findElement(By.name("new"));
		newaccount.click();
		Thread.sleep(3000);
		
		WebElement dropDown = driver.findElement(By.id("acc6"));
		Select type = new Select(dropDown);
		type.selectByIndex(1);
		
		//Thread. sleep (3000);

	}

}