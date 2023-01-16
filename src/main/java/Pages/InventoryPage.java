package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.UtilityMethod;

public class InventoryPage extends TestBase {

	@FindBy(xpath="//div[@class='peek']")private WebElement peekLogo;
	@FindBy(xpath="//img[@alt='Swag Bot Footer']")private WebElement swagBot;
	@FindBy(id="add-to-cart-sauce-labs-backpack")private WebElement bagpack ;
	@FindBy(id="add-to-cart-sauce-labs-bike-light")private WebElement bikeLight;
	@FindBy(id="add-to-cart-sauce-labs-bike-light")private WebElement boltTshirt;
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")private WebElement fleesJacket;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement sortProductDropdown;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement productCount;  
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	public boolean verifySwagBotLogo()
	{
		return swagBot.isDisplayed();
	}
	public String addProduct() throws Exception
	{
		UtilityMethod.selectClass(sortProductDropdown,"Name (Z to A)");
		Thread.sleep(3000);
		bagpack.click();
		bikeLight.click();
		fleesJacket.click();
		Thread.sleep(3000);
		productCount.click();
		return productCount.getText();
		
	}
	
	
	
	  
}
