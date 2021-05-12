package Page_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser_Config.Browser_Launcher;


public class Kb_Regestartion_Page  extends Browser_Launcher
{
	String First_Name = "sunny";
	String Last_Name = "rahul";
	String Your_Email = "k.sunnyrahul@gmail.com";
	String Re_enter_Email = "k.sunnyrahul@gmail.com";
	String Password = "sunny234";


	public  void KB_REg_Page() throws InterruptedException 
	{
		
		WebElement First_Names = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/span/input"));
		First_Names.sendKeys(First_Name);
		
		WebElement Last_Names = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[2]/td[2]/span/input"));
		Last_Names.sendKeys(Last_Name);

		
		WebElement Your_Emails = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[3]/td[2]/span/input"));
		Your_Emails.sendKeys(Your_Email);
		
		WebElement Re_enter_Emails = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[4]/td[2]/span/input"));
		Re_enter_Emails.sendKeys(Re_enter_Email);
		
		
		WebElement Passwords = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[5]/td[2]/span/input"));
		Passwords.sendKeys(Password);
		
		WebElement edu_check_box = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input"));
		edu_check_box.click();
	
		WebElement SighnUP = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[2]/tbody/tr/td[1]/span"));
		SighnUP.submit();
		Thread.sleep(3000);
		
		WebElement email_continue = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/button[3]"));
		email_continue.click();
		
		Thread.sleep(3000);

		
		WebElement Home_Verification = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/span/div/button"));
		Home_Verification.click();
				
	}
}
