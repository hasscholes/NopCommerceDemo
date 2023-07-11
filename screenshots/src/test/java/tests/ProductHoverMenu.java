package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomeBage;

public class ProductHoverMenu extends TestBase {
	
	HomeBage homeObject;
	
	
	
	@Test
	public void UserCanHoverToMenu() 
	{
		homeObject = new HomeBage(driver);
		homeObject.selectNoteBooksMenu();
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
		
		
	}
	
	
	
	

}
