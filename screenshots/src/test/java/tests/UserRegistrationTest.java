package tests;

import org.testng.annotations.Test;

import pages.HomeBage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegistrationTest extends TestBase {
	
	HomeBage homeObject ;
	UserRegisterationPage registerObject;
	LoginPage loginObject;
	
	
	@Test(priority = 1)
	
	public void userCanRegisterSuccssfully() 
	{
		homeObject = new HomeBage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegisterationPage(driver);
		registerObject.userRegistration("hassan", "mahmoud", "test2000@test.com", "987654");
		
	}
	
	
	@Test(priority = 2)
	
	public void RegisterdUserCanLogin() 
	{
		
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.openLoginPage("test2000@test.com", "987654");
		
	}
	
@Test(priority = 3)
	
	public void RegisterUserCanLogOut() 
	{
		registerObject.userCanLogOut();
		
	}
	
	
	
	

}
