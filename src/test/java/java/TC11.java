import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC11 {

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
		
		WebElement createnewacc = driver.findElement(By.linkText("Create New View"));
		createnewacc.click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("fname")).sendKeys("abcd");
		driver.findElement(By.id("devname")).sendKeys("xyz");
		Thread.sleep(3000);
		
		WebElement save = driver.findElement(By.name("save"));
		save.click();


	}

}
