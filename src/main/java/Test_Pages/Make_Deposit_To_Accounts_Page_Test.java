package Test_Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Make_Deposit.Make_Deposit_To_Accounts;

public class Make_Deposit_To_Accounts_Page_Test 
{
	 String  Browser_Types = "chrome";
	 String URL = "http://mykidsbank.org";
	
	 Make_Deposit_To_Accounts Make_Deposit_To_Accounts_Pages = new Make_Deposit_To_Accounts();

	@BeforeMethod
	public  void open_Browser() throws InterruptedException
	{	
		Make_Deposit_To_Accounts_Pages.Browser( Browser_Types ,  URL);
		Make_Deposit_To_Accounts_Pages.Login_Page();
	}

	
	@Test
	public  void Make_Deposit_To_Accounts_Pages_Tests() throws InterruptedException 
	{
		Thread.sleep(3000);
		Make_Deposit_To_Accounts_Pages.Make_Deposit_In_To_Accounts();
		Make_Deposit_To_Accounts_Pages.driver.quit();

	}

	@AfterMethod
	public  void close_browser()
	{
		System.out.println("Test Passesd");
				
	}

	

}
