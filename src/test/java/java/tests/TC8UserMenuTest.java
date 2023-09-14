package tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import constants.FileConstants;
import pages.TC2UserNavMenu;
import utils.CommonUtils;
import pages.TC1LoginPage;

public class TC8UserMenuTest extends BaseTest{
	@BeforeClass
	public void navigateToHome() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		TC1LoginPage lp = new TC1LoginPage(driver);
		lp.loginToApp(driver);
		
	}
	
	@Test
	public void openUserMenu(Method name) throws IOException, InterruptedException {	
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		TC2UserNavMenu um = new TC2UserNavMenu(driver);
		CommonUtils.waitForElement(driver, um.userMenu);
		BaseTest.test.info("Usermenu apperead");
		um.usernavbtn.click();
		BaseTest.test.info("Usermenu is clicked");
		Assert.assertTrue(um.verifyUserMenuItems(), "Failed to verify user menu options");
		BaseTest.test.info("Verified User Menu items");	
	}
	
	@Test
	public void selectDevConsole(Method name) throws IOException, InterruptedException {	
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		TC2UserNavMenu um = new TC2UserNavMenu(driver);
		Assert.assertTrue(um.selectDeveloperConsole(),"Developer Console Selected");
		BaseTest.test.info("Clicked on Developer Console");	
		Assert.assertTrue(um.verifyDeveloporConsolePopup(),"Force.com Developer Console window is displayed");
		BaseTest.test.info("BaseTest.test.info(\"Clicked on Developer Console\");	");	
	}
}	
	
