package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		KiteLoginPge Login=new KiteLoginPge(driver); //Calling KiteLoginPage Class And created object  
		
		Login.SendUserName();
		Login.SendPassword();
		Login.ClickLoginButton();
		Thread.sleep(1000);

		KitePinPage PIN =new KitePinPage(driver);//Calling KitePINPage Class And created object
		PIN.SendPIN();
		PIN.ClickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage HomePage=new KiteHomePage(driver);
		
		HomePage.ClickID();
		HomePage.ClickLogout();
		
	}

}
