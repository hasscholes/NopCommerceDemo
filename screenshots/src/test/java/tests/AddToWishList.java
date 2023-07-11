package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.WishListPage;

public class AddToWishList extends TestBase{
	
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject ;
	ProductDetailsPage productObject;
	WishListPage wishListObject;
	
	
	@Test(priority = 1)
	public void userCanSearchForProduct() 
	{
		searchObject = new SearchPage(driver);
		productObject = new ProductDetailsPage(driver);
		searchObject.productSearchPage(productName);
		searchObject.openProductInfoPage();
		Assert.assertTrue(productObject.productNameBreadCrump.getText().contains(productName));
	//	Assert.assertEquals(productObject.productNameBreadCrump.getText(), productName);		
	}
	
	@Test(priority = 2)
	public void UserCanAddItemToWishlist() throws InterruptedException 
	{
		wishListObject = new WishListPage(driver);
		productObject.clickWishListBtn();
		driver.navigate().to("https://demo.nopcommerce.com/wishlist");
		wishListObject.addItemToWishlist();
		Assert.assertTrue(wishListObject.WishlistTitle.getText().contains("Wishlist"));
		
	}
	
	
	
	
	

}
