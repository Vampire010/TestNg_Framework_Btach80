package Test_Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser_Config.Browser_Launcher;
import Create_a_New_Deposit_Account.Create_Deposit_Account;
import Make_Deposit.Make_Deposit_To_Accounts;
import Page_Locaters.Kb_Login_Page;
import Page_Locaters.Kb_Regestartion_Page;

public class TestNg_Priority
{
	
	
	 Regestartion_Page_Test RGST = new Regestartion_Page_Test();
	 Create_Deposit_Account_Tests CDAT = new Create_Deposit_Account_Tests();
	 Make_Deposit_To_Accounts_Page_Test MKDPST = new Make_Deposit_To_Accounts_Page_Test();
	

	@BeforeMethod
	public  void open_Browser() throws InterruptedException
	{			
		System.out.println("Opeining The Browser");
	}
	
	@Test (groups = {"Smoke_Test_Case"} , priority = 2 , enabled = false)
	public  void Regestartion_Page_Tests() throws InterruptedException 
	{
		RGST.open_Browser();
		RGST.Regestartion_Page_Tests();
		System.out.println("Regestartion_Page_Tests Test Excuted");

	}
	
	
	
	@Test(groups = {"Regresssion_Test_Case" , "Smoke_Test_Case"} , priority = 0)
	public  void Create_Deposit_Account_Pages_Tests() throws InterruptedException 
	{
		Thread.sleep(3000);
		CDAT.open_Browser();
		CDAT.Create_Deposit_Account_Pages_Tests();
		System.out.println("Create_Deposit_Account_Pages_Tests Test Excuted");

	}
	
	@Test(groups = {"System_Testing_Cases"}, dependsOnMethods = {"Create_Deposit_Account_Pages_Tests"} , priority = 1)
	public  void Make_Deposit_To_Accounts_Pages_Tests() throws InterruptedException 
	{
		Thread.sleep(3000);
		MKDPST.open_Browser();
		MKDPST.Make_Deposit_To_Accounts_Pages_Tests();
		System.out.println("Make_Deposit_To_Accounts_Pages_Tests Test Excuted");

	}
	
	
	@AfterMethod
	public  void close_browser()
	{
		System.out.println("Closing The Browser");
				
	}


}
