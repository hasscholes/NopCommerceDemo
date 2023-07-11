package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class TC_006_ContactUsTest extends TestBase{
	
	String name = "hassan";
	String email = "test145@test.com";
	String message = "Hello admi,this is for test";
	String successmessage = "Your enquiry has been successfully sent to the store owner.";
	
	 HomePage homeObject;
	 ContactUsPage contactObject;
	 
	 
	 @Test
	 public void userCanUseContactUsPage() throws InterruptedException
   {
	
		homeObject = new HomePage(driver);
		homeObject.scrollBottom();
		homeObject.open_contactus_page();
		
		contactObject = new ContactUsPage(driver);
		contactObject.set_info_for_contactus(name, email, message);
		
		Thread.sleep(2000);
         //Assert.assertEquals(contactObject.successMessage, "Your enquiry has been successfully sent to the store owner.");
		
      Assert.assertTrue(contactObject.successMessage.getText().contains("Your enquiry has been successfully sent to the store owner."));


    }
	

}
