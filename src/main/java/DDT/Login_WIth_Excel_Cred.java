package DDT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser_Config.Browser_Launcher;

public class Login_WIth_Excel_Cred  extends Browser_Launcher
{
	
	
	 String  Browser_Types = "chrome";
	 String URL = "http://mykidsbank.org";
	
	 

	@BeforeMethod 
	public  void open_Browser() throws InterruptedException
	{		
		Browser(Browser_Types, URL);
	}
	
	@Test
	public  void Login_Page_Tests( ) throws IOException 
	{
		   DataDriven a=new DataDriven();
			
			String Bank_IDs1 = a. getdata("Sheet1", 0, 0);
			String Banker_Username= a.getdata("Sheet1", 0, 1);
			String Banker_Password= a.getdata("Sheet1", 0, 2);
			
			
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")).sendKeys(Bank_IDs1);
		
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
