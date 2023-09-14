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
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolConfig;
import utils.CommonUtils;
import utils.FileUtils;


public class ContactPage extends BasePage{
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(linkText ="Contacts")
	public  WebElement Contacts;
	
	@FindBy(name = "new")
	public WebElement Newbtn;
	
	@FindBy(id = "name_lastcon2")
	public WebElement LastName;
	
	@FindBy(id = "con4")
	public WebElement AccName;
	
	@FindBy(name = "save")
	public WebElement Save;
	
	@FindBy(linkText ="Create New View")
	public  WebElement CreateNewView;
	
	@FindBy(id ="fname")
	public  WebElement ViewName;
	
	@FindBy(id ="devname")
	public  WebElement UniqVueName;
	
	@FindBy(xpath ="//*[@id='editPage']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]")
	public  WebElement ErrorMsg;
	
	@FindBy(name ="cancel")
	public  WebElement Cancel;
	
	@FindBy(name ="save_new")
	public  WebElement SaveAndNew;
	
	
	public boolean ContactsTab() throws IOException{
		boolean isContacts = false;
		if(Contacts.isDisplayed()) {
			Contacts.click();
			isContacts = true;
		}
		return isContacts;
	}
	
	public boolean ClickOnNew() throws IOException{
		boolean isNew = false;
		if(Newbtn.isDisplayed()) {
			Newbtn.click();
			isNew = true;
		}
		return isNew;
	}

	
	public boolean ClickOnSave() throws IOException{
		boolean isSave = false;
		if(Save.isDisplayed()) {
			Save.click();
			isSave = true;
		}
		return isSave;
	}
	
	public boolean ClickOnNewView() throws IOException{
		boolean isNewView = false;
		if(CreateNewView.isDisplayed()) {
			CreateNewView.click();
			isNewView = true;
		}
		return isNewView;
	}
	
	/*----Not working correctly------*/
	
	public void VerifyUniqueName(WebDriver driver) throws IOException, InterruptedException{
		CommonUtils.waitForElement(driver, UniqVueName);
		if(UniqVueName.isDisplayed()) {
			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			actions.moveToElement(UniqVueName).perform();
			System.out.println("Uniq View name is:" + UniqVueName.getAttribute("value"));
			if(!UniqVueName.getAttribute("value").isEmpty()) {
				Thread.sleep(3000);
				System.out.println("Unique View Name is Entered Automatically");
				Thread.sleep(3000);
			}
			else {
				System.out.println("Unique View Name is not Entered Automatically");
			}
		}
	
	}
	
	public void selectRecentDropDown(WebDriver driver) throws IOException, InterruptedException{
		WebElement RecentDropDown = driver.findElement(By.id("hotlist_mode"));
		Select selectRecentDrp = new Select(RecentDropDown);
		selectRecentDrp.selectByIndex(0);
	}
	
	public void selectMyContacts(WebDriver driver) throws IOException, InterruptedException{
		WebElement myContactDropDown = driver.findElement(By.id("fcf"));
		Select selectMyConcatDrp = new Select(myContactDropDown);
		selectMyConcatDrp.selectByIndex(8);
	}
	
	public void ClickOnCotactName(WebDriver driver) throws IOException, InterruptedException{
		Actions action = new Actions(driver);
	    WebElement element = driver.findElement(By.xpath("//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
	    action.moveToElement(element).click().perform();
	}
	
	public void VerifyErrorMsg() throws IOException,InterruptedException{

			if(ErrorMsg.isDisplayed()) {
				System.out.println("Error Meaage - Error: You must enter a value. is Displayed");
			}
			else {
				System.out.println("Error Message not Displayed");
			}
	}
	
	public boolean ClickOnCancel() throws IOException{
		boolean isCancel = false;
		if(Cancel.isDisplayed()) {
			Cancel.click();
			isCancel = true;
		}
		return isCancel;
	}
	
	public boolean ClickOnSaveAndNew() throws IOException{
		boolean isSaveAndNew = false;
		if(SaveAndNew.isDisplayed()) {
			SaveAndNew.click();
			isSaveAndNew = true;
		}
		return isSaveAndNew;
	}
	
	
	
}
	
	 
