package TestCases;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Login_Page;
import Utility.UtilTestBase;

//Using annotations here
//before
//test case
//exit
//Repeat 
public class LoginPageTests extends TestBase{
//connect this class with base class
	Login_Page login;
	@BeforeMethod (groups = {"sanity"})
	public void setup() throws IOException
	{
		//to enter URL we uses initialization
		initialization();
		login = new Login_Page();
	}
	//To call login page methods we to create object of login page
	@Test (dependsOnMethods = {"verifyKitiLogoTest"}, priority =4, timeOut =10, invocationCount = 2, groups = "Sanity")
	//Methods to verify elements
	public void verifyTitleTest()
	{
		String title = login.verifytitle();
		Assert.assertEquals(title, "Kite - Zerodha's fast and elegant flagship trading platform");
	}
	@Test (dependsOnMethods = {"verifyTitleTest"})
	public void verifyKitiLogoTest()
	{
		boolean value = login.verifyKitiLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (dependsOnMethods = {"verifyTitleTest"}, priority = 3, timeOut = 20, invocationCount = 3, enabled = false)
	public void verifyZerodhaLogoTest() 
	{
		boolean value = login.verifyZerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test (dependsOnMethods = {"verifyTitleTest"}, timeOut = 20, groups = "Sanity")
	public void loginToAppTest() throws IOException, InterruptedException
	{
		System.out.println("New updated code");
		String nickname = login.loginToApp();
		Assert.assertEquals(nickname, "Sarita");
	}
	
	
	@AfterMethod (groups = {"sanity"})
	//To take ScreenShot of failed test cases
	public void exit(ITestResult it) throws InterruptedException, IOException
	{
		if(ITestResult.FAILURE==it.getStatus())
		{
			UtilTestBase.screenShot(it.getName());
		}
		driver.quit();
	}
	
	
}
