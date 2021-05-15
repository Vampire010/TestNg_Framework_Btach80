package DDT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser_Config.Browser_Launcher;
import DDT_2.ReadExcel;
import DDT_2.Write_To_Excel;

public class Login_Test_Scenarios extends Browser_Launcher
{
	 String Expected_Bank_Name = "SoftwareTestingExprt";
	 String  Browser_Types = "chrome";
	 String URL = "http://mykidsbank.org";
	
	 Write_To_Excel Result = new Write_To_Excel();
	 
	 @DataProvider(name = "Authentication")
	 public   Object[][] credentials() throws Exception 
	 {

	         // The number of times data is repeated, test will be executed the same no. of times

	         // Here it will execute two times
		 ReadExcel read = new ReadExcel();
		 
		 return read.getCellData("/Users/girishg/eclipse-workspace/KidsBank_TestNG/Excel_Data/Data.xlsx","Sheet1");       

	 }

	@BeforeMethod 
	public  void open_Browser() throws InterruptedException
	{		
		Browser(Browser_Types, URL);
	}
	
	@Test(dataProvider = "Authentication")
	public  void Login_Page_Tests(String Bank_IDs, String Banker_Username , String Banker_Password ) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")).sendKeys(Bank_IDs);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")).sendKeys(Banker_Username);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")).sendKeys(Banker_Password);

		driver.findElement(By.xpath("//*[@id=\"clicked_when_enter_id\"]")).submit();
		

		
		
		try
		{
			WebElement ele =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[1]/tbody/tr/td[1]/span[1]"));
			
			String Actuall_Bank_names = ele.getText();
			
			System.out.println(Actuall_Bank_names);

			if(Expected_Bank_Name.equals(Actuall_Bank_names))
			{
				Result.Write_Me(Bank_IDs, Banker_Username, Banker_Password, "PASS");
				driver.quit();
				
			}
		
		}
		
		catch(Exception E)
		{
			
				Result.Write_Me(Bank_IDs, Banker_Username, Banker_Password, "FAIL");
				driver.quit();

			
			
		}
		
	}
	
	
	@AfterMethod
	public  void close_browser()
	{
		System.out.println("Test Passesd");
				
	}

}
