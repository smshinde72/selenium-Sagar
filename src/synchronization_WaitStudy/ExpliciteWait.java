package synchronization_WaitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();		
		
//		2. Explicit wait:
//		   Applicable: single element
//			   1 parameter: time value(seconds)
//			   2 parameter: Condition (isselected, isdisplayed, isenabled)

		    driver.get("https://vctcpune.com/");		    
			WebElement Wait=driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));
			
			WebDriverWait W=new WebDriverWait(driver,Duration.ofSeconds(20));
			
			W.until(ExpectedConditions.visibilityOf(Wait));
		  
	}

}
