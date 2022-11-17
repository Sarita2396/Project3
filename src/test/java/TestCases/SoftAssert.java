package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Login_Page;

	public class SoftAssert{
		@Test
		public void method1()
	{
			
		SoftAssert s = new SoftAssert();
		System.out.println("Method 1");
		Assert.assertEquals(false, false);
		System.out.println("Method");
		//Assert.assertEquals(false, true);
		System.out.println("Method new");
		Assert.assertEquals(400, 402);
		System.out.println("Method 1 ended");

	}
		
			@Test
			public void method2()
		{
				System.out.println("Method 2");	
			Assert.assertEquals(false, false);
		

		}
			
			
		
			
	}
