package setPosistionAndSize;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionEg1 {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
				
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		System.out.println(driver.manage().window().getPosition());
		
		// To set Size, create object of Dimension Class and pass width and Height values
		org.openqa.selenium.Point p= new org.openqa.selenium.Point(100, 80);
		
		// using SetSize method we can set size of browser window
		driver.manage().window().setPosition(p);
		
		
		
		


	}

}
