package kiteAppPOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
	// 1)Variable Intialization
	
	@FindBy(id="userid")private WebElement UserName;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
	
	//2) Constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3) Methodes
	public void SendUsername(String UserID)
	{
		UserName.sendKeys(UserID);
	}
	
	public void SendPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	
	public void ClickLoginButtion()
	{
		LoginButton.click();
	}
}
