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
import pages.ContactPage;
import utils.CommonUtils;
import utils.FileUtils;
import pages.TC1LoginPage;

public class TC26ContactTest extends BaseTest{
	@BeforeClass
	public void navigateToHome() throws IOException {
		WebDriver driver = BaseTest.getDriver();
		TC1LoginPage lp = new TC1LoginPage(driver);
		lp.loginToApp(driver);
	}
	
	@Test
	public void LeadsTab(Method name) throws IOException, InterruptedException {	
		WebDriver driver = BaseTest.getDriver();
		BaseTest.test.info("Driver configured");	
		ContactPage cp = new ContactPage(driver);
		Assert.assertTrue(cp.ContactsTab(), "");
		Assert.assertTrue(cp.ClickOnNewView(), "");	
		//cp.ViewName.sendKeys(FileUtils.readPropertiesFile(FileConstants.ACC_TESTDATA_FILE_PATH, "viewname"));
		//cp.UniqVueName.sendKeys(FileUtils.readPropertiesFile(FileConstants.ACC_TESTDATA_FILE_PATH, "viewuniquename"));
		cp.ViewName.sendKeys("DipalG");
		cp.VerifyUniqueName(driver);
		Thread.sleep(2000);
		Assert.assertTrue(cp.ClickOnSave(), "");
		
	}
}
