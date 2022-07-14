package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	//1) Variable Iniatialization
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement ID;
	
	@FindBy(xpath="//a[@target='_self']")private WebElement LogOut;
	
	//2) Constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3) Methodes
	public void ClickID()
	{
		String ActutedID = ID.getText();
		String ExceptedID ="KT0818";
		
		if(ActutedID.equals(ExceptedID))
		{
			System.out.println("ID is mateched as per required TC Passed");
		}	
		else
		{
			System.out.println("ID is not mateched as per required TC Failed");	
		}
		
	}
	
	public void ClickLogout() throws InterruptedException 
	{
		ID.click();
		Thread.sleep(1000);
		LogOut.click();
	}
}




