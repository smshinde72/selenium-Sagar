package kiteAppPOMUsingTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class PracticeValidateUID {
	 
	WebDriver driver;
	KiteHomePage Home;
	KiteLoginPage Login;
	KitePinPage pin;
	Sheet MySheet;
	
	 @BeforeClass
	  public void OpenBrowser() throws EncryptedDocumentException, IOException
	 {
		 	System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		
			ChromeOptions Opt=new ChromeOptions();
//			Opt.addArguments("--headless"); //If chrome no need then use this method //Chrome Open Back ok of Eclipse App so we can direct look at consule and also on rsult 
			Opt.addArguments("-disable-notifications");	//Notification Disables		
			driver=new ChromeDriver(Opt);
			driver.get("https://kite.zerodha.com/");
			
			Login=new KiteLoginPage(driver);
			pin=new KitePinPage(driver);
			Home=new KiteHomePage(driver);
			
			File MyFile=new File("G:\\Software\\Selenium\\Read Excell Sheet\\Excell Sheet1.xlsx");
			MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		 
	  }
	 
	 @BeforeMethod
	  public void KiteLogin() throws InterruptedException
	 {
		
		 Login.SendUsername(MySheet.getRow(1).getCell(0).getStringCellValue());
		 Login.SendPassword(MySheet.getRow(1).getCell(1).getStringCellValue());
		 Login.ClickLoginButtion();
		 Thread.sleep(500);
		 pin.SendPIN(MySheet.getRow(1).getCell(2).getStringCellValue());
		 pin.ClickContinueButton();
		 Thread.sleep(1500); 
	  }
	
  @Test
  public void ValidateUserID() throws InterruptedException
  {
	  String ExcepteUserID = MySheet.getRow(1).getCell(0).getStringCellValue();
		String ActualUserID = Home.GetActualUserID();
		Thread.sleep(1500);
		Assert.assertEquals(ExcepteUserID, ActualUserID,"User ID are not Match TC Failed");
		Reporter.log("User ID are match TC Passed",true);
	 
	  }
  
  @AfterMethod
	public void LogOutKiteApp() throws InterruptedException 
	{
	    Thread.sleep(1500);
		Home.ClickLogoutButton();
	}
	
 

  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }

}
