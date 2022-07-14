package kiteAppPOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.logging.Log;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;

public class ValidateKiteAppUserName {
  
	//private static final Object UN = null;
	WebDriver driver;
	KiteLoginPage Login;
	KitePinPage pin;
	KiteHomePage Home;
	Sheet MySheet;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		Login=new KiteLoginPage(driver); //Initilize Global element
		pin =new KitePinPage(driver);
		Home=new KiteHomePage(driver);
		
		File MyFile=new File("G:\\Software\\Selenium\\Read Excell Sheet\\Excell Sheet1.xlsx");
		MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
	}
	@BeforeMethod
	public void LoginKiteApp ()
	{
		 String UN = MySheet.getRow(1).getCell(0).getStringCellValue();
		 String PWD = MySheet.getRow(1).getCell(1).getStringCellValue();
		 String PIN = MySheet.getRow(1).getCell(2).getStringCellValue();
		 
		Login.SendUsername(UN);
		Login.SendPassword(PWD);
		Login.ClickLoginButtion();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));
		pin.SendPIN(PIN);
		pin.ClickContinueButton();
	}
	
	@Test
  public void ValidateUserID () 
  {
		String ExcepteUserID = MySheet.getRow(1).getCell(0).getStringCellValue();
		String ActualUserID = Home.GetActualUserID();
		
		Assert.assertEquals(ExcepteUserID, ActualUserID,"User ID are not Match TC Failed");
		Reporter.log("User ID are match TC Passed",true);
  }
	
	@AfterMethod
	public void LogOutKiteApp() throws InterruptedException 
	{
		Home.ClickLogoutButton();
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(1500);
		driver.close();
	}
	
	
	
}
