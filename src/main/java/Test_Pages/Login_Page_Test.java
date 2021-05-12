package Test_Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page_Locaters.Kb_Login_Page;
import Page_Locaters.Kb_Regestartion_Page;

public class Login_Page_Test 
{
	 String  Browser_Types = "chrome";
	 String URL = "http://mykidsbank.org";
	
	 Kb_Login_Page Login_Pages = new Kb_Login_Page();

	@BeforeMethod
	public  void open_Browser() throws InterruptedException
	{		
		Login_Pages.Browser(Browser_Types, URL);
	}
	
	@Test
	public  void Login_Page_Tests() 
	{
		Login_Pages.Login_Page();
		Login_Pages.driver.quit();
	}
	
	
	@AfterMethod
	public  void close_browser()
	{
		System.out.println("Test Passesd");
				
	}
	

}
