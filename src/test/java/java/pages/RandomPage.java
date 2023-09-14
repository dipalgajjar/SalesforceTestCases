package pages;

import java.io.IOException;
import java.security.PublicKey;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import constants.FileConstants;
import utils.CommonUtils;
import utils.FileUtils;


public class RandomPage extends BasePage{
	public RandomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id = "home_Tab")
	public WebElement Home;
	
	@FindBy(xpath = "//h1[@class='currentStatusUserName']/a")
	public WebElement AccName;
	
	@FindBy(id = "profileTab_sfdc.ProfilePlatformFeed")
	public WebElement profilePage;
	
	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']")
	public WebElement editContactButton;

	@FindBy(id = "aboutTab")
	public WebElement Abouttab;
	
	@FindBy(id = "firstName")
	public WebElement FName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement Abouttablastname;
	
	@FindBy(xpath = "//*[@value='Save All']")
	public WebElement saveAllButton;
	
	@FindBy(xpath = "//*[@id=\"tailBreadcrumbNode\"]")
	public WebElement Userprofilepagenamedisplay;
	
	@FindBy(xpath = "//*[@id=\"userNavLabel\"]")
	public WebElement UsermanuName;
	
	@FindBy(xpath = "//img[@title='All Tabs']")
	public WebElement AllTab;
	
	@FindBy(name = "customize")
	public WebElement Customize;
	
	@FindBy(id = "duel_select_0_left")
	public WebElement Remove;
	
	@FindBy(name = "save")
	public WebElement Save;
	
	@FindBy(xpath = "//span[@class='pageDescription']/a")
	public WebElement CurrentDate;
	
	@FindBy(linkText = "8:00 AM")
	public WebElement EightAM;
	
	@FindBy(xpath = "//*[@id='ep']/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img")
	public WebElement SubjectIcon;
	
	@FindBy(linkText = "Other")
	public WebElement Other;
	
	@FindBy(xpath = "//*[@id=\"EndDateTime_time\"]")
	public WebElement EndTime;
	
	@FindBy(xpath = "//*[@id='timePickerItem_42']")
	public WebElement NinePM;
	
	@FindBy(xpath = "simpleTimePicker")
	public WebElement TimePicker;
	
	
	@FindBy(linkText = "4:00 PM")
	public WebElement FourPM;
	
	@FindBy(xpath = "//*[@id='timePickerItem_38']")
	public WebElement SevenPM;
	
	@FindBy(xpath = "//input[@id='IsRecurrence']")
	public WebElement Recurrence;
	
	@FindBy(xpath = "//input[@id='rectypeftw']")
	public WebElement Weekly;
	
	@FindBy(xpath = "//span[@class=\"dwmIcons\"]/a[3]")
	public WebElement MonthView;
	
	
	public boolean ClickOnHome() throws IOException {
		boolean isHome = false;
		if (Home.isDisplayed()) {
			Home.click();
			isHome = true;
		}
		return isHome;
	}
	public boolean VerifyAccName() throws IOException {
		boolean isAccName = false;
		if (AccName.isDisplayed()) {
			isAccName = true;
			System.out.println("Account Name " + AccName.getText() + " is Displayed");
			AccName.click();
		}
		else {
			System.out.println("Account Name is not Displayed");
		}
		return isAccName;
	}
	
	public boolean isAccPageVisible() {
		return profilePage.isDisplayed();
	}
	
	public boolean verifyAboutTab(WebDriver driver) {
		boolean isAboutTab = false;
		boolean isLastNameVerified = false;
		boolean isUserMenuname = false;
		if(Abouttab.isDisplayed()) {
			Abouttab.click();
			isAboutTab = true;
			if(FName.isSelected()) {
				System.out.println("Focus is on First Name");
			}
			else {
				System.out.println("Focus is not on First Name");
			}
			Abouttablastname.clear();
			Abouttablastname.sendKeys("Abcd");
			saveAllButton.click();
			driver.switchTo().parentFrame();
			if(Userprofilepagenamedisplay.isDisplayed()) {
				String actualName = Userprofilepagenamedisplay.getText();
				isLastNameVerified = true;
				System.out.println("Last Name is Updated in Acc Page");
			}
			else {
				System.out.println("Last Name is not Updated on Acc Page");
			}
			if(UsermanuName.isDisplayed()) {
				String actualName = Userprofilepagenamedisplay.getText();
				isUserMenuname= true;
				System.out.println("Last Name is Updated in UserMenu");
			}
			else {
				System.out.println("Last Name is not Updated in UserMenu");
			}
			
			
		}
	else {
		System.out.println("UserMenuPage : verifyAboutTab : About tab is not visible");
	}
	return isAboutTab;
		
	}
	public boolean ClickOnAllTab(WebDriver driver) throws IOException {
		boolean isAllTab = false;
		CommonUtils.waitForElement(driver, AllTab);
		if (AllTab.isDisplayed()) {
			AllTab.click();
			isAllTab = true;
		}
		return isAllTab;
	}
	public boolean ClickOnCustomizeTab() throws IOException {
		boolean isCustomizeTab = false;
		if (Customize.isDisplayed()) {
			Customize.click();
			isCustomizeTab = true;
		}
		return isCustomizeTab;
	}
	
	public void SelectedTabs(WebDriver driver) {

		WebElement ListSelectedTab = driver.findElement(By.id("duel_select_1"));  
		Select dropdown = new Select(ListSelectedTab);	
		dropdown.selectByIndex(9);
				
	}
	
	public boolean clickOnRemoveAndSave() throws IOException {
	    boolean isRemoveAndSave = false;

	    try {
	        if (Remove.isDisplayed()) {
	            Remove.click();
	            isRemoveAndSave = true;
	        }
	        if (Save.isDisplayed()) {
	            Save.click();
	            isRemoveAndSave = true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace(); // Handle the exception appropriately, e.g., log it
	    } finally {
	        // Code in this block will always be executed, whether an exception occurs or not
	        // You can use it for cleanup or other necessary actions
	    }

	    return isRemoveAndSave;
	}
	
	public boolean ClickOnCurrentDate() throws IOException {
		boolean isCurrentDate = false;
		if (CurrentDate.isDisplayed()) {
			CurrentDate.click();
			isCurrentDate = true;
		}
		return isCurrentDate;
	}
	
	public boolean ClickOnEightAM() throws IOException {
		boolean isEightAM = false;
		if (EightAM.isDisplayed()) {
			EightAM.click();
			isEightAM = true;
		}
		return isEightAM;
	}
	public boolean ClickOnSubjectIcon(WebDriver driver) throws IOException {
		boolean isSubjectIcon = false;
		if (SubjectIcon.isDisplayed()) {
			SubjectIcon.click();
			isSubjectIcon = true;
			String currentWindowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			windowHandles.remove(currentWindowHandle);
			driver.switchTo().window(windowHandles.iterator().next());
			if (Other.isDisplayed()) {
				Other.click();
	
			}
			driver.switchTo().window(currentWindowHandle);
			
		}
		return isSubjectIcon;
	}
	
	public boolean ClickOnOther() throws IOException {
		boolean isOther = false;
		if (Other.isDisplayed()) {
			Other.click();
			isOther = true;
		}
		return isOther;
	}
	public boolean ClickOnEndTime(WebDriver driver) throws IOException {
		boolean isEndTime = false;
		
		if (EndTime.isDisplayed()) {
			EndTime.click();
			isEndTime = true;
		}
		WebElement dropdown = driver.findElement(By.id("simpleTimePicker"));

        // Click on the dropdown to open it
			if (dropdown.isDisplayed()) {
				dropdown.click();
				isEndTime = true;
			}

        // Locate and click the specific time option (e.g., '9:00 PM') within the dropdown
       // WebElement timeOption = driver.findElement(By.xpath("//div[@id='simpleTimePicker']//div[text()='9:00 PM']"));
        WebElement timeOption = driver.findElement(By.xpath("//div[@id='simpleTimePicker']//div[text()='9:00 PM']"));
        if (timeOption.isDisplayed()) {
        	timeOption.click();
        	isEndTime = true;
        }
        
		return isEndTime;
	
}		
	public boolean ClickOnSave() throws IOException {
		boolean isSave = false;
		if (Save.isDisplayed()) {
			Save.click();
		//	NinePM.click();
			isSave = true;
		}
		return isSave;
	}

	
	
	public boolean ClickOnFourPM() throws IOException {
		boolean isFourPM = false;
		if (FourPM.isDisplayed()) {
			FourPM.click();
			isFourPM = true;
		}
		return isFourPM;
	}
	
	
	
	public boolean ClickOnEndTimeTC37(WebDriver driver) throws IOException {
		boolean isEndTime = false;
		
		if (EndTime.isDisplayed()) {
			EndTime.click();
			isEndTime = true;
		}
		WebElement dropdown = driver.findElement(By.id("simpleTimePicker"));

        // Click on the dropdown to open it
			if (dropdown.isDisplayed()) {
				dropdown.click();
				isEndTime = true;
			}

        // Locate and click the specific time option (e.g., '9:00 PM') within the dropdown
       // WebElement timeOption = driver.findElement(By.xpath("//div[@id='simpleTimePicker']//div[text()='9:00 PM']"));
        WebElement timeOption = driver.findElement(By.xpath("//div[@id='simpleTimePicker']//div[text()='7:00 PM']"));
        if (timeOption.isDisplayed()) {
        	timeOption.click();
        	isEndTime = true;
        }
        
		return isEndTime;
	
}	


	
	public boolean ClickOnRecurrence() throws IOException {
		boolean isRecurrence = false;
		if (Recurrence.isDisplayed()) {
			Recurrence.click();
			isRecurrence = true;
		}
		return isRecurrence;
	}
	
	public boolean ClickOnWeekly() throws IOException {
		boolean isWeekly = false;
		if (Weekly.isDisplayed()) {
			Weekly.click();
			isWeekly = true;
		}
		return isWeekly;
	}
	
	
	
	public void Select2WeekEndDate(WebDriver driver) throws IOException, InterruptedException {
	    WebElement endDateField = driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
	    endDateField.click();
	    LocalDate currentDate = LocalDate.now();
	    LocalDate endDate = currentDate.plusWeeks(2);
	    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    String endDateString = endDate.format(dateFormatter);
//	    WebElement calendar = driver.findElement(By.xpath("//div[@class='datePicker']"));
//	    Thread.sleep(5000);
//	    WebElement selectedDate = calendar.findElement(By.xpath("//td[text()='" + endDate.getDayOfMonth() + "']"));
	  //  System.out.print("selectedDate: " + selectedDate.getText());
	   // selectedDate.click();
	    endDateField.sendKeys(endDateString);//	    System.out.print("END Date: " + endDateField.getText());
//	    Thread.sleep(2000);
//	    driver.quit();
	}
	
	public boolean ClickOnMonthView(WebDriver driver) throws IOException {
		boolean isMonthView = false;
		CommonUtils.waitForElement(driver, MonthView);
		CommonUtils.moveToElement(driver, MonthView);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", MonthView);
		isMonthView = true;
		return isMonthView;
	}
	

}
