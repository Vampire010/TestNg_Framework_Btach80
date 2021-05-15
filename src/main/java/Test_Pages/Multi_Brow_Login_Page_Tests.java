package Test_Pages;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser_Config.Multi_Browser_Launcher;
import Page_Locaters.Kb_Login_Page;

public class Multi_Brow_Login_Page_Tests 
{
	 String URL = "http://mykidsbank.org";
		
	 Kb_Login_Page Login_Pages = new Kb_Login_Page();
	 Regestartion_Page_Test RGST = new Regestartion_Page_Test();
	@Parameters("Browser_Types")
	@BeforeMethod
	public  void open_Browser(String Browser_Types) throws InterruptedException
	{		
		Login_Pages.Browser(Browser_Types, URL);
	}
	
	@Test
	public  void Login_Page_Tests_Safri() 
	{
		Login_Pages.Login_Page();
	//	Login_Pages.driver.quit();
	}
	
	@Test
	public  void Login_Page_Tests_Chrome() throws InterruptedException 
	{
		Thread.sleep(5000);
		Login_Pages.Login_Page();
		//Login_Pages.driver.quit();
	}
	
	@AfterMethod
	public  void close_browser()
	{
		System.out.println("Test Passesd");
				
	}
	
	
}
