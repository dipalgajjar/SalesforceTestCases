package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import utils.CommonUtils;
import utils.FileUtils;

public class TCCreateAccount extends BasePage {
	public TCCreateAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
//	@FindBy(id = "userNavLabel")
//	public WebElement userMenu;
	//=====

	@FindBy(xpath = "//li[@id='Account_Tab']")
	public  WebElement AccountTab;
	
	@FindBy(name = "new")
	public WebElement New;
	
	@FindBy(xpath = "//*[@id='acc2']")
	public WebElement Accname;
	
	@FindBy(linkText = "Create New View")
	public WebElement CreateNewView;
	
	@FindBy(name = "save")
	public WebElement Save;
	
	@FindBy(xpath = "//*[@id='fname']")
	public WebElement ViewName;
	
	@FindBy(xpath = "//*[@id='devname']")
	public WebElement ViewUniqueName;
	
	@FindBy(linkText = "Edit")
	public WebElement Edit;
	
	@FindBy(xpath = "//input[@id='fval1']")
	public WebElement Value;
	
	@FindBy(linkText = "Merge Accounts")
	public WebElement MergeAcc;
	
	@FindBy(partialLinkText = "Accounts with last activity")
	public WebElement CreateAccReport;
	
	@FindBy(name = "dateColumn")
	public WebElement createdate;

	@FindBy(xpath = "//div[text()='Created Date']")
	public WebElement SelectCreatedDate;
	
	@FindBy(name = "startDate")
	public WebElement startDate;

	@FindBy(name = "endDate")
	public WebElement enddate;
	
	@FindBy(name = "reportName")
	public WebElement reportName;
	
	@FindBy(xpath = "//*[@id='ext-gen49']")
	public WebElement save;
	
	
	@FindBy(name = "ChangeReportName")
	public WebElement ChangeReportName;
	
	@FindBy(id = "saveReportDlg_reportNameField")
	public WebElement saveReportName;
	
	@FindBy(id = "saveReportDlg_DeveloperName")
	public WebElement saveReportUniqueName;
	
	@FindBy(xpath = "//button[text()='Save and Run Report']")
	public WebElement saveAndrun;
	
	@FindBy(css = "x-window-footer x-panel-btns")
	public WebElement saveAndrunDlg;
	
	//=====TC10=====//
	
	public boolean AccountTab() throws IOException{
		boolean isAccountTab = false;
		if(AccountTab.isDisplayed()) {
			AccountTab.click();
			isAccountTab = true;
		}
		return isAccountTab;
	}
	
	public boolean NewAcc() throws IOException{
		boolean isNewAcc = false;
		if(New.isDisplayed()) {
			New.click();
			isNewAcc = true;
		}
		return isNewAcc;
	}
	
	public void SelectType(WebDriver driver) throws IOException, InterruptedException{
		WebElement dropDown = driver.findElement(By.id("acc6"));
		Select type = new Select(dropDown);
		type.selectByIndex(6);
	}
	
	public void SelectPriority(WebDriver driver) throws IOException, InterruptedException{
		WebElement priority = driver.findElement(By.id("00NHu00000PENBV"));
		Select type = new Select(priority);
		type.selectByIndex(1);
	}
	
	
	//=====TC10 End====//
	
	//=====TC11======//
	public boolean NewAccView() throws IOException{
		boolean isNewAccView = false;
		if(CreateNewView.isDisplayed()) {
			CreateNewView.click();
			isNewAccView = true;
		}
		if(Save.isDisplayed()) {
			Save.click();
			isNewAccView = true;
		}
		return isNewAccView;
	}
	
	public boolean Save() throws IOException{
		boolean isSave = false;
		if(Save.isDisplayed()) {
			Save.click();
			isSave = true;
		}
		return isSave;
	}
	//=====TC11 End==//
	
	//======TC12=====//
	public void ViewName(WebDriver driver) throws IOException, InterruptedException{
		WebElement ViewdropDown = driver.findElement(By.xpath("//*[@id='fcf']"));
		Select type = new Select(ViewdropDown);
		type.selectByIndex(2);
	}
	
	public boolean Edit() throws IOException{
		boolean isedit = false;
		if(Edit.isDisplayed()) {
			Edit.click();
			isedit = true;
		}
		return isedit;
	}
	
	public void Field(WebDriver driver) throws IOException, InterruptedException{
		WebElement fieldDropDown = driver.findElement(By.id("fcol1"));
		Select type = new Select(fieldDropDown);
		type.selectByIndex(1);
	}
	
	public void Operator(WebDriver driver) throws IOException, InterruptedException{
		WebElement optdDropDown = driver.findElement(By.id("fop2"));
		Select type = new Select(optdDropDown);
		type.selectByIndex(3);
	}
	
	public void Value(WebDriver driver) throws IOException, InterruptedException{
		WebElement optdDropDown = driver.findElement(By.id("fop2"));
		Select type = new Select(optdDropDown);
		type.selectByIndex(3);
	}
	
	
	//===TC12 End====//
	
	//===Tc13=======//
	
	
	

	public boolean MergeAcc() throws IOException{
		boolean isMerge = false;
		if(MergeAcc.isDisplayed()) {
			MergeAcc.click();
			isMerge = true;
		}
		return isMerge;
	}
	//====TC13 End====//
	
	//===Tc14=======//
	public boolean CreateAccReport() throws IOException{
		boolean isCreateAccReport = false;
		if(CreateAccReport.isDisplayed()) {
			CreateAccReport.click();
			isCreateAccReport = true;
		}
		
		if(createdate.isDisplayed()) {
			createdate.click();
			isCreateAccReport = true;
		}
		if(SelectCreatedDate.isDisplayed()) {
			SelectCreatedDate.click();
			isCreateAccReport = true;
		}
		
		
		return isCreateAccReport;
	}
	
	public boolean StartDate() throws IOException{
		boolean isdate = false;
		if(startDate.isDisplayed()) {
			startDate.click();
			isdate = true;
		}
		return isdate;
	}
	
	public boolean EndDate() throws IOException{
		boolean isenddate = false;
		if(enddate.isDisplayed()) {
			enddate.click();
			isenddate = true;
		}
		return isenddate;
	}
	
	public boolean SaveReport() throws IOException{
		boolean isSave = false;
		if(save.isDisplayed()) {
			save.click();
			isSave = true;
		}
		return isSave;
	}
	public void clickSaveAndRunBtn(WebDriver driver) {
		CommonUtils.waitForElement(driver, saveAndrunDlg);
		if (saveAndrun.isDisplayed () ) {
			if (CommonUtils.waitForElement(driver, saveAndrun)) {
				saveAndrun.click();
			}
		} 
	}
	//====TC14 End====//
}
//WebElement startdate =  driver.findElement(By.name("startDate"));
//startdate.clear();
//enterText(startdate, "01/04/2019","calenderdata");
//WebElement enddate = driver.findElement(By.name("endDate"));
//enddate.clear();
//enterText(enddate, "03/04/2019", "calenderdata");
//WebElement save = driver.findElement(By.xpath("//button[@id='ext-gen49']"));