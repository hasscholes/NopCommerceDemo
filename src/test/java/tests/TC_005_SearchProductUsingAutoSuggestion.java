package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class TC_005_SearchProductUsingAutoSuggestion extends TestBase{
	
	String productName = "Apple MacBook Pro 13-inch";
	String searchTxt = "macB";
	SearchPage searchObject;
	ProductDetailsPage productObject;
	
	@Test
	
	public void userCanSearchUsingAutoSuggest() throws InterruptedException 
	{
		
		searchObject = new SearchPage(driver);
		searchObject.productSearchUsingAutoSuggest(searchTxt);
		Thread.sleep(2000);
		
		productObject = new ProductDetailsPage(driver);
		//Assert.assertTrue(productObject.breadCrumpProductName.getText().contains(productName));
		Assert.assertEquals(productObject.breadCrumpProductName.getText(), productName);
		
		
	}
	

}
