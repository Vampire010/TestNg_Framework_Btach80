package Create_a_New_Deposit_Account;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import Page_Locaters.Kb_Login_Page;

public class Create_Deposit_Account extends Kb_Login_Page
{
	
	String Displayed_name = "James";
	String Login_username = "james214";
	String Login_password = "james214";
	
	
	public void Create_New_Deposit_Account()
	{
		
		try
		{
			
		//Accounts Tab
		WebElement Accont_Click= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[1]/td[3]/img[3]"));
		Accont_Click.click();
		}
		catch(Exception E)
		{
			System.out.println("Existing Account");
			
		}
		// Click on Create a new deposit account   
		WebElement Create_New_Deposit_Account_clik= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[1]/td/span"));
		Create_New_Deposit_Account_clik.click();
		
		
		//Enter Displayed name
		WebElement Displayed_names = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[1]/td[2]/input"));
		Displayed_names.sendKeys(Displayed_name);
		
		
		//Enter Login_username
		WebElement Login_usernames =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[2]/td[2]/input"));
		Login_usernames.sendKeys(Login_username);
		
		//Login_password
		WebElement Login_passwords = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[3]/td[2]/input"));
		Login_passwords.sendKeys(Login_password);

		//submit_Btn

		WebElement New_Accnt_Submit = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[2]/tbody/tr/td[1]/span"));
		New_Accnt_Submit.submit(); 
		
	
		
		
	}

}
