package kiteAppPOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{

	//1) Variable Initialization 
	
		@FindBy(id="pin")private WebElement PIN;
		@FindBy(xpath="//button[@type='submit']")private WebElement ContinueButton;
		
	//2) Constructor
		public KitePinPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
	//3) Methodes
		public void SendPIN(String Pin)
		{
			PIN.sendKeys(Pin);
		}
		
		public void ClickContinueButton()
		{
			ContinueButton.click();
		}
		
		
}
