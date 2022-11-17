package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Dashboard;
import Pages.Login_Page;

public class DashboardPageTest extends TestBase{
	
	Login_Page login;
	Dashboard dash;
	@BeforeMethod (groups = {"Sanity", "Regresstion"})
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		login = new Login_Page();
        dash = new Dashboard();
        login.loginToApp();
	}
	
	@Test (timeOut = 3000, groups = "Sanity", invocationCount = 1, priority = 3, enabled = false)
	public void verifyUsernameTest() throws InterruptedException
	{
		System.out.println("Hi");
		String value = dash.verifyUsername();
		Assert.assertEquals(value, "Sarita Dilip Machutre");
	}
	@Test (priority = 2, enabled = true, groups = "regresstion", dependsOnMethods = {"verifyTest"})
	public void verifyEmailIdTest() throws InterruptedException
	{
		String value = dash.verifyEmailId();
		Assert.assertEquals(value, "msarita9623@gmail.com");
	}
	@Test (priority = 3, enabled = true, groups ="Sanity")
	public void placeGttOrderTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		dash.placeGttOrder();
	}
	
	@AfterMethod (groups= {"Sanity", "Regresstion"})
	public void exit()
	{
	      driver.close();
	}
	

}
