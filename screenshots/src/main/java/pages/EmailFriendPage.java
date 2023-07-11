package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage  extends PageBase {

	public EmailFriendPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css = "button.button-2.email-a-friend-button")
	WebElement sendEmailBtn;
	
	@FindBy(id = "FriendEmail")
	WebElement friendEmailTxt;
	
	@FindBy(id = "YourEmailAddress")
	WebElement yourEmailTxt;
	
	@FindBy(id = "PersonalMessage")
	WebElement messageTxt;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
	WebElement submitBtn;
	
	@FindBy(css = "div.result")
	public WebElement emailSentSuccsfully;
	
	
	public void userCanSendEmailToFriend(String friendEmail ,String email, String personalmessage) 
	{    
		clickButton(sendEmailBtn);
		setTxtElementTxt(friendEmailTxt, friendEmail);
		setTxtElementTxt(yourEmailTxt, email);
		setTxtElementTxt(messageTxt, personalmessage);
		clickButton(submitBtn);
		
		
	}
	
	
	
	

}
