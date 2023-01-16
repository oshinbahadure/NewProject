package TestCases;


	import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import Base.TestBase;
	import Pages.LoginPage;
import Utility.UtilityMethod;
	public class CaptureScreenshotForFailTC extends TestBase {
	
		LoginPage login;//= new LoginPage();
		@BeforeMethod
		public void setup() throws Exception
		{
			initalization();
			login= new LoginPage();
		}
		
		@Test(enabled=false)
		public void verifyLoginLogoTest()
		{
			boolean result=login.verifyLoginLogo();
			Assert.assertEquals(result, true);
		}
		@Test(enabled=false)
		public void verifyBotLogoTest()
		{
			boolean result=login.verifyBotLogo();
			Assert.assertEquals(result, true);
		}
		
		@Test(enabled=true)
		public void verifyTitleTest() 
		{
			String expTitle="Swag .Labs";//1Wrong
			String actTitle= login.verifyTitle();
			Assert.assertEquals(expTitle, actTitle);
			Reporter.log("Title of web application:-"+actTitle);
		}
		@Test(enabled=false)
		public void verifyCurrentUrl()
		{
			String expCurrentUrl="https://www.saucedemo.com/";
			String actCurrentUrl=login.verifyCurrentUrl();
			Assert.assertEquals(expCurrentUrl, actCurrentUrl);
			
		}
		@Test(enabled=false)
		public void verifyLoginToAppTest() throws Exception 
		{
			String expRes="https://www.saucedemo.com/inventory.html";
			String actRes=login.loginToApp();
			Assert.assertEquals(expRes,actRes);
			Reporter.log("Url of web application :-"+actRes);
		}
		@Test(enabled=false)
		public void verifyLabelofInventoryTest() throws Exception
		{
			String expRes="PRODUCTS";
			String actRes=login.verifyLabelofInventory();
			Assert.assertEquals(expRes,actRes);
			Reporter.log("Label Title :-"+actRes);
		}
		
		@AfterMethod
		public void closeBrowser(ITestResult a) throws Exception
		{
		if(ITestResult.FAILURE==a.getStatus())	
		{
			UtilityMethod.captureScreenshot(a.getName());
		}
			
		driver.close();
		}
		}



