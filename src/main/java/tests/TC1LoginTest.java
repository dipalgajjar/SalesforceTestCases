package tests;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import pages.TC1LoginPage;
import tests.ReusableTest;
import pages.TC1LoginPage;
import constants.FileConstants;
import net.bytebuddy.implementation.bytecode.Throw;
//import dev.failsafe.internal.util.Assert;
import utils.FileUtils;



public class TC1LoginTest extends BaseTest{
	@Test
	public void loginTest1() throws InvalidFormatException, IOException {
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver Configured");
		TC1LoginPage lp = new TC1LoginPage(driver);
		lp.loginToApp(driver);
	}
	
	@Test  (priority = 3)
	public void loginTest2() throws InvalidFormatException, IOException{
		WebDriver driver = BaseTest.getDriver(); 
		BaseTest.test.info("Driver Configured");
		TC1LoginPage lp = new TC1LoginPage(driver);
		driver.get("https://login.salesforce.com");
		BaseTest.test.info("Login Page displayed");
//		String[] creds = ExcelUtils.readLoginTestData(1);
		lp.username.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "username"));
		BaseTest.test.info("Username is entered");
		lp.password.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "password"));
		BaseTest.test.info("Password is entered");
		Assert.assertTrue(lp.selectRememberMeCheckBox(), "");	
		BaseTest.test.info("Remember me is clicked");
		Duration WAIT_FOR_ELEMENT;
		lp.loginButton.click();
		
		BaseTest.test.info("Login Successfull");
		
	}

	@Test  (priority = 2)
	public void loginTest4A() throws InterruptedException, IOException {
		
		WebDriver driver = BaseTest.getDriver();
		TC1LoginPage lp = new TC1LoginPage(driver);
		driver.get("https://login.salesforce.com");
		//lp.forgotPassword.click();
		lp.forgotPassword.click();
		BaseTest.test.info("Forgot password is clicked");
		lp.forgotUsername.sendKeys(FileUtils.readPropertiesFile(FileConstants.LOGIN_TESTDATA_FILE_PATH2, "username"));
		BaseTest.test.info("Username is entered for forgot password");
		Duration WAIT_FOR_ELEMENT;
		lp.btncontinue.click();
		BaseTest.test.info("Continue is entered");
	}
	
	@Test  (priority = 1)
	public void loginTest4B() {
		
		WebDriver driver = BaseTest.getDriver();
		TC1LoginPage lp = new TC1LoginPage(driver);
		driver.get("https://login.salesforce.com");
		lp.username.sendKeys("dipal123@test.com");
		lp.password.sendKeys("Diptest123@123");
		lp.loginButton.click();
	}
	
}
