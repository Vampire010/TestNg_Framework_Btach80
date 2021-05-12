package Make_Deposit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser_Config.Browser_Launcher;
import Page_Locaters.Kb_Login_Page;

public class Make_Deposit_To_Accounts extends Kb_Login_Page
{
	String Posting_Date = "05/10/2021";
	String Description = "Course Fee";
	String Amount = "12000";
	
	
	public void Make_Deposit_In_To_Accounts() throws InterruptedException
	{
		WebElement Click_Make_Deposit_Account= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[3]/td/span"));
		Click_Make_Deposit_Account.click();
		
		WebElement Posting_Dates= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[3]/td/input"));
		Posting_Dates.clear();

		Posting_Dates.sendKeys(Posting_Date);
		
		
		WebElement Descriptions = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[5]/td/input"));
		Descriptions.sendKeys(Description);
		
		WebElement Amounts =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[7]/td/input"));
		Amounts.sendKeys(Amount);
		
		WebElement Select_account_holders = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[9]/td/table/tbody/tr[1]/td"));
		Select_account_holders.click();

		WebElement Select_account_holders1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[9]/td/table/tbody/tr[3]/td"));
		Select_account_holders1.click();
		
		Thread.sleep(3000);
		WebElement Deposit_Submit = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[10]/td/table/tbody/tr/td[1]/span"));
		Deposit_Submit.click();
		Thread.sleep(3000);

		WebElement Confirm_Deposit_Submit = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td/table/tbody/tr[7]/td/div[2]/span[1]"));
		Confirm_Deposit_Submit.click();
		
	}
}
