package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id ="small-searchterms")
	WebElement searchTxtBox;
	
	@FindBy(css="button.button-1.search-box-button")
	WebElement searchBtn;
	
	@FindBy(id = "ui-id-1")
	WebElement productList;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
	 WebElement productTitle;
	
	
	public void productSearchPage(String productName) 
	{
		setTxtElementTxt(searchTxtBox,productName);
		searchBtn.click();
		
	}
	
	public void openProductInfoPage() 
	{
		clickButton(productTitle);
		
	}
	
	
	
	

}
