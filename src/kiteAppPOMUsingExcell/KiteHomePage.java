package kiteAppPOMUsingExcell;

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
		
		//3)Methods
		public void GetID(String UID)
		{
			String ActualID = ID.getText();
			String ExceptedID = UID;
			
			if(ActualID.equals(ExceptedID))
			{
				System.out.println("User Id math with excepted ID TC Pass");
			}	
				else
				{
					System.out.println("User Id NOT math with excepted ID TC Fail");
				}
		}
		
		public void ClickLogoutButton() throws InterruptedException
		{
			ID.click();
			Thread.sleep(500);
			LogOut.click();
		}
		
		
}
