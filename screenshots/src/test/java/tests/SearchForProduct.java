package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchForProduct extends TestBase {
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject ;
	ProductDetailsPage productObject;
	
	@Test
	public void userCanSearchForProduct() 
	{
		searchObject = new SearchPage(driver);
		productObject = new ProductDetailsPage(driver);
		searchObject.productSearchPage(productName);
		searchObject.openProductInfoPage();
		Assert.assertTrue(productObject.productNameBreadCrump.getText().contains(productName));
	//	Assert.assertEquals(productObject.productNameBreadCrump.getText(), productName);
	
		
	}
	
	
	

}
