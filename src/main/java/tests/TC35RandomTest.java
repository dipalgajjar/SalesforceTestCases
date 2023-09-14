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
import pages.RandomPage;
import pages.ContactPage;
import utils.CommonUtils;
import utils.FileUtils;
import pages.TC1LoginPage;

public class TC35RandomTest extends BaseTest{
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
		RandomPage rp = new RandomPage(driver);
		TC2UserNavMenu um = new TC2UserNavMenu(driver);
		Assert.assertTrue(rp.ClickOnAllTab(driver), "");
		Assert.assertTrue(rp.ClickOnCustomizeTab(), "Click On Customize My Tab");
		rp.SelectedTabs(driver);
		Assert.assertTrue(rp.clickOnRemoveAndSave(), "Click On Remove Button");
		
	}
}



