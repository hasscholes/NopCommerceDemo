package tests;

import org.testng.annotations.Test;

import pages.HomeBage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserLogin extends TestBase{
	
	HomeBage homeObject;
	LoginPage loginObject;
	UserRegisterationPage registerObject;
	
	
	@Test (priority = 1)
	public void UserCanLogin() throws InterruptedException 
	{
		
		homeObject = new HomeBage(driver);
		homeObject.openLoginPage();
		
		loginObject = new LoginPage(driver);
		loginObject.openLoginPage("test147@test.com", "123456");
		
		Thread.sleep(2000);
	}
	
	//@Test (priority = 2)
	
	public void RegisterdUserCanLogOut() 
	{
		registerObject = new UserRegisterationPage(driver);
		
		registerObject.userCanLogOut();
		
	}
	
	
	
	

}
