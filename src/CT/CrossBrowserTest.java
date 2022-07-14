package CT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest 
{
	
	@Parameters("BrowserName")
  @Test
  public void CTTest(String Name)
  {
		WebDriver driver = null;
		if(Name.equals("firefox")) 
		{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\FireFox\\geckodriver.exe");
		 driver=new FirefoxDriver();
	  
		}	
		else if (Name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("https://paytm.com/");
  }
}



