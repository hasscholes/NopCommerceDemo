package tests;

import org.testng.annotations.Test;

import pages.HomeBage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegisterationPage;

public class MyAccountTest extends TestBase{
	
	
	HomeBage homeObject ;
	UserRegisterationPage registerObject;
	LoginPage loginObject;
	MyAccountPage myAccountObject;
	
	
	String firstName = "hassan";
	String lastName = "mahmoud";
	String oldPassword = "963852";
	String newPassword = "123456";
	String email = "test5555@test.com";
	
	
	@Test(priority = 1)
	
	public void userCanRegisterSuccssfully() 
	{
		homeObject = new HomeBage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegisterationPage(driver);
		registerObject.userRegistration("firstName", "lastName", "email", "oldPassword");
		
	}
	
	
	@Test(priority = 2)
	
	public void RegisterdUserCanLogin() 
	{
		
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.openLoginPage("email", "oldPassword");	
	}
	
//	@Test(priority = 3)

	public void MyAccountPage() 
	{
	
		myAccountObject = new MyAccountPage(driver);
		myAccountObject.OpenMyAccountPage();
		myAccountObject.ChangePassword(oldPassword, newPassword);
		
		
	}
	
}
