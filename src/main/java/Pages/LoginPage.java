package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	
	 //object repository
	@FindBy(xpath="//div[@class='login_logo']")private WebElement loginLogo;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement botLogo;
	@FindBy(xpath="//input[@id='user-name']")private WebElement usernameTextbox;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordTextbox;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	@FindBy(xpath="//span[@class='title']")private WebElement productLabel;
	
	//constructor to initialize the elements of page
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//driver.findElement(By.xpath(""));
	
	public boolean verifyLoginLogo()
	{
		return loginLogo.isDisplayed();	
	}
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();
	}
	public String verifyTitle() 
	{
		//Thread.sleep(2000);
	return driver.getTitle();
	}
	public String verifyCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	public String loginToApp() throws Exception 
	{
		//usernameTextbox.sendKeys(ReadData.readPropertyFile("username"));
		usernameTextbox.sendKeys(ReadData.readExcelFile(0, 0));
		passwordTextbox.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		//Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	public String verifyLabelofInventory() throws Exception 
	{
		loginToApp();
		return productLabel.getText();
		
		
	}



	
	
}
