package tNGseriesAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1
{
	@Test
	  public void KiteApp() 
	  {
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		
	  }

}
