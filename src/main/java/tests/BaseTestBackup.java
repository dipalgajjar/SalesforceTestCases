package tests;
import java.io.File;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import constants.FileConstants;



public class BaseTestBackup {
private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
	
	
//	Requirements
//	Cross browser support
//	Parallel support -
//	Proper reporting - Accurate Assertion, Screenshots
//	Support of Logs in the framework
	

	static ExtentReports extent = new ExtentReports();
	static ExtentSparkReporter  spark =  null;
	public static ExtentTest test = null;
	
	public static Logger logger = LogManager.getLogger("BASETEST");


	@BeforeMethod
	public static void setDriver(Method name) {
		BaseTestBackup.test = extent.createTest(name.getName());
		logger.info("BaseTest : setup : "+ name.getName()+" Test Object for reporting is created");
	}

	@BeforeTest
	public static void setDriver() {
		spark = new ExtentSparkReporter(new File(FileConstants.REPORT_PATH));
		extent.attachReporter(spark);
		WebDriver driver = BaseTestBackup.getBrowserType("chrome", true);
		threadLocalDriver.set(driver);

	}
	public static WebDriver getDriver() {
		return threadLocalDriver.get();
	}
	
	@AfterTest
	public static void removeDriver() {
		getDriver().close();
		threadLocalDriver.remove();
		extent.flush();
	}
	
	public static WebDriver getBrowserType(String browserName , boolean headless) {
		
		WebDriver driver;
		
		String browserType = browserName.toLowerCase();
		
		switch (browserType) {
		case "chrome":
			driver = new ChromeDriver();
//			if(headless) {
//				ChromeOptions co = new ChromeOptions();
//				co.addArguments("--headless");
//				driver = new ChromeDriver(co);
//			}
//			else {
//				driver = new ChromeDriver();
//			}
		break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;	
			
		case "egde":
			driver = new EdgeDriver();
			break;
					
		default:
			driver = null;
			break;
		}
		
		return driver;
		
	}
}
