package Test_Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser_Config.Browser_Launcher;
import Page_Locaters.Kb_Regestartion_Page;

public class Regestartion_Page_Test  
{
	 String  Browser_Types = "chrome";
	 String URL = "http://mykidsbank.org";
	
	 Kb_Regestartion_Page Reg_Pages = new Kb_Regestartion_Page();

	@BeforeMethod
	public  void open_Browser() throws InterruptedException
	{		
		Reg_Pages.Browser(Browser_Types, URL);
	}
	
	@Test
	public  void Regestartion_Page_Tests() throws InterruptedException 
	{
		Reg_Pages.KB_REg_Page();
	}
	
	
	@AfterMethod
	public  void close_browser()
	{
		//Reg_Pages.driver.quit();
		System.out.println("Test Passesd");
				
	}
	
}
