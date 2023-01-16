package FrameworkKekwords;


	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import Base.TestBase;
	import Pages.LoginPage;

	public class DependsOnMethod extends TestBase {
		LoginPage login;//= new LoginPage();
		@BeforeMethod
		public void setup() throws Exception
		{
			initalization();
			login= new LoginPage();
		}
		
		@Test
		public void verifyTitleTest() 
		{
			String expTitle="Swag Labs";
			String actTitle= login.verifyTitle();
			Assert.assertEquals(expTitle, actTitle);
			Reporter.log("Title of web application:-"+actTitle);
		}
		
		
		@Test(dependsOnMethods="verifyTitleTest")
		public void verifyLoginToAppTest() throws Exception 
		{
			String expRes="https://www.saucedemo.com/inventory.html";
			String actRes=login.loginToApp();
			Assert.assertEquals(expRes,actRes);
			Reporter.log("Url of web application :-"+actRes);
		}
		
		
		@AfterMethod
		public void closeBrowser()
		{
		driver.close();
		}
		}



