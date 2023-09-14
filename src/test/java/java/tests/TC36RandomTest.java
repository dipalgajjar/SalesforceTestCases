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

public class TC36RandomTest extends BaseTest{
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
		Assert.assertTrue(rp.ClickOnHome(), "");	
		Assert.assertTrue(rp.ClickOnCurrentDate(), "");	
		Assert.assertTrue(rp.ClickOnEightAM(), "");	
		Assert.assertTrue(rp.ClickOnSubjectIcon(driver), "");	
		//Assert.assertTrue(rp.ClickOnOther(), "");
		Assert.assertTrue(rp.ClickOnEndTime(driver), "");
		//Assert.assertTrue(rp.ClickOnNinePM(driver), "");
		
		Assert.assertTrue(rp.ClickOnSave(), "");
		
	}
}
