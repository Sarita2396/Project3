package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Dashboard extends TestBase{

	@FindBy(xpath="//div[@class='avatar']")private WebElement avtarIcon;
	@FindBy(xpath="//h4[@class='username']")private WebElement username;
	@FindBy(xpath="//div[@class='email']") private WebElement emailId;
	@FindBy(xpath="//button[text()='Start investing ']") private WebElement investBtn;
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement searchBar;
	@FindBy(xpath="//span[@class='tradingsymbol']") private WebElement selectShare;
	@FindBy(xpath="//button[text()='Create GTT ']") private WebElement createGttBtn;
	@FindBy(xpath="//input[@label='Trigger price']") private WebElement triggerPriceTextBox;
	@FindBy(xpath="//input[@label='Qty.']") private WebElement qtyTextBox;
	@FindBy(xpath="//input[@label='Price']") private WebElement priceTextBox;
	@FindBy(xpath="//button[normalize-space(text())='Cancel']") private WebElement cancelBtn;


	public Dashboard()
	{
		PageFactory.initElements(driver, this);
	}
     public String verifyUsername() throws InterruptedException
     {
    	 avtarIcon.click();
    	 Thread.sleep(2000);
    	 return username.getText();
     }

     public String verifyEmailId() throws InterruptedException
     {
    	 
    	 avtarIcon.click();
    	 Thread.sleep(2000);
    	 return emailId.getText();
     }
     
     public void placeGttOrder() throws InterruptedException, EncryptedDocumentException, IOException
     {
    	 investBtn.click();
    	 Thread.sleep(2000);
    	 searchBar.sendKeys(readExcelFile(0,0));
    	 Thread.sleep(2000);
    	 selectShare.click();
    	 Thread.sleep(2000);
    	 createGttBtn.click();
    	 Thread.sleep(2000);
    	 triggerPriceTextBox.clear();
    	 Thread.sleep(2000);
    	 triggerPriceTextBox.sendKeys(readExcelFile(0,1));
    	 Thread.sleep(2000);
    	 qtyTextBox.clear();
    	 Thread.sleep(2000);
    	 qtyTextBox.sendKeys(readExcelFile(0,2));
    	 Thread.sleep(2000);
    	 priceTextBox.clear();
    	 Thread.sleep(2000);
    	 priceTextBox.sendKeys(readExcelFile(0,3));
    	 Thread.sleep(2000);
    	 cancelBtn.click();
     }




}
