package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomeBage;

public class ContactUsTest extends TestBase{
	
	String fullName = "TestUser";
	String email    = "Test125@test.ocm";
	String enquieryMessage = "hello from test user";
	
	HomeBage homeObject;
	ContactUsPage contactObject;
	@Test
	public void userCanUseContactUsPage() 
	{
		homeObject = new HomeBage(driver);
		homeObject.clickOnContactUSLink();
		
		contactObject = new ContactUsPage(driver);
		contactObject.openContactUsPage(fullName, email, enquieryMessage);
        Assert.assertTrue(contactObject.successMessage.getText().contains("Your enquiry has been successfully sent to the store owner"));
		
		
		
	}
	
	
	
	

}
