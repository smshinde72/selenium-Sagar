package testPackageNGValidateUID;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePackageNG.Base;
import kitePOMUsingTestNGNew.KiteHomePage;
import kitePOMUsingTestNGNew.KiteLoginPage;
import kitePOMUsingTestNGNew.KitePinPage;
import utilityPackageNG.Utility;

public class ValidateKiteAppUserID extends Base
{//  protected WebDriver driver;
	KiteHomePage Home;
	KiteLoginPage Login;
	KitePinPage Pin;
	String TCID="1122";
	
	@BeforeClass 
	public void LaunchingBrowser()
	{
		OpenBrowser();
		Login=new KiteLoginPage(driver);
		Home=new KiteHomePage(driver);
		Pin=new KitePinPage(driver);
	   
		
	}
	
	@BeforeClass
	public void LoginApp() throws EncryptedDocumentException, IOException
	{
		Login.SendUsername(Utility.GetDataFromExcell(1, 0));
		Login.SendPassword(Utility.GetDataFromExcell(1, 1));
		Login.ClickLoginButtion();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Pin.SendPIN(Utility.GetDataFromExcell(1, 2));
		Pin.ClickContinueButton();
		
	}
	
  @Test
  public void ValidateID() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(Utility.GetDataFromExcell(1, 0), Home.GetActualUserID(),"Excepted User ID and Actual UserID are not Match TC Failed");
	  Utility.CaptureScreenshotNG(driver, TCID);
	  Reporter.log("Excepted User ID and Actual UserID Match TC Passed",true);
  
  }
  
  @AfterMethod
  public void LogoutApp() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Home.ClickLogoutButton();
	  Thread.sleep(1000);
	
  }
  
 @AfterClass
 public void CloseBrowser() throws InterruptedException
 {
	 Thread.sleep(1000);
	 driver.close();
 }
}
