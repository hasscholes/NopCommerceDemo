 package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterationPage;

public class TC_001_Registeration extends TestBase {
	
	
	HomePage homeObject;
	RegisterationPage registerObject;
	
	@Test
	public void userCanRegisterSuccfully() 
	{
		
		homeObject = new HomePage(driver);
		homeObject.click_on_registerLink();
		registerObject = new RegisterationPage(driver);
		registerObject.user_can_registeration("ahmet","hassan", "jklmn@test.com", "987654");
		
		Assert.assertTrue(registerObject.succssfulMessage.getText().contains("Your registration completed"));
		//Assert.assertEquals(registerObject.succssfulMessage, "Your registration completed");
		
		
		
		
	}
	
	
	
	

}
