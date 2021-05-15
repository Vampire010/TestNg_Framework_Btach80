package Test_Pages;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser_Config.Browser_Launcher;
import Page_Locaters.Kb_Login_Page;

public class TestNg_DataProviders extends Browser_Launcher
{
	 String  Browser_Types = "chrome";
	 String URL = "http://mykidsbank.org";
	
	 
	 
	 /*   String Bank_IDs = "67674";
		String Banker_Username = "banker";
		String Banker_Password = "jack1234";  */
	 

	 @DataProvider(name = "Authentication")

	 public static Object[][] credentials() 
	 {

	         // The number of times data is repeated, test will be executed the same no. of times

	         // Here it will execute two times

		 return new Object[][] {
			                      { "67674", "banker" , "jack1234"}, 
			                      { "6767409", "banker" , "jack1234"}
			                      
		                       };

	 }

	@BeforeMethod 
	public  void open_Browser() throws InterruptedException
	{		
		Browser(Browser_Types, URL);
	}
	
	@Test(dataProvider = "Authentication")
	public  void Login_Page_Tests(String Bank_IDs, String Banker_Username , String Banker_Password ) 
	{
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")).sendKeys(Bank_IDs);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")).sendKeys(Banker_Username);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")).sendKeys(Banker_Password);

		driver.findElement(By.xpath("//*[@id=\"clicked_when_enter_id\"]")).submit();
		driver.quit();
	}
	
	
	@AfterMethod
	public  void close_browser()
	{
		System.out.println("Test Passesd");
				
	}

}
