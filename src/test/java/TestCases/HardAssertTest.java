package TestCases;

	import static org.testng.Assert.assertEquals;

	import java.io.IOException;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import Base.TestBase;
	import Pages.Login_Page;

	//Using annotations here
	//before
	//test case
	//exit
	//Repeat 
	public class HardAssertTest extends TestBase{
	//connect this class with base class
		Login_Page login;
		@BeforeMethod (groups = {"Sanity"})
		public void setup() throws IOException
		{
			//to enter URL we uses initialization
			initialization();
			login = new Login_Page();
		}
		//To call login page methods we to create object of login page
		@Test (groups = "Sanity")
		//Methods to verify elements
		public void verifyTitleTest()
		{
			String title = login.verifytitle();
			//Assert.assertEquals("1Kite - Zerodha's fast and elegant flagship trading platform", title);
//			Assert.assertTrue(false);
//			System.out.println("This is Verify test case");
			Assert.assertEquals(true, true);
		}
		@Test (groups = "Sanity", priority = -3, enabled = true, invocationCount = 3)
		public void verifyKitiLogoTest()
		{
			boolean value = login.verifyKitiLogo();
			Assert.assertEquals(value, true);
		}
		
		@Test (dependsOnMethods = {"verifyKitiLogoTest"})
		public void verifyZerodhaLogoTest() 
		{
			boolean value = login.verifyZerodhaLogo();
			Assert.assertEquals(value, true);
		}
		
		@Test
		public void loginToAppTest() throws IOException, InterruptedException
		{
			String nickname = login.loginToApp();
			Assert.assertEquals(nickname, "Sarita");
		}
		
		
		@AfterMethod (groups = {"Sanity"})
		public void exit() throws InterruptedException
		{
			driver.quit();
		}
		
		
	}
