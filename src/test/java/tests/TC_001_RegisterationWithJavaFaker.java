 package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.RegisterationPage;

public class TC_001_RegisterationWithJavaFaker extends TestBase {
	
	
	HomePage homeObject;
	RegisterationPage registerObject;
	
	Faker fakeData = new Faker();
	String FirstName = fakeData.name().firstName();
	String LastName = fakeData.name().lastName();
	String Email = fakeData.internet().emailAddress();
	String Password = fakeData.number().digits(8).toString();
	
	@Test
	public void userCanRegisterSuccfully() 
	{
		
		homeObject = new HomePage(driver);
		homeObject.click_on_registerLink();
		registerObject = new RegisterationPage(driver);
		registerObject.user_can_registeration(FirstName,LastName,Email,Password);
		
		Assert.assertTrue(registerObject.succssfulMessage.getText().contains("Your registration completed"));
		//Assert.assertEquals(registerObject.succssfulMessage, "Your registration completed");
		
		
		
		
	}
	
	
	
	

}
