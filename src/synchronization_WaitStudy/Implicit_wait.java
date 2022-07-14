package synchronization_WaitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  		
		  //Dynamic wait/ Selenium---->
		  //1. Implicit wait: 
//		  Applicable: complete webpage
//		  1 parameter: time value (seconds)
		 //2000ms> 100ms>1900 release wait time

		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  WebElement Reviews=driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
		  
	}
}
