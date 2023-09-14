import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC6 {

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
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		driver.findElement(By.xpath("//img[@title='Edit Profile']")).click();
		driver.findElement(By.xpath("//*[@id='aboutTab']/a[@tabindex=-1]")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ga");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		
		driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")).click();
		driver.findElement(By.xpath("//iframe[@title=\"Rich Text Editor, publisherRichTextEditor\"]")).sendKeys("Hello");
		driver.findElement(By.xpath("//a[@id='publishersharebutton']")).click();
		
		driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']")).click();
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
		driver.findElement(By.xpath("//a[@id='chatterFile']")).click();
		
		driver.findElement(By.xpath("//div[@id='photoUploadSection']")).click();
		
		
	//	Thread. sleep (3000);

	}

}
