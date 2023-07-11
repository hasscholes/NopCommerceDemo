package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase {

	public CheckOutPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "BillingNewAddress_FirstName")
	WebElement fnTxtBox;
	
	@FindBy(id = "BillingNewAddress_LastName")
	WebElement lnTxtBox;
	
	@FindBy(id = "BillingNewAddress_Email")
	WebElement emailTxtBox;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement cuontryTxtBox;
	
	@FindBy(id = "BillingNewAddress_City")
	WebElement cityTxtBox;
	
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement addressTxtBox;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement postalCodeTXt;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phoneTxtBox;
	
	@FindBy(css = "button.button-1.new-address-next-step-button")
	WebElement continueNextStep1;
	
	@FindBy(css = "button.button-1.shipping-method-next-step-button")
	WebElement continueNextStep2;
	
	@FindBy(css = "button.button-1.payment-method-next-step-button")
	WebElement continueNextStep3;
	
	@FindBy(css = "button.button-1.payment-info-next-step-button")
	WebElement continueNextStep4;
	
	@FindBy(css = "button.button-1.confirm-order-next-step-button")
	WebElement confirmBtn;
	
	@FindBy(linkText = "Click here for order details.")
	WebElement orderDetailsLink;
	
	@FindBy(xpath =  "/html/body/div[6]/div[3]/div/div/div/div[1]/a[2]")
	WebElement downloadInvoiceLink;
	
	
	
	public void gustUserInfo(String firstName,String lastName,String email,String country, String city, String address,
			String postalCode, String phone ) throws InterruptedException 
	{
		set_text_element(fnTxtBox, firstName);
		set_text_element(lnTxtBox, lastName);
		set_text_element(emailTxtBox, email);
		select = new Select(cuontryTxtBox);
		select.selectByVisibleText(country);
		set_text_element(cityTxtBox, city);
		set_text_element(addressTxtBox, address);
		set_text_element(postalCodeTXt, postalCode);
		set_text_element(phoneTxtBox, phone);
		click_button(continueNextStep1);
		Thread.sleep(2000);
		click_button(continueNextStep2);
		Thread.sleep(2000);
		click_button(continueNextStep3);
		Thread.sleep(2000);
		click_button(continueNextStep4);
		Thread.sleep(2000);
		click_button(confirmBtn);
		Thread.sleep(3000);
		click_button(orderDetailsLink);
		Thread.sleep(3000);
		click_button(downloadInvoiceLink);	
		
	}
	
	
	
	
	

}
