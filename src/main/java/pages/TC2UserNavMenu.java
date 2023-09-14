package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import utils.CommonUtils;
import utils.FileUtils;

public class TC2UserNavMenu extends BasePage{
	public TC2UserNavMenu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id = "username")
	public WebElement username;
	
	@FindBy(id = "password" )
	public WebElement password;
	
	@FindBy(id = "Login" )
	public WebElement loginButton;
	
	@FindBy(id = "userNavButton")
	public WebElement usernavbtn;
	
	@FindBy(id = "userNavLabel")
	public WebElement userMenu;
	//=====

	@FindBy(xpath = "//div[@id='userNav-menuItems']/a")
	public List<WebElement> userMenuOptions;

	@FindBy(xpath = "//a[@title='My Profile']")
	public WebElement MyProfile;

	@FindBy(xpath = "//a[@title='My Settings']")
	public WebElement MySettings;

	@FindBy(partialLinkText = "Developer Console")
	public WebElement DevelopersConsole;

	@FindBy(id = "userNav-menuItems/a[4]")
	public WebElement SwitchtoLightningExperience;

	

	// My profile
	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']")
	public WebElement editContactButton;

	@FindBy(xpath = "//div/h2[@id='contactInfoTitle']")
	public WebElement EditProfilePopupwindow;

	@FindBy(id = "aboutTab")
	public WebElement Abouttab;

	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement Abouttablastname;
	
	@FindBy(id = "profileTab_sfdc.ProfilePlatformFeed")
	public WebElement profilePage;
	
	@FindBy(id = "contactInfoContentId")
	public WebElement iframeAboutTab;
	
	@FindBy(id = "contactTab")
	public WebElement contactTab;
	
	@FindBy(xpath = "//*[@value='Save All']")
	public WebElement saveAllButton;
	
	@FindBy(xpath = "//*[@id=\"tailBreadcrumbNode\"]")
	public WebElement Userprofilepagenamedisplay;
	
	// Postlink
	@FindBy(css = "#publishereditablearea")
	public WebElement postLink;

	@FindBy(xpath = "/html/body")
	public WebElement postTextArea;
	
	@FindBy(xpath = "//input[@id='publishersharebutton']")
	public WebElement shareButton;
	
	// Calendar and Remainders
		@FindBy(id = "CalendarAndReminders_font")
		public WebElement CalendarAndReminders;

		@FindBy(xpath = "//*[@id='Reminders_font']")
		public WebElement ActivityRemainder;

		@FindBy(id = "testbtn")
		public WebElement OpenaTestRemainder;

		@FindBy(xpath = "//*[@id=\"summary\"]")
		public WebElement SampleEventPopup;

		@FindBy(css = "#displayBadge")
		public WebElement moderatorButton;


		@FindBy(xpath = "//div[@class='cxfeeditem feeditem'][1]//p")
		public WebElement firstPostText;

		@FindBy(xpath = "(//*[@class='contentFileTitle'])[1]")
		public WebElement verifyFilePostElement;

		@FindBy(name = "j_id0:waitingForm")
		public WebElement spinnerIcon;
		
		@FindBy(id = "cropWaitingPage:croppingForm")
		public WebElement spinnerWhileCropping;
		
		@FindBy(id = "progressIcon")
		public WebElement fileUploadSpinner;
	
	// filelink

		@FindBy(xpath = "//*[@id='publisherAttachContentPost']")
		public WebElement filelink;

		@FindBy(xpath = "//a[@id='publisherAttachContentPost']/span[1]")
		public WebElement contentpost;

		@FindBy(css = "#chatterUploadFileAction")
		public WebElement Uploadfile;

		@FindBy(css = "#chatterFile")
		public WebElement Fileopen;

		@FindBy(css = "#publishersharebutton")
		public WebElement publish;

		@FindBy(xpath = "//input[@value='Cancel Upload']")
		public WebElement cancelUpload;

		@FindBy(id = "uploadLink")
		public WebElement updateButton;
		// Photo link

		@FindBy(xpath = "//*[@id=\"publisherAttachLinkPost\"]/span[1]")
		public WebElement photolink;

		@FindBy(id = "j_id0:uploadFileForm:uploadInputFile")
		public WebElement uploadphoto;

		@FindBy(name = "j_id0:uploadFileForm:uploadBtn")
		public WebElement uploadbutton;

		@FindBy(id = "publishersharebutton")
		public WebElement photosharebutton;

		@FindBy(id = "uploadPhotoContentId")
		public WebElement photoUploadIframe;

		@FindBy(xpath = "//input[@id='j_id0:uploadFileForm:uploadBtn']")
		public WebElement photoSaveButton;

		@FindBy(xpath = "//input[@id='j_id0:j_id7:save']")
		public WebElement photoSaveButton2;

	
