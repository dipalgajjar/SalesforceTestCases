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

public class TC15VreateOptyTest extends BaseTest{
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
		co.verifyOpportunitiesItemData(driver);
	}
}
