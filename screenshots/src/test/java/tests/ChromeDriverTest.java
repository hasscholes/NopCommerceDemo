package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeDriverTest {

	
//	ChromeDriver driver ; 
	FirefoxDriver driver;
	@BeforeTest
	
	public void SetUp() 
	{
		String chromePath = System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", chromePath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");	
	}
	
	@Test
	public void testSearchText() throws InterruptedException 
	{
		WebElement searchTextBtn = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextBtn.sendKeys("selenium webdriver book");
		Thread.sleep(2000);
	}
	
	@AfterTest
	
	public void closeDriver() 
	{
		driver.quit();
		
	}
	
	
}
