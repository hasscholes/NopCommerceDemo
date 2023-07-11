 package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;

public class TC_001_RegisterationWithDDTandExcel extends TestBase {
	
	
	HomePage homeObject;
	RegisterationPage registerObject;
	LoginPage loginObject;

	
	
	@DataProvider(name = "ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
		
		
	}
	
	@Test(dataProvider = "ExcelData")
	public void userCanRegisterSuccfully(String Fname, String Lname,String Email , String Password) throws InterruptedException 
	{
		
		homeObject = new HomePage(driver);
		homeObject.click_on_registerLink();
		registerObject = new RegisterationPage(driver);
		registerObject.user_can_registeration(Fname,Lname, Email, Password);
		
		loginObject = new LoginPage(driver);
		loginObject.userCanLogin(Email, Password);
		Thread.sleep(2000);
	    
		homeObject.userCanLogOut();
		
		//Assert.assertTrue(registerObject.succssfulMessage.getText().contains("Your registration completed"));
		//Assert.assertEquals(registerObject.succssfulMessage, "Your registration completed");
		
		
		
		
	}
	
	
	
	

}
