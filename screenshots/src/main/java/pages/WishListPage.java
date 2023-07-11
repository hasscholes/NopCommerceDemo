package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase{

	public WishListPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(css = "h1")
	WebElement wishListHeader;
	
	@FindBy(css = "a.product-name")
	WebElement productName;
	
	@FindBy(css= "button.remove-btn")
	WebElement removeBtn;
	
	@FindBy(name = "updatecart")
	WebElement updateBtn;
	
	@FindBy(css = "div.page-title")
	public WebElement WishlistTitle;
	
	public void addItemToWishlist() throws InterruptedException 
	{
		clickButton(removeBtn);
	//	Thread.sleep(2000);
		//clickButton(updateBtn);
		
		
	}
	
	
	
	
}
