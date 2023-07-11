package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage  extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(id = "gender-male")
	WebElement genderRadBtn ;
	
	@FindBy(id = "FirstName")
	WebElement fnTxtBox;
	
	@FindBy(id = "LastName")
	WebElement lnTxtBox;
	
	@FindBy(id = "Email")
	WebElement emailTxtBox;
	
	@FindBy(id = "Password")
	WebElement passwordTxtBox;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPassTxtBox;
	
	@FindBy(id = "register-button")
	WebElement registerBtn;
	
	@FindBy(xpath =  "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logoutLink;
	
	
	public void userRegistration(String firstName , String lastName , String email , String password  ) 
	{
	clickButton(genderRadBtn);
		setTxtElementTxt(fnTxtBox, firstName);
		setTxtElementTxt(lnTxtBox, lastName);
		setTxtElementTxt(emailTxtBox, email);
		setTxtElementTxt(passwordTxtBox, password);
		setTxtElementTxt(confirmPassTxtBox, password);
		clickButton(registerBtn);
		
	}
	
	public void userCanLogOut() 
	{
		clickButton(logoutLink);
		
	}
}
		
		
		
	

	

		
	

	
	
		
	
	
	
	

