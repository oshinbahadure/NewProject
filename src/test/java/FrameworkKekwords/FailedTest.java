package FrameworkKekwords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class FailedTest extends TestBase{
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
	
	@Test
	public void Test1()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result,true);
	}
	@Test
	public void Test2()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result,true);
	}
	@Test
	public void Test3()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result,true);
	}
	@Test
	public void Test4()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result,true);
	}
	@Test
	public void Test5()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result,false);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();	
	}

}


