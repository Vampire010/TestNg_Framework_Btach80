package Test_Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Create_a_New_Deposit_Account.Create_Deposit_Account;
import Page_Locaters.Kb_Login_Page;

public class Create_Deposit_Account_Tests 
{
	 String  Browser_Types = "chrome";
	 String URL = "http://mykidsbank.org";
	
	 Create_Deposit_Account Create_Deposit_Account_Pages = new Create_Deposit_Account();
	 
	@BeforeMethod
	public  void open_Browser() throws InterruptedException
	{	
		Create_Deposit_Account_Pages.Browser( Browser_Types ,  URL);
		Create_Deposit_Account_Pages.Login_Page();

	}
	
	
	
	@Test
	public  void Create_Deposit_Account_Pages_Tests() throws InterruptedException 
	{
		Thread.sleep(3000);
		Create_Deposit_Account_Pages.Create_New_Deposit_Account();
		Create_Deposit_Account_Pages.driver.quit();
	}

	@AfterMethod
	public  void close_browser()
	{
		System.out.println("Test Passesd");
				
	}

}