//========

	//===TC7========
	@FindBy(xpath = "//*[@id='PersonalInfo']/a" )
	public WebElement PersonalInfo;
	
	@FindBy(xpath = "//a[@id='LoginHistory_font']" )
	public WebElement LoginHistory;
	
	@FindBy(xpath = "//div[@id='RelatedUserLoginHistoryList']" )
	public WebElement RelatedUserLoginHistoryList;
	
	@FindBy(xpath = "//div[@id='detailList']" )
	public WebElement detailList;
	
	@FindBy(xpath = "//*[@id='p4']" )
	public WebElement CustomAppdropDown;
	
	
	
	//===TC7 End====
		

	
	@FindBy(xpath = "//a[@class='header setupFolder']" )
	public WebElement headerSetupFolder;
	
	@FindBy(xpath = "//a[@id='LoginHistory_font']" )
	public WebElement loginHistory;
	
	@FindBy(xpath = "//*[@id='RelatedUserLoginHistoryList_body']/div/a" )
	public WebElement relatedUserLoginHistory;
	
	@FindBy(xpath = "//*[@id='DisplayAndLayout_font']" )
	public WebElement displayLayout;
	
	@FindBy(xpath = "//a[@id='CustomizeTabs_font']" )
	public WebElement customiseTable;
	
	@FindBy(xpath = "//*[@id='duel_select_0']/option[@value='report']" )
	public WebElement report;
	
	@FindBy(xpath = "//img[@title='Add']" )
	public WebElement add;
	
	@FindBy(xpath = "//input[@title='Save']" )
	public WebElement save;
	
	@FindBy(xpath = "//*[@id='EmailSetup_font']" )
	public WebElement emailSetUp;
	
	@FindBy(xpath = "//*[@id='EmailSettings_font']" )
	public WebElement emailSettings;
	
	@FindBy(xpath = "//input[@id='auto_bcc1']" )
	public WebElement autoBcc;
	
	@FindBy(xpath = "//*[@id='CalendarAndReminders_font']" )
	public WebElement calReminder;
	
	@FindBy(xpath = "//*[@id='Reminders_font']" )
	public WebElement reminderFont;
	
	@FindBy(xpath = "//input[@title='Open a Test Reminder']" )
	public WebElement openTestReminder;
	
	@FindBy(xpath = "//input[@type='submit']" )
	public WebElement  btnSubmit;
	
	public boolean selectOptionFromUserMenuOptions(WebDriver driver, String sOption) {
		boolean isOptionSelected = false;
		if (userMenu.isDisplayed()) {
			userMenu.click();
		}
		WebElement userMenuItem = driver.findElement(By.xpath("//*[text()='" + sOption + "']"));
		if (userMenuItem.isDisplayed()) {
			userMenuItem.click();
			isOptionSelected = true;
		}
		return isOptionSelected;
	}
	
	public boolean  verifyUserMenuItems() throws IOException {
		logger.info("userMenupage : UserMenuitems Veriication: started");
		boolean isOptionsVerified = true;
		String[] usermenuItems = FileUtils.readUserMenuTestData("usermenu.items").split(",");
		for(int i=0;i<usermenuItems.length;i++) {
			String actualoption = userMenuOptions.get(i).getText();
			if (usermenuItems[i].equals(actualoption)) {
				System.out.println("Expected Option " + usermenuItems[i] + " Actual Option" + actualoption);
			} else {
				logger.warn("UserMenuPage : verifyUserMenuItems : Failed to match the order of usermenu");
				System.out.println("Expected Option " + usermenuItems[i] + "failed to match with Actual Option"
						+ actualoption);
				isOptionsVerified = false;
			}
		}  
		return isOptionsVerified;
	}
	
	public boolean selectMyProfile() throws IOException {
//		return this.selectOptionFromUserMenuOptions(driver, FileUtils.readUserMenuTestData("usermenu.item.profile"));
		boolean isSelected = false;
		if (MyProfile.isDisplayed()) {
			MyProfile.click();
			isSelected = true;
		}
		return isSelected;

	}
	
	
	
	
	
	public boolean isProfilePageVisible() {
		return profilePage.isDisplayed();
	}
	public void selectEditContact(WebDriver driver) {
		if(CommonUtils.waitForElement(driver, editContactButton)) {
			editContactButton.click();
		}
	}
	
	public boolean verifyEditContactPopUp(WebDriver driver) {
		boolean isContactPopUpVerified = false;

		if (CommonUtils.waitForElement(driver, iframeAboutTab)) {
			driver.switchTo().frame(iframeAboutTab);

			if (Abouttab.isDisplayed() && contactTab.isDisplayed()) {
				isContactPopUpVerified = true;
			}
		}
		// NOTE: Maybe required to switch to parent frame
		return isContactPopUpVerified;
	}
	
	public boolean verifyLastNameChangeInAboutTab(WebDriver driver, String sLastName) {
		boolean isLastNameVerified = false;
		if(Abouttab.isDisplayed()) {
			Abouttab.click();
			Abouttablastname.clear();
			Abouttablastname.sendKeys(sLastName);
			saveAllButton.click();
			driver.switchTo().parentFrame();
			if(Userprofilepagenamedisplay.isDisplayed()) {
				String actualName = Userprofilepagenamedisplay.getText();
				isLastNameVerified = true;
			}
		}
	else {
		System.out.println("UserMenuPage : verifyLastNameChangeInAboutTab : About tab is not visible");
	}
	return isLastNameVerified;
		
	}
	
	public boolean verifyCreatePost(WebDriver driver, String sMessageToPost) throws InterruptedException {
		boolean verifyCreatePost = false;
		if (CommonUtils.waitForElement(driver, postLink)) {
			postLink.click();
			driver.switchTo().frame(0);
			postTextArea.sendKeys(sMessageToPost);
			if (shareButton.isDisplayed()) {
				shareButton.click();
//				Thread.sleep(2000); // this to be replaced with invisibility of an element
				CommonUtils.waitForElementToDisappear(driver, shareButton);
			}
			verifyCreatePost = true;
		}
		return verifyCreatePost;
	}
	 
	public boolean verifyFileUpload(WebDriver driver, String sFilePath) throws InterruptedException {

		boolean isFileUploadSuccess = false;
		if (CommonUtils.waitForElement(driver, filelink)) {
			filelink.click();
			if (CommonUtils.waitForElement(driver, Uploadfile)) {
				Uploadfile.click();
			}
			if (CommonUtils.waitForElement(driver, Fileopen)) {
				Fileopen.sendKeys(sFilePath);
				shareButton.click();
//				Thread.sleep(WaitConstants.WAIT_FOR_UPLOAD_TO_FINISH);
				if (CommonUtils.waitForElementToDisappear(driver, cancelUpload)) {
					if (verifyFilePostElement.isDisplayed()) {
						isFileUploadSuccess = true;
					}
				}
			}
		}
		return isFileUploadSuccess;
	}
	
	public void clickOnUpdatePhotoButton(WebDriver driver) {
		CommonUtils.moveToElement(driver, moderatorButton);
		if (updateButton.isDisplayed()) {
			updateButton.click();
		}
	}
	
	public boolean verifyPhotoUpload(WebDriver driver, String sPhotoPath) throws InterruptedException {
		boolean isUploadSuccess = false;
		clickOnUpdatePhotoButton(driver);
		driver.switchTo().frame(photoUploadIframe);
		if (CommonUtils.waitForElement(driver, uploadphoto)) {
			uploadphoto.sendKeys(sPhotoPath);
			photoSaveButton.click();

//			Thread.sleep(4000);
		}
		if (CommonUtils.waitForElementToDisappear(driver, spinnerIcon)
				&& CommonUtils.waitForElement(driver, photoSaveButton2)) {
			photoSaveButton2.click();
//			Thread.sleep(4000);
			if(CommonUtils.waitForElementToDisappear(driver, spinnerWhileCropping)) {
				isUploadSuccess = true;
			}
		}
		driver.switchTo().parentFrame();
		return isUploadSuccess;
	}

	
	public String selectRandomOption() {
		return "Option Value";
	}
	
	
	//====TC7=====
	public boolean selectSettings() throws IOException {
		boolean isSelected = false;
		if (MySettings.isDisplayed()) {
			MySettings.click();
			isSelected = true;
		}
		return isSelected;
	}
	
	public boolean PersonalInfo() throws IOException {
//		return this.selectOptionFromUserMenuOptions(driver, FileUtils.readUserMenuTestData("usermenu.item.profile"));
		boolean isPersonalInfo = false;
		if (PersonalInfo.isDisplayed()) {
			PersonalInfo.click();
			isPersonalInfo = true;
		}
		return isPersonalInfo;
	}
	
	public boolean LoginHistory() throws IOException{
		boolean isLoginHistory = false;
		if(LoginHistory.isDisplayed()) {
			LoginHistory.click();
			isLoginHistory = true;
		}
		return isLoginHistory;
	}
	
	public boolean downloadLoginHistory() throws IOException{
		boolean isDownloadHistory = false;
		if(relatedUserLoginHistory.isDisplayed()) {
			relatedUserLoginHistory.click();
			isDownloadHistory = true;
		}
		return isDownloadHistory;
	}
	
	
	public boolean DispalyAndLayout() throws IOException{
		boolean isDisplayLayout = false;
		if(displayLayout.isDisplayed()) {
			displayLayout.click();
			isDisplayLayout = true;
		}
		return isDisplayLayout;
	}
	
	public boolean CustomizeTab() throws IOException{
		boolean iscustomiseTable = false;
		if(customiseTable.isDisplayed()) {
			customiseTable.click();
			iscustomiseTable = true;
		}
		return iscustomiseTable;
	}
	
	
	
	public void SelectCustomApp(WebDriver driver) throws InterruptedException{
		//if(CommonUtils.waitForElement(driver, detailList)) {
			WebElement CustomAppdropDown = driver.findElement(By.xpath("//*[@id='p4']"));
			Select type = new Select(CustomAppdropDown);
			type.selectByIndex(8);

		//}

	}
	 
	public boolean addReport() throws IOException{
		boolean isReport = false;
		
		if(report.isDisplayed()) {
			report.click();
			add.click();
			save.click();
			isReport = true;
		}
		else {
			System.out.println("Report is already added");
		}
		return isReport;
	}
	
	public boolean emailSetup() throws IOException{
		boolean isemailSetUp = false;
		if(emailSetUp.isDisplayed()) {
			emailSetUp.click();
			isemailSetUp = true;
		}
		if(emailSettings.isDisplayed()) {
			emailSettings.click();
			isemailSetUp = true;
		}
		if(!autoBcc.isSelected()) {
			autoBcc.click();
			
		}
		else {
			System.out.println("Bcc is already selected");
		}
		save.click();
		return isemailSetUp;
	}
	
	public boolean CalendarReminder() throws IOException{
		boolean isCalReminder = false;
		if(CalendarAndReminders.isDisplayed()) {
			CalendarAndReminders.click();
			isCalReminder = true;
		}
		if(ActivityRemainder.isDisplayed()) {
			ActivityRemainder.click();
			isCalReminder = true;
		}
		if(OpenaTestRemainder.isDisplayed()) {
			OpenaTestRemainder.click();
			isCalReminder = true;
		}
		return isCalReminder;
	}


	//===TC7 End==
	
	
	
	//=====TC8 ======//
	
	@FindBy(xpath = "/html[@class='x-border-box x-strict x-viewport']")
	public WebElement DevConPopup;

	
	public boolean selectDeveloperConsole() throws IOException , InterruptedException{
		boolean isSelected = false;
		if (DevelopersConsole.isDisplayed()) {
			DevelopersConsole.click();
			isSelected = true;
		}
		return isSelected;
	}
	
	public boolean verifyDeveloporConsolePopup() throws IOException,InterruptedException {
		return DevConPopup.isDisplayed();
	}
	
	//=====TC8 Ends==
	
	
	//=======C9=======//
	@FindBy(xpath = "//a[@title='Logout']")
	public WebElement Logout;
	public boolean Logout() throws IOException , InterruptedException{
		boolean isLogout = false;
		if (Logout.isDisplayed()) {
			Thread. sleep (3000);
			Logout.click();
			Thread. sleep (3000);
			isLogout = true;
		}
		return isLogout;
	}
	
	//====TC9 Ends====//

}
