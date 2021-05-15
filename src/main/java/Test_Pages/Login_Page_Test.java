package Test_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Locaters.Kb_Login_Page;
import Page_Locaters.Kb_Regestartion_Page;

public class Login_Page_Test 
{
	 String  Browser_Types = "chrome";
	 String URL = "http://mykidsbank.org";
	 
	 Kb_Login_Page Login_Pages = new Kb_Login_Page();
	 Regestartion_Page_Test RGST = new Regestartion_Page_Test();
	
	@BeforeMethod
	public  void open_Browser() throws InterruptedException
	{		
		Login_Pages.Browser(Browser_Types, URL);
	}
	
	@Test
	public  void Login_Page_Tests() 
	{
		Login_Pages.Login_Page();
		WebElement ele =Login_Pages.driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[1]/tbody/tr/td[1]/span[1]"));
		
		String Bank_name = ele.getText();
	
		//Assert.assertTrue(Bank_name.equals("SoftwareTestingExpr"), "AssertTrue test is failed!");
	    //System.out.println("AssertFalse Test is Passed!\n");


	  // Assert.assertFalse(Bank_name.equals("Wrong-String"), "AssertFalse test is failed!");

	    
	//    Assert.assertEquals("SoftwareTestingExprt", Bank_name, "AssertEquals test is failed!");

	}
	
	
	@Test
	public  void Login_Page_Tests1() 
	{
		Login_Pages.Login_Page();
		WebElement ele =Login_Pages.driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[1]/tbody/tr/td[1]/span[1]"));
		
		String Bank_name = ele.getText();
	
		Assert.assertTrue(Bank_name.equals("SoftwareTestingExprt"), "AssertTrue test is failed!");
	    //System.out.println("AssertFalse Test is Passed!\n");


	  //  Assert.assertFalse(Bank_name.equals("Wrong-String"), "AssertFalse test is failed!");

	    
	    //Assert.assertEquals("SoftwareTestingExprt", Bank_name, "AssertEquals test is failed!");

	}
	
	
	@AfterMethod
	public  void close_browser()
	{
		
				Login_Pages.driver.quit();
			
	}
	

}
