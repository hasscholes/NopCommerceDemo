package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class TC_004_SearchForProduct extends TestBase {
	
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject;
	ProductDetailsPage productObject;
	
	
	@Test
	
	public void userCAnSearchForProduct() 
	{
		
		searchObject = new SearchPage(driver);
		searchObject.productSearchPage(productName);
		searchObject.open_product_info();
		
		productObject = new ProductDetailsPage(driver);
		
		Assert.assertTrue(productObject.productNameInfo.getText().contains(productName));
		
	
		
	}
	
	

}
