package setPosistionAndSize;

import java.sql.Driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDimension {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000); 
		
		System.out.println(driver.manage().window().getSize());
				
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		// To set Position of browser, create object of Point class and pass X and Y values
		Dimension D=new Dimension(900, 660);
		
		// Using setPostion method we can set Position of browser
		driver.manage().window().setSize(D);
	}

}
