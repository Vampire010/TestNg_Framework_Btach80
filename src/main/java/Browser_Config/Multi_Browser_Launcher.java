package Browser_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;

public class Multi_Browser_Launcher 
{
	public  WebDriver driver;


	public  void Browser(String browser_type , String URL)
	{
		
		if(browser_type.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/girishg/eclipse-workspace/KidsBank_TestNG/Browser_Drivers/chromedriver");
			
			 driver = new ChromeDriver();
		
			driver.get(URL);
			
		}
		
		else if(browser_type.equals("safari"))
		{
			//System.setProperty("webdriver.safari.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
			
			 driver = new SafariDriver();		
			driver.get(URL);
		}
		
		else if(browser_type.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/girishg/eclipse-workspace/KidsBank_TestNG/Browser_Drivers/geckodriver");
			
			 driver = new FirefoxDriver();
		
			driver.get(URL);
		}
		
		
		else 
		{
			System.out.println("Specified Browser Type not found");
			
		}
		
	}

	
	public  void close_browsers()
	{
		driver.close();
		
	}
	
	

}
