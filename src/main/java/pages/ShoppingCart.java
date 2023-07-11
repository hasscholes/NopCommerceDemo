package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends PageBase{

	public ShoppingCart(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(css =  "input.qty-input")
	WebElement QuantityTxtBox ;
	
	@FindBy(id = "updatecart")
	WebElement updateBtn;
	
	@FindBy(css = "td.remove-from-cart")
	WebElement removeBtn;
	
	@FindBy(css = "div.no-data")
	public WebElement CheckShoppingCartIsEmpty;
	
	@FindBy(id = "termsofservice")
	WebElement agreeTermsBtn;
	
	@FindBy(id = "checkout")
	WebElement checkOutBtn;
	
	@FindBy(css = "button.button-1.checkout-as-guest-button")
	WebElement checkOutAsGuestBtn;
	
	
	
	public void UpDateQty(String qty) 
	{
		removeTxt(QuantityTxtBox);
		set_text_element(QuantityTxtBox,qty);
		
	}
	
	public void checkCartUpdate() 
	{
		
		click_button(updateBtn);
		click_button(removeBtn);
			
	}
	
	
	public void agreeTermsandcheckout() throws InterruptedException 
	{
		click_button(agreeTermsBtn);
		click_button(checkOutBtn);
		Thread.sleep(1000);
		click_button(checkOutAsGuestBtn);
		
	}
	
	
	
	
}
