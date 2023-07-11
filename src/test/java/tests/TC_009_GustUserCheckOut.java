package tests;

import org.testng.annotations.Test;

import pages.CheckOutPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCart;

public class TC_009_GustUserCheckOut extends TestBase {

	ShoppingCart shoppingObject;
	CheckOutPage checkObject;
	SearchPage searchObject;
	ProductDetailsPage productObject;
	String searchTxt = "macB";
	

	
	@Test (priority = 1)
	public void GustUserCanSearchForProduct() throws InterruptedException 
	{
		searchObject = new SearchPage(driver);
		searchObject.productSearchUsingAutoSuggest(searchTxt);
		
	}
	
	@Test(priority = 2)
	
	public void UserCanAddProductToCart() throws InterruptedException 
	{
		productObject = new ProductDetailsPage(driver);
		productObject.addProductTocart();
		driver.navigate().to("https://demo.nopcommerce.com/cart");
		Thread.sleep(3000);
			
	}
	
	@Test(priority = 3)
	
	public void GustUserCanCheckOut() throws InterruptedException 
	{
		
		shoppingObject = new ShoppingCart(driver);
		shoppingObject.agreeTermsandcheckout();	
		
	}
	
	@Test(priority = 4)
	public void GustUserInfoAndConfirmOrder() throws InterruptedException 
	{
		checkObject = new CheckOutPage(driver);
		checkObject.gustUserInfo("hassan", "mahmoud", "hascmnzrjlkzmnhklm@test.com", "Egypt", "Cairo", "ahmed12345", "123456", "12345688");
		
	}
	

	
	
	
}
