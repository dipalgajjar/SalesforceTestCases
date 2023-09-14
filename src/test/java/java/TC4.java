import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		driver.findElement(By.id("un")).sendKeys("dipal@test.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();

	}

}
