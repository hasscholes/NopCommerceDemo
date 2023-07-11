package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;

public class TC_003_ProductHoverMenu extends TestBase{
	
	HomePage homeObject;
	RegisterationPage registerObject;
	LoginPage loginObject;
	
	@Test
	
	public void selectFromHoverMenu() throws InterruptedException 
	{
		homeObject = new HomePage(driver);
		homeObject.click_on_registerLink();
		
		registerObject = new RegisterationPage(driver);
		registerObject.user_can_registeration("emam356", "sayed356", "sayedmnha35678901@test.com", "456789");
		
		Thread.sleep(2000);
		loginObject = new LoginPage(driver);
		loginObject.userCanLogin("sayedmnha35678901@test.com", "456789");
		
		homeObject.select_notebooks_menu();
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/notebooks"));
		
		
		
		
	}
	
	
	
	
	

}
