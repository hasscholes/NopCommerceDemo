package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class TC_007_ChangeCurrency extends TestBase {
	
	HomePage homeObject;
	SearchPage searchObject;
	String productName = "Apple MacBook Pro 13-inch";
	String searchTxt = "macB";
	ProductDetailsPage productObject;
	
	@Test (priority = 1)
	public void userCanChangeCurrency() 
	{
		homeObject = new HomePage(driver);
		homeObject.changeCurrency();
		
		
	}
	
	@Test (priority = 2)
	
	public void userCanSearchUsingAutoSuggest() throws InterruptedException 
	{
		
		searchObject = new SearchPage(driver);
		searchObject.productSearchUsingAutoSuggest(searchTxt);
		Thread.sleep(2000);
		
		productObject = new ProductDetailsPage(driver);
		Assert.assertTrue(productObject.productPriceLbl.getText().contains("€1548.00"));
		
		
		
	}
	
	

}
