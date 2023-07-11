package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomeBage extends PageBase{

	public HomeBage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
		
	}
	
	
	@FindBy(linkText = "Register")
	WebElement registerLink ;
	
	@FindBy(linkText = "Log in")
	WebElement loginlink;
	
	@FindBy(linkText = "Contact us")
	WebElement contactUsLink;
	
	@FindBy( xpath =  "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement computerMenu;
	
	@FindBy(xpath =  "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
	WebElement noteBooksMenu;
	
	public void openRegistrationPage() 
	{
		
	clickButton(registerLink);
		
	}
	
	public void openLoginPage() 
	{
		clickButton(loginlink);
		
	}
	
	public void clickOnContactUSLink() 
	{
		scrollToBottom();
		clickButton(contactUsLink);
		
	}
	
	public void selectNoteBooksMenu() 
	{
		action.moveToElement(computerMenu).moveToElement(noteBooksMenu)
		.click()
		.build()
		.perform();
		
		
	}
	

}
