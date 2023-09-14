package tests;
import org.openqa.selenium.WebDriver;

import pages.TC1LoginPage;

public class ReusableTest {
	
	public static void Launch() {
		WebDriver driver = BaseTest.getDriver();
		driver.get("https://login.salesforce.com");
	}

//	public static void Login() {
//		WebDriver driver = BaseTest.getDriver();
//		TC1LoginPage lp = new TC1LoginPage(driver);
//		lp.username.sendKeys("dipal@test.com");
//		lp.password.sendKeys("Diptest@123");
//		
//	}
}
