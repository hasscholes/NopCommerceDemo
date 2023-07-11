package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomeBage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegistrationWithDataProvider extends TestBase {
	
	HomeBage homeObject ;
	UserRegisterationPage registerObject;
	LoginPage loginObject;
	
	
	@DataProvider (name="testData")
	public static Object [][] userData() 
	{
		
		return new  Object [][]{
			
			{"hasan","mohamed","testn30@test.com","123587"},
			{"sayed","fawzy","testgh85z@test.com","456321"}
			};
		
	}
	
	
	@Test(priority = 1,dataProvider = "testData")
	
	public void userCanRegisterSuccssfully(String fName,String lName,String email,String password) throws InterruptedException 
	{
		homeObject = new HomeBage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegisterationPage(driver);
		registerObject.userRegistration(fName,lName,email,password);
		Thread.sleep(2000);
		registerObject.userCanLogOut();
		homeObject.openLoginPage(); loginObject = new LoginPage(driver);
		  loginObject.openLoginPage(email, password);
		  
		
	}
	
	
	/*
	 * @Test(priority = 2)
	 * 
	 * public void RegisterUserCanLogOut() { registerObject.userCanLogOut();
	 * 
	 * }
	 * 
	 */
	
	
	
	/*
	 * @Test(priority = 3)
	 * 
	 * public void RegisterdUserCanLogin(String email,String password) {
	 * 
	 * homeObject.openLoginPage(); loginObject = new LoginPage(driver);
	 * loginObject.openLoginPage(email, password);
	 * 
	 * }
	 */
	 
	 
		
	 

	
	
	

}
