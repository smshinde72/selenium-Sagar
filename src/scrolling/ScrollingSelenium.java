package scrolling;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollingSelenium {

	public static void main(String[] args) throws InterruptedException
	
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  Thread.sleep(1000);
		  js.executeScript("window.scrollBy(90,1100)");
		  
		  
	}

}
