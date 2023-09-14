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


public class TC7UserMenuTest extends BaseTest{
	@BeforeClass
	public void navigateToHome() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		TC1LoginPage lp = new TC1LoginPage(driver);
		lp.loginToApp(driver);
	}
	
	@Test
	public void UserDrpMenuTest1(Method name) throws IOException, InterruptedException {	
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		TC2UserNavMenu um = new TC2UserNavMenu(driver);
		CommonUtils.waitForElement(driver, um.userMenu);
		BaseTest.test.info("Usermenu apperead");
		um.usernavbtn.click();
		BaseTest.test.info("Usermenu is clicked");
		Assert.assertTrue(um.verifyUserMenuItems(), "Failed to verify user menu options");
		BaseTest.test.info("Verified User Menu items");
		Assert.assertTrue(um.selectSettings(), "");
		BaseTest.test.info("Selected My Settings");
		
//		Assert.assertTrue(um.PersonalInfo(), "");
//		BaseTest.test.info("Selected Personal link");
//		Assert.assertTrue(um.LoginHistory(), "");
//		BaseTest.test.info("Login History Table Displayed");
//		Assert.assertTrue(um.downloadLoginHistory(), "");
//		BaseTest.test.info("Clicked on Download Login History Link");
//		BaseTest.test.info("Login History table Downloaded");
		Assert.assertTrue(um.DispalyAndLayout(), "");	
		Assert.assertTrue(um.CustomizeTab(), "");
		BaseTest.test.info("Clicked on Customize My Tab");
		//Assert.assertTrue(um.isCustomizeTab(), "");
		BaseTest.test.info("Customize My Tab is Displayed");
		um.SelectCustomApp(driver);
		BaseTest.test.info("Salesforce Chatter is selected");
		Assert.assertTrue(um.addReport(), "");
		BaseTest.test.info("Reports is selected");
		BaseTest.test.info("Add Button clicked");
		BaseTest.test.info("Save button clicked");
		Assert.assertTrue(um.emailSetup(), "");
		BaseTest.test.info("Clicked on Email");
		BaseTest.test.info("Clicked on Email Settings");
		BaseTest.test.info("Bcc is selected");
		BaseTest.test.info("Clicked on Save");
		Assert.assertTrue(um.CalendarReminder(), "");
		BaseTest.test.info("Open Calender and Reminder");
		BaseTest.test.info("Clicked on Activity Reminder");
		BaseTest.test.info("Activity Reminder page is displayed");
		BaseTest.test.info("Clicked on Open a Test Reminder");
		BaseTest.test.info("Open Reminder popup is displayed");
		
		
		
		
	}
}
