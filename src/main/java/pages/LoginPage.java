package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(linkText = "Log in")
	WebElement loginLink;
	
	@FindBy(id = "Email")
	WebElement emailTxtBox;
	
	@FindBy(id = "Password")
	WebElement passTxtBox;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement loginBtn;
	
	
	public void userCanLogin(String email , String password) 
	{
		click_button(loginLink);
		set_text_element(emailTxtBox, email);
		set_text_element(passTxtBox, password);
		click_button(loginBtn);
		
		
	}
	
	
	
}
