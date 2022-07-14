package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPge
{
	//1) Variable Initialization
	
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")WebElement LoginButton;

	//2) Constructor
	
	public KiteLoginPge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3) Methodes
	
	public void SendUserName()
	{
		UserID.sendKeys("KT0818");
	}
	
	public void SendPassword()
	{
		Password.sendKeys("Sarkar1@");
	}
	
	public void ClickLoginButton()
	{
		LoginButton.click();
	}
}
