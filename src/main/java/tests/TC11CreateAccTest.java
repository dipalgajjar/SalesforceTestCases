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

public class TC11CreateAccTest extends BaseTest{
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
	}
	
	@Test
	public void NewAccView(Method name) throws IOException, InterruptedException {	
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");
		TCCreateAccount ca = new TCCreateAccount(driver);
		Assert.assertTrue(ca.NewAccView(), "");
		BaseTest.test.info("Clicked on Create New View Link");	
		ca.ViewName.sendKeys(FileUtils.readPropertiesFile(FileConstants.ACC_TESTDATA_FILE_PATH, "viewname"));
		ca.ViewUniqueName.sendKeys(FileUtils.readPropertiesFile(FileConstants.ACC_TESTDATA_FILE_PATH, "viewuniquename"));
		Assert.assertTrue(ca.Save(), "");
	}
}
