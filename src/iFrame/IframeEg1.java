package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException
	{

        System.setProperty("webdriver.chrome.driver", "G:\\\\Software\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	   
	    Thread.sleep(3000);
	    driver.switchTo().frame("iframeResult");//by name
	   // driver.switchTo().frame(1); //by index number
	   // driver.switchTo().frame("iframeResul");  // by Id
	    
	    Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@type='button']")).click();
	   Thread.sleep(3000);
	   
	//   driver.switchTo().parentFrame();   // Child frame to immediate parent
	     driver.switchTo().defaultContent();  // Child frame to main page
 	   
	   driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[4]")).click();//-------> Button Clicke(Black and white) 
	   
	}

}
