import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TC7 {
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
		driver.findElement(By.xpath("//a[@title='My Settings']")).click();
		driver.findElement(By.xpath("//a[@class='header setupFolder']")).click();
		
		driver.findElement(By.xpath("//a[@id='LoginHistory_font']")).click();
		driver.findElement(By.xpath("//*[@id='RelatedUserLoginHistoryList_body']/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id='DisplayAndLayout_font']")).click();
		driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
		

		WebElement dropDown = driver.findElement(By.xpath("//*[@id='p4']"));
		Select type = new Select(dropDown);
		type.selectByIndex(8);
		
		
		driver.findElement(By.xpath("//*[@id='duel_select_0']/option[@value='report']")).click();
		
		driver.findElement(By.xpath("//img[@title='Add']")).click();
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		
		driver.findElement(By.xpath("//*[@id='EmailSetup_font']")).click();
		driver.findElement(By.xpath("//*[@id='EmailSettings_font']")).click();
		
		driver.findElement(By.xpath("//input[@id='auto_bcc1']")).click();
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		
		driver.findElement(By.xpath("//*[@id='CalendarAndReminders_font']")).click();
		driver.findElement(By.xpath("//*[@id='Reminders_font']")).click();
		driver.findElement(By.xpath("//input[@title='Open a Test Reminder']")).click();
		

	}
}
