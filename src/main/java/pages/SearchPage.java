package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//*[@id=\"small-searchterms\"]")
	WebElement searchTXtBOx;
	
	@FindBy(css = "button.button-1.search-box-button")
	WebElement searchBtn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2")
	WebElement productTitle;
	
	@FindBy(id = "ui-id-1")
	List<WebElement>productList;
	
	
	public void productSearchPage(String productName) 
	{
		set_text_element(searchTXtBOx, productName);
		click_button(searchBtn);
		
	}
	
	public void open_product_info() 
	{
		click_button(productTitle);
		
	}
	
	public void productSearchUsingAutoSuggest(String searchTxt) throws InterruptedException 
	{
		set_text_element(searchTXtBOx, searchTxt);
		Thread.sleep(2000);
		productList.get(0).click();
		
	}
	
	

}
