package tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;



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

public class TC2UserMenuNavTest extends BaseTest{
	
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
		Assert.assertTrue(um.selectMyProfile(), "");
		BaseTest.test.info("Selected my profile");
		CommonUtils.waitForElement(driver, um.profilePage);
		BaseTest.test.info("profile page loaded");
		Assert.assertTrue(um.isProfilePageVisible(), "");
		um.selectEditContact(driver);
		Assert.assertTrue(um.verifyEditContactPopUp(driver), "");
		BaseTest.test.info("Edit contact pop up verified");
		Assert.assertTrue(um.verifyLastNameChangeInAboutTab(driver, "Ga"), "");
		BaseTest.test.info("Verified last name change");
		
		//error
		
//		Assert.assertTrue(um.verifyCreatePost(driver, "Hello welcome to java"));
//		BaseTest.test.info("Verified create post");
		
		//////
		
//		Thread.sleep(3000);
		Assert.assertTrue(um.verifyFileUpload(driver, FileConstants.LOGIN_TESTDATA_FILE_PATH));
		BaseTest.test.info("Verified file upload");
		Assert.assertTrue(um.verifyPhotoUpload(driver, FileConstants.PROFILE_PHOTO_FILE_PATH));
		BaseTest.test.info("Verified photo upload");
//		um.mySettings.click();
//		um.headerSetupFolder.click();
//		um.loginHistory.click();
//		um.relatedUserLoginHistory.click();
//		um.displayLayout.click();
//		um.customiseTable.click();
//		um.report.click();
//		um.add.click();
//		um.save.click();
//		um.emailSetUp.click();
//		um.emailSettings.click();
//		um.autoBcc.click();
//		um.btnSubmit.click();
//		um.calReminder.click();
//		um.reminderFont.click();
//		um.openTestReminder.click();
//		Duration WAIT_FOR_ELEMENT;
	}
	

}
