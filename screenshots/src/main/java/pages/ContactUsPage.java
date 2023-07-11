package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage  extends PageBase{

	public ContactUsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(id = "FullName")
	WebElement fullnameTxt;
	
	@FindBy(id = "Email")
	WebElement emailTxt;
	
	@FindBy(id = "Enquiry")
	WebElement enquieryTxt;
	
	@FindBy(css = "button.button-1.contact-us-button")
	WebElement submitBtn;
	
	@FindBy(css = "div.result")
	public WebElement successMessage;
	
	
	public void openContactUsPage(String fullName , String email , String enquieryMessage) 
	{
		setTxtElementTxt(fullnameTxt, fullName);
		setTxtElementTxt(emailTxt, email);
		setTxtElementTxt(enquieryTxt, enquieryMessage);
		clickButton(submitBtn);
		
		
	}

}
