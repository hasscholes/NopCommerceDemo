package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;

public class TC_002_loginTest extends TestBase {

	
	HomePage homeObject;
	RegisterationPage registerObject;
	LoginPage loginObject;
	
	
	
	
	@Test
	
	public void user_can_login() throws InterruptedException 
	{
		homeObject = new HomePage(driver);
		homeObject.click_on_registerLink();
		
		registerObject =new RegisterationPage(driver);
		registerObject.user_can_registeration("mohamedm", "sayedm", "mohamedha12325367801@test.com", "123456");
		Thread.sleep(2000);
		
		
		loginObject = new LoginPage(driver);
		loginObject.userCanLogin("mohamedha12325367801@test.com", "123456");
		Thread.sleep(1000);
	    
		homeObject.userCanLogOut();
		
		
		
		
	}
	
	
	
	
	
}
