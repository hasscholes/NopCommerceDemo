package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters({"browser"})
	
	public void openBrowser(@Optional("chrome")String browser) 
	{
		if (browser.equalsIgnoreCase("chrome")) {
		String chromPath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromPath);
		
		driver = new ChromeDriver();
		}
		
		
		else if  (browser.equalsIgnoreCase("firefox")) {
			String foxPath = System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";			
			System.setProperty("webdriver.gecko.driver", foxPath);	
			
			driver = new FirefoxDriver();
			}
		
		
		    driver.manage().window().maximize();	
	        driver.navigate().to("https://demo.nopcommerce.com/");
		
		
		
		
	}
	
	

	

	
	
	
	
	
	@AfterSuite
	
	public void close_driver() 
	{
		
		driver.quit();
	}
	
	

}
