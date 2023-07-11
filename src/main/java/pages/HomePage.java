 package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		
		jse=(JavascriptExecutor) driver;
		action = new Actions(driver);
		
		
	}

	@FindBy(linkText = "Register")
	WebElement Register_link;
	
	@FindBy(linkText = "Log out")
	WebElement logOutLink;
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
	WebElement computerMenu;
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
	WebElement noteBooksMenu;
	
	@FindBy(linkText = "Contact us")
	WebElement contactusLink;
	
	@FindBy(id = "customerCurrency")
	WebElement currencydrl;
	
	
	
	
	
	
	
	
	
	
	
	
	public void click_on_registerLink() 
	{
		click_button(Register_link);
		
	}
	
	public void select_notebooks_menu() 
	{
		action.moveToElement(computerMenu).moveToElement(noteBooksMenu)
		.click()
		.build()
		.perform();
			
	}
	
	public void scrollBottom() 
	{
		jse.executeScript("scroll(2500,0)");
		
		
	}
	
	public void open_contactus_page() 
	{
		
		click_button(contactusLink);
		
	}
	
	public void changeCurrency() 
	{
		
		select = new Select(currencydrl);
		select.selectByVisibleText("Euro");
		
	}
	
	
	public void userCanLogOut() 
	{
		click_button(logOutLink);
		
	}

	
	
	
	
}
