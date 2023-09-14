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

import com.github.dockerjava.api.model.Driver;

import constants.FileConstants;
import utils.CommonUtils;
import utils.FileUtils;

public class CreateOptyPage extends BasePage{
	public CreateOptyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(linkText ="Opportunities")
	public  WebElement Opportunities;
	
	@FindBy(name = "new")
	public WebElement New;
	
	@FindBy(xpath = "//*[@id='fcf']/option")
	public WebElement OpportinityItemData;
	
	@FindBy(id = "opp3")
	public WebElement OppName;
	
	@FindBy(id = "opp4")
	public WebElement AccName;
	
	@FindBy(id = "opp9")
	public WebElement CloseDate;
	
	@FindBy(id = "opp11")
	public WebElement StageDropDown;
	
	@FindBy(id = "opp12")
	public WebElement Probability;
	
	@FindBy(id = "opp6")
	public WebElement LeadSource;
	
	@FindBy(name = "opp17")
	public WebElement PrimaryCaimp;
	
	@FindBy(name = "save")
	public WebElement Save;
	
	@FindBy(xpath = "//*[@id='ep']/div[2]")
	public WebElement OptyDetail;
	
	@FindBy(id = "opp3_ileinner")
	public WebElement OptyNameDetail;
	
	@FindBy(id = "opp6_ileinner")
	public WebElement LeadDetail;
	
	@FindBy(id = "opp9_ileinner")
	public WebElement DateDetail;
	
	@FindBy(id = "opp11_ileinner")
	public WebElement StageDetail;
	
	@FindBy(id = "opp12_ileinner")
	public WebElement ProbDetail;
	
	@FindBy(id = "opp4_ileinner")
	public WebElement AccNameDetail;
	
	@FindBy(linkText = "Opportunity Pipeline")
	public WebElement OppPipe;
	
	@FindBy(linkText = "Stuck Opportunities")
	public WebElement StuckOppPipe;
	
	@FindBy(name = "go")
	public WebElement runReport;
	
	//=====TC15======//
	public boolean ClickOppornity() throws IOException{
		boolean isAccountTab = false;
		if(Opportunities.isDisplayed()) {
			Opportunities.click();
			isAccountTab = true;
		}
		return isAccountTab;
	}
	
	public void  verifyOpportunitiesItemData(WebDriver driver) throws IOException {
		try {
     
            // Locate the <select> element by its ID
            WebElement selectElement = driver.findElement(By.id("fcf"));

            // Create a Select object
            Select dropdown = new Select(selectElement);

            // Get all the options within the dropdown
            java.util.List<WebElement> options = dropdown.getOptions();

            // Expected option values
            String[] expectedOptions = {"All Opportunities", "Closing Next Month", "Closing This Month", "My Opportunities", "New Last Week", "New This Week", "Opportunity Pipeline", "Private", "Recently Viewed Opportunities", "Won"};

            boolean allOptionsPresent = true;

            // Verify each expected option is present
            for (String expectedOption : expectedOptions) {
                boolean optionFound = false;

                for (WebElement option : options) {
                    if (option.getText().equals(expectedOption)) {
                        optionFound = true;
                        break;
                    }
                }

                if (!optionFound) {
                    allOptionsPresent = false;
                    System.out.println("Dropdown option '" + expectedOption + "' is NOT available.");
                }
            }

            if (allOptionsPresent) {
                System.out.println("All expected dropdown options are available.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // Close the WebDriver session when done
            driver.quit();
        }

	}	
	//=====TC15 End======//
	
	//===TC16=====//
	public boolean CreateOpty() throws IOException{
		boolean isCreateOpty = false;
		if(New.isDisplayed()) {
			New.click();
			isCreateOpty = true;
		}
		return isCreateOpty;
	}
	
	public void EditOptyPage(WebDriver driver) throws IOException{
		Select SelectstageDropDown = new Select(StageDropDown);
		SelectstageDropDown.selectByIndex(1);
		
		Select SelectLeadDropDown = new Select(LeadSource);
		SelectLeadDropDown.selectByIndex(2);
	}
	
	public boolean SaveCreateOpty() throws IOException{
		boolean isSaveCreateOpty = false;
		if(Save.isDisplayed()) {
			Save.click();
			isSaveCreateOpty = true;
		}
		return isSaveCreateOpty;
	}
	
	public boolean VerifyDetailReport(WebDriver driver) throws IOException{
		boolean isDetail = false;
	 	CommonUtils.waitForElement(driver, OptyDetail);
	 	if(OptyDetail.isDisplayed()) {
	 		System.out.println("Detail page displayed");
	 		String ele = OptyNameDetail.getText();
	 		String OptyNamefield = FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "OppName");
//	 		String AccDetail = FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "AccName");
//	 		String DateDetail = FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "CloseDate");	 		
//	 		//String StageDetail = FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "OppName");
//	 		String ProbDetail = FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "Probability");	 		
//	 		//String AccNameDetail = FileUtils.readPropertiesFile(FileConstants.OPP_TESTDATA_FILE_PATH, "OppName");
	 		if(ele.equals(OptyNamefield)) {
	 			System.out.println("Oportunity Name Displayed");
	 		}
	 		else {
	 			System.out.println("Oportunity Name missing ");
	 		}
	 		isDetail = true;

	 	}
	 	else {
	 		System.out.println("Detail page not displayed");
	 	}
	 	
	 	return isDetail;
	 	
//	 	 WebElement opportunityNameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("OpportunityName")));
//
//	        // Verify that you are on the Opportunity detail page by checking the Opportunity Name or other details
//	        String opportunityName = opportunityNameField.getAttribute("value");
}
	//===TC16 END==//
	
	//===TC17=====//
	public boolean OptyPipe() throws IOException{
		boolean isOptyPipe = false;
		if(OppPipe.isDisplayed()) {
			OppPipe.click();
			isOptyPipe = true;
		}
		return isOptyPipe;
	}	
	//===TC17 End==//
	//===TC18=====//
		public boolean StuckOptyPipe() throws IOException{
			boolean isStuckOptyPipe = false;
			if(StuckOppPipe.isDisplayed()) {
				StuckOppPipe.click();
				isStuckOptyPipe = true;
			}
			return isStuckOptyPipe;
		}	
		//===TC18 End==//
		
		//===TC19=====//
		public void QuaterlySummery(WebDriver driver) throws IOException{
			WebElement QrtSintervalDropDown = driver.findElement(By.xpath("//*[@id='quarter_q']"));
			Select selectSummery= new Select(QrtSintervalDropDown);
			selectSummery.selectByIndex(2);
			
			WebElement openDropDown = driver.findElement(By.xpath("//*[@id='open']"));
			Select opendrp= new Select(openDropDown);
			opendrp.selectByIndex(2);
			
			
		}	
		public boolean runReport() throws IOException{
			boolean isrunReport = false;
			if(runReport.isDisplayed()) {
				runReport.click();
				isrunReport = true;
			}
			return isrunReport;
		}
		
		//===TC19 End==//
}
