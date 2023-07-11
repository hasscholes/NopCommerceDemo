package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
    public WebElement productNameInfo;	
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/ul/li[4]/strong")
	public WebElement breadCrumpProductName;
	
	@FindBy(id = "price-value-4")
	public WebElement productPriceLbl;
	
	@FindBy(id = "add-to-cart-button-4")
	WebElement addToCartBtn; 
	
	
	public void addProductTocart() 
	{
		
		click_button(addToCartBtn);
		
	}
	
	
	
	
	

}
