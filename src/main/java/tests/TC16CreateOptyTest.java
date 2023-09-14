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
import pages.CreateOptyPage;
import utils.CommonUtils;
import utils.FileUtils;
import pages.TC1LoginPage;


public class TC16CreateOptyTest extends BaseTest{
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
		CreateOptyPage co = new CreateOptyPage(driver);
		Assert.assertTrue(co.ClickOppornity(), "");
		BaseTest.test.info("Clicked on Account Link");
		Assert.assertTrue(co.CreateOpty(), "");
		co.OppName.sendKeys(FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "OppName"));
		co.AccName.sendKeys(FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "AccName"));
		co.CloseDate.sendKeys(FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "CloseDate"));
		co.Probability.sendKeys(FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "Probability"));
		co.PrimaryCaimp.sendKeys(FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "PrimaryCaimp"));
		co.EditOptyPage(driver);
		Assert.assertTrue(co.SaveCreateOpty(), "");
		co.VerifyDetailReport(driver);
		
	}
}
