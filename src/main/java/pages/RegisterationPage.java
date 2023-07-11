package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends PageBase {

	public RegisterationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "gender-male")
	WebElement gender_btn;
	
	@FindBy(id = "FirstName")
	WebElement fnTxtBox;
	
	@FindBy(id = "LastName")
	WebElement lnTxtBox;
	
	@FindBy(id = "Email")
	WebElement emailTxtBox;
	
	@FindBy(id = "Password")
	WebElement passTxtBox;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confPassTxtBox;
	
	@FindBy(id = "register-button")
	WebElement registerBtn;
	
	@FindBy(css = "div.result")
     public WebElement succssfulMessage;
	
	
	public void user_can_registeration(String firstName , String lastName , String email , String password) 
	{
		
		click_button(gender_btn);
		set_text_element(fnTxtBox, firstName);
		set_text_element(lnTxtBox, lastName);
		set_text_element(emailTxtBox, email);
		set_text_element(passTxtBox, password);
		set_text_element(confPassTxtBox, password);
		click_button(registerBtn);
		
		
	}
	

	
	
	
}
