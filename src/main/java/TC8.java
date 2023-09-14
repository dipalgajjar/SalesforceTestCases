import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC8 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("dipal@test.com");
		driver.findElement(By.id("password")).sendKeys("Diptest@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
		Thread. sleep (3000);
		driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")).click();
		driver.quit();
		
		

	}
}
