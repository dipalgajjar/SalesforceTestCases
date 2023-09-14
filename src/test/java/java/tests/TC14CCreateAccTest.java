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
import pages.TCCreateAccount;
import utils.CommonUtils;
import utils.FileUtils;
import pages.TC1LoginPage;

public class TC14CCreateAccTest extends BaseTest{
	WebDriver driver = BaseTest.getDriver();
	TCCreateAccount ca = new TCCreateAccount(driver);
	@BeforeClass
	public void navigateToHome() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		TC1LoginPage lp = new TC1LoginPage(driver);
		lp.loginToApp(driver);
	}
	
	@Test
	public void AccountLink(Method name) throws IOException, InterruptedException {	
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");	
		TCCreateAccount ca = new TCCreateAccount(driver);
		Assert.assertTrue(ca.AccountTab(), "");
		BaseTest.test.info("Clicked on Account Link");	
		Assert.assertTrue(ca.CreateAccReport(), "");
		BaseTest.test.info("Clicked on Create Account Report Link");
		Assert.assertTrue(ca.StartDate(), "");
		BaseTest.test.info("Start date clicked");
		ca.startDate.sendKeys("9/6/2023");
		Assert.assertTrue(ca.EndDate(), "");
		ca.enddate.clear();
		ca.enddate.sendKeys("9/7/2023");
		Assert.assertTrue(ca.SaveReport(), "");
		ca.saveReportName.sendKeys(FileUtils.readPropertiesFile(FileConstants.ACC_TESTDATA_FILE_PATH, "viewname"));
		ca.saveReportUniqueName.sendKeys(FileUtils.readPropertiesFile(FileConstants.ACC_TESTDATA_FILE_PATH, "viewname"));
		ca.clickSaveAndRunBtn(driver);
	}

	

}
