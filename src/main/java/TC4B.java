import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("dipal123@test.com");
		driver.findElement(By.id("password")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread. sleep (3000);

	}

}
