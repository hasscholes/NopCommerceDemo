package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver;
	public JavascriptExecutor jse;
	public Actions action ;
	public Select select ;
	
	
	
	public PageBase(WebDriver driver) 
	
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	protected static void click_button(WebElement button) 
	{
		
		button.click();
	}
	
	
	protected static void set_text_element(WebElement textElement , String value) 
	{
		
		textElement.sendKeys(value);
		
	}
	
	public static void removeTxt (WebElement element) 
	{
		element.clear();
		
	}
	
	
	
	
}
