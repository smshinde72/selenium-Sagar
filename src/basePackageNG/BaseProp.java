package basePackageNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilityPackageNG.UtilityProp;

public class BaseProp 
{
	 protected static WebDriver driver;

	public void OpenChromeBrowser() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityProp.ReadDataFromPropertiesFile("URL"));
		Thread.sleep(1000);
		
	}
		public void OpenFireFoxBrowser() throws IOException, InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\FireFox\\geckodriver.exe");
			 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(UtilityProp.ReadDataFromPropertiesFile("URL"));
			Thread.sleep(1000);
		}
}
