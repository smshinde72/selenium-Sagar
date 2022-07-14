package testPackageNGValidateUID;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import basePackageNG.BaseProp;
import kitePOMUsingTestNGNew.KiteHomePage;
import kitePOMUsingTestNGNew.KiteLoginPage;
import kitePOMUsingTestNGNew.KitePinPage;
import utilityPackageNG.UtilityProp;

@Listeners(testPackageNGValidateUID.Listener.class)

public class ValidateUIDByListener  extends BaseProp
{   
	KiteHomePage Home;
	KiteLoginPage Login;
	KitePinPage Pin;
	
	 
	@BeforeClass
	public void LaunchingBrowser() throws IOException, InterruptedException
	{
		OpenChromeBrowser();
		Login=new KiteLoginPage(driver);
		Home=new KiteHomePage(driver);
		Pin=new KitePinPage(driver);
	   
	}
	

	@BeforeClass
	public void LoginApp() throws EncryptedDocumentException, IOException
	{
		Login.SendUsername(UtilityProp.ReadDataFromPropertiesFile("UID"));
		Login.SendPassword(UtilityProp.ReadDataFromPropertiesFile("PWD"));
		Login.ClickLoginButtion();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Pin.SendPIN(UtilityProp.ReadDataFromPropertiesFile("PIN"));
		Pin.ClickContinueButton();
	}
  @Test
  public void ValidateKiteUID() throws IOException
  {
	  Assert.assertEquals(UtilityProp.ReadDataFromPropertiesFile("UID"), Home.GetActualUserID(),"User ID Are not March TC Failed");
	  Reporter.log("User ID Are  March TC Passed",true);
	//  UtilityProp.CaptureScreenshotNG(driver, TCID);
	 Assert.fail();
	  
  }
  @AfterMethod
  public void LogoutApp() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Home.ClickLogoutButton();
	
	  
  }
  
  @AfterClass
  public void CloaseBrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.close();
  }
}
