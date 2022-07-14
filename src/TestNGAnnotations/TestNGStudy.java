package TestNGAnnotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGStudy 
{
  @Test
  public void ValidateUserID() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
	  driver.get("https://kite.zerodha.com/#loggedout");
	 
	  
	 Reporter.log("Kite UserID Mateched TC pass",true); 
  }
  
  @Test
  public void ValidateFbLoginPage() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(200);		
	  driver.get("https://www.facebook.com/login/");
	  
	 Reporter.log("FB login page opened TC pass",true); 
  }
  
  @BeforeClass
  public void OpenBrowser()
  {
	  
	  Reporter.log("Browser Open",true);
  }
  
  @BeforeMethod
  public void KiteLoginPage() 
  {
	 Reporter.log("Login Success",true);
  }
  
  @AfterMethod
  public void KiteLogout() 
  {
	Reporter.log("Logged Out.......",true);  
  }
  
  @AfterClass
  public void closeBrowser() 
  {
	  
	  Reporter.log("Close browser",true);
  }
}
