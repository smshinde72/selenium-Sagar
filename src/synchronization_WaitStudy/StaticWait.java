package synchronization_WaitStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  		
		  driver.get("https://vctcpune.com/selenium/practice.html");
		   Thread.sleep(500);//Wait time is fixed, irrespective of condition. Script will be hold for mentioned seconds.

	}

}
