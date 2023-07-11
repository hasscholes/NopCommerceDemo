package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.ShoppingCart;

public class TC_008_AddProductToCart extends TestBase {
	
	
	String productName = "Apple MacBook Pro 13-inch";
	String searchTxt = "macB";
	SearchPage searchObject;
	ProductDetailsPage productObject;
	ShoppingCart cartObject;
	String qty = "4";
	
	
	@Test(priority = 1)
	
	public void UserCanAddSearchForProduct() throws InterruptedException 
	{
		searchObject = new SearchPage(driver);
		searchObject.productSearchUsingAutoSuggest(searchTxt);
		Thread.sleep(2000);
			
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
	
	public void UserCanRemoveFromCart() throws InterruptedException 
	{
		cartObject = new ShoppingCart(driver);
		cartObject.UpDateQty(qty);
		
		cartObject.checkCartUpdate();
		Thread.sleep(3000);
		Assert.assertTrue(cartObject.CheckShoppingCartIsEmpty.getText().contains("Your Shopping Cart is empty!"));
		
		
		
	}
	
	
	

}
