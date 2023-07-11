package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "FullName")
	WebElement nameTxtBox;
	
	@FindBy(id = "Email")
	WebElement emailTxtBox;
	
	@FindBy(id = "Enquiry")
	WebElement messageBox;
	
	@FindBy(name = "send-email")
	WebElement submitBtn;
	
	@FindBy(css = "div.result")
	public WebElement successMessage;
	
	
	public void set_info_for_contactus(String name, String email, String message) 
	{
		set_text_element(nameTxtBox, name);
		set_text_element(emailTxtBox, email);
		set_text_element(messageBox, message);
		click_button(submitBtn);
		
		
	}

}
