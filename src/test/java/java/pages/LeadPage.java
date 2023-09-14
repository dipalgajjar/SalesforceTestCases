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

public class LeadPage extends BasePage{
	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(linkText ="Leads")
	public  WebElement LeadsTab;
	
	@FindBy(name = "go")
	public WebElement Go;
	
	@FindBy(id = "userNavButton")
	public WebElement usernavbtn;
	
	@FindBy(linkText = "Logout")
	public WebElement Logoutbtn;
	
	@FindBy(name = "new")
	public WebElement NewBtn;
	
	@FindBy(name = "name_lastlea2")
	public WebElement LastName;
	
	@FindBy(name = "lea3")
	public WebElement Compname;
	
	@FindBy(name = "save")
	public WebElement Save;
	
	@FindBy(id = "lea2_ileinner")
	public WebElement Lname;
	
	@FindBy(id = "lea3_ileinner")
	public WebElement CoName;
	
	@FindBy(id = "ep")
	public WebElement detail;
	
	
	//===TC20====//
	public boolean LeadsTab() throws IOException{
		boolean isALeadsTab = false;
		if(LeadsTab.isDisplayed()) {
			LeadsTab.click();
			isALeadsTab = true;
		}
		return isALeadsTab;
	}
	//===TC20 End====//
	
	//====TC21===//
	public void VerifyLeadDrp(WebDriver driver) throws IOException{
		try {
		     
            // Locate the <select> element by its ID
            WebElement selectElement = driver.findElement(By.id("fcf"));
            selectElement.click();
            // Create a Select object
            Select dropdown = new Select(selectElement);

            // Get all the options within the dropdown
            java.util.List<WebElement> options = dropdown.getOptions();

            // Expected option values
            String[] expectedOptions = {"All Open Leads", "My Unread Leads", "Recently Viewed Leads", "Today's Leads", "View - Custom 1", "View - Custom 2"};
            //FileUtils.readLeadTestData("lead.items").split(",");
        
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
	//===TC21 End==//
	
	//===Tc22===//
	public void SelectView(WebDriver driver) throws IOException{
		WebElement selectviewDrp = driver.findElement(By.id("fcf"));
		Select viewDrp= new Select(selectviewDrp);
		viewDrp.selectByIndex(1);
		CommonUtils.waitForElement(driver, Go);
		if(Go.isDisplayed()) {
			Go.click();
		}
	}
	//==TC22 End===//
	
	//===TC23====//
	
	public void SelectTodaysView(WebDriver driver) throws IOException{
		WebElement selectTodtyDrp = driver.findElement(By.id("fcf"));
		Select viewTodayDrp= new Select(selectTodtyDrp);
		viewTodayDrp.selectByIndex(3);
		CommonUtils.waitForElement(driver, Go);
		if(Go.isDisplayed()) {
			Go.click();
		}
	}
	//===TC23 End===//
	
	//===TC24====//
	public void CreatNewLead(WebDriver driver) throws IOException{
		if(NewBtn.isDisplayed()) {
			NewBtn.click();
		}
		LastName.sendKeys("abc");
		Compname.sendKeys("abc");
		if(Save.isDisplayed()) {
			Save.click();
		}
	}
	
	public boolean VerifyDetailReport(WebDriver driver) throws IOException{
		boolean isDetail = false;
	 	CommonUtils.waitForElement(driver, detail);
	 	if(detail.isDisplayed()) {
	 		System.out.println("Detail page displayed");
	 		String eleLname = Lname.getText();
	 		String LnameField = "abc";
	 		String eleCoName = CoName.getText();
	 		String CoNameField = "abc";
	 		if(eleLname.equals(LnameField)) {
	 			System.out.println("Lname Name Displayed correctly");
	 		}
	 		else {
	 			System.out.println("Lname Name missing ");
	 		}
	 		if(eleCoName.equals(CoNameField)) {
	 			System.out.println("Company Name Displayed correctly");
	 		}
	 		else {
	 			System.out.println("Company Name missing ");
	 		}
	 		
	 		isDetail = true;

	 	}
	 	else {
	 		System.out.println("Detail page not displayed");
	 	}
	 	
	 	return isDetail;

}
	//===TC24 End===//
	
	
	
	
}
