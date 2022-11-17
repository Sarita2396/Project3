package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Login_Page extends TestBase{
	
	//Object Repository
	@FindBy(xpath="//img[@alt='Kite']")private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement zerodhaLogo;
	@FindBy(xpath="//input[@id='userid']") private WebElement userIdTestBox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTestBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath="//input[@id='pin']") private WebElement pinTextBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueBtn;
	@FindBy(xpath="//span[@class='nickname']") private WebElement nickNameLable;
	@FindBy(xpath="") private WebElement var;
	@FindBy(xpath="") private WebElement var1;
	@FindBy(xpath="") private WebElement var3;
	@FindBy(xpath="") private WebElement var4;
	
	//constructor = initialization and this = to access current class members
	//Make WebDriver public to access anywhere & also make it static to get single copy
	public Login_Page()
	{
		PageFactory.initElements(driver, this);
	}

	//Method to verify
	public String verifytitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyKitiLogo()
	{
		return kiteLogo.isDisplayed();
	}
	
	public boolean verifyZerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	
	
    public String loginToApp() throws IOException, InterruptedException
    {
    	userIdTestBox.sendKeys(readPropertyFile("Username"));
    	passwordTestBox.sendKeys(readPropertyFile("Password"));
    	loginBtn.click();
    	Thread.sleep(2000);
    	pinTextBox.sendKeys(readPropertyFile("Pin"));
    	continueBtn.click();
    	Thread.sleep(2000);
    	return nickNameLable.getText();
    }
    
    
    
    
    
    
    
	
}
