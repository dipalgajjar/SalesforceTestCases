import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC12 {
	
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
		
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("fname")).sendKeys("abcd123");
		driver.findElement(By.id("devname")).sendKeys("xyz");
		Thread.sleep(3000);
		
		WebElement dropDownfield= driver.findElement(By.id("fcol1"));
		Select field = new Select(dropDownfield);
		field.selectByValue("ACCOUNT.NAME");
		Thread.sleep(3000);
		
		WebElement dropDownOper = driver.findElement(By.id("fop1"));
		Select operator = new Select(dropDownOper);
		operator.selectByValue("c");
		Thread.sleep(3000);
		
		driver.findElement(By.name("fval1")).sendKeys("a");
		Thread.sleep(3000);

		WebElement save = driver.findElement(By.name("save"));
		save.click();


	}

}
