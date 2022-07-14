package synchronization_WaitStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fluentwait {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();

//		  3. Fluent wait:
//			   Applicable: single element
//			   1 parameter: time value(seconds)//1000ms
//			   2 parameter: Condition (isselected, isdisplayed, isenabled)
//			   3 frequency: time(time in sec)- 5 m sec>10ms

		    driver.get("https://vctcpune.com/");		    
			WebElement Wait=driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
			
			
		  
		  
		  
	}

}
