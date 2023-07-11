package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EmailFriendPage;
import pages.HomeBage;
import pages.LoginPage;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.UserRegisterationPage;

public class TestEmailToFriend extends TestBase {
	

	HomeBage homeObject ;
	UserRegisterationPage registerObject;
	LoginPage loginObject;
	EmailFriendPage emailFriendObject;
	String friendEmail = "ccc@test.com";
	String email = "test3800@test.com";
	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject ;
	ProductDetailsPage productObject;
	String personalmessage = "This Product very good for you";
	
	
	
	@Test(priority = 1)
	
	public void userCanRegisterSuccssfully() 
	{
		homeObject = new HomeBage(driver);
		homeObject.openRegistrationPage();
		registerObject = new UserRegisterationPage(driver);
		registerObject.userRegistration("hassan", "mahmoud", email, "987654");
		
	}
	
	
	
@Test(priority = 2)
	
	public void RegisterUserCanLogOut() 
	{
		registerObject.userCanLogOut();
		
	}
	
	
	
	@Test(priority = 3)
	
	public void RegisterdUserCanLogin() 
	{
		
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.openLoginPage(email, "987654");
		
	}
	
	@Test(priority = 4)
	public void userCanSearchForProduct() 
	{
		searchObject = new SearchPage(driver);
		productObject = new ProductDetailsPage(driver);
		searchObject.productSearchPage(productName);
		searchObject.openProductInfoPage();}
	
	@Test(priority = 5)
	
	public void sendingEmailToFriend() 
	{
		emailFriendObject = new EmailFriendPage(driver);
		emailFriendObject.userCanSendEmailToFriend(friendEmail,email, personalmessage);
		Assert.assertTrue(emailFriendObject.emailSentSuccsfully.getText().contains("Your message has been sent."));
		
	}
	
	
	
	
	
	
	

}
