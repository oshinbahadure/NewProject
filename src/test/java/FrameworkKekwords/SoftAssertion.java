package FrameworkKekwords;

	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
	
	public class SoftAssertion extends TestBase{
		LoginPage login;
		InventoryPage invent;
		
		@BeforeMethod
		public void Setup() throws Exception
		{
			initalization();
		 login =new LoginPage();
		invent = new InventoryPage();
		login.loginToApp();
		}
	
		@Test(enabled=true)
		public void verifyPeekLogoTest()
		{
			System.out.println("Execution started");
			SoftAssert soft=new SoftAssert();
			boolean result = invent.verifyPeekLogo();
			soft.assertEquals(result, false);
			System.out.println("Execution ended");
			soft.assertAll();
		}
		
		@AfterMethod
		public void closeBrowser()
		{
			driver.close();
				
			
		}

	}
