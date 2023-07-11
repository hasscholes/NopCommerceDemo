 package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;

public class TC_001_RegisterationWithDataProvider extends TestBase {
	
	
	HomePage homeObject;
	RegisterationPage registerObject;
	LoginPage loginObject;
	
	
	
	@DataProvider(name = "testData")
	public static Object[][] userData()
	{
		return new Object[][] 
				{
		    	{"hassanm","mahmoudm","test14785@test.com","123456"},
	    	    {"mahmoudm","hassanm","test25885@test.com","654321"}
				};	
	}
	
	@Test(dataProvider = "testData")
	public void userCanRegisterSuccfully(String fname, String lname, String email, String password) throws InterruptedException 
	{
		
		homeObject = new HomePage(driver);
		homeObject.click_on_registerLink();
		registerObject = new RegisterationPage(driver);
		registerObject.user_can_registeration(fname,lname, email, password);
		
		loginObject = new LoginPage(driver);
		loginObject.userCanLogin(email, password);
		Thread.sleep(1000);
	    
		homeObject.userCanLogOut();
		
		
		
		//Assert.assertTrue(registerObject.succssfulMessage.getText().contains("Your registration completed"));
		//Assert.assertEquals(registerObject.succssfulMessage, "Your registration completed");
		
		
		
		
	}
	
	
	
	

}
