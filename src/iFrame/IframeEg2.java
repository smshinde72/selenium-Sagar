package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "G:\\\\Software\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
		    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			Thread.sleep(2000);
			
			driver.switchTo().frame("frame1"); //------> Frame1
			
		   // driver.findElement(By.tagName("input")).sendKeys("Welcome"); //-----OR-----
		    
		    WebElement AB = driver.findElement(By.tagName("input"));
		    AB.sendKeys("Welcome");
		    
		    driver.switchTo().frame("frame3");//------> Frame3
		    Thread.sleep(2000);
		    driver.findElement(By.id("a")).click();
		    
		    Thread.sleep(2000);
		    driver.switchTo().defaultContent();
		    driver.switchTo().frame("frame2");  //------> Frame 2
		    WebElement DropDown = driver.findElement(By.id("animals"));
		    Select xyz =new Select(DropDown);    
		    Thread.sleep(2000);
		    xyz.selectByVisibleText("Baby Cat"); //by text  usinng
		 //   xyz.selectByIndex(2); //by Index usinng
		    
		   
		    
	}

}
