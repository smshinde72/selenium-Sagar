package actionClass;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.DownAction;

public class KeyBoardActonEg1 {

	private static final CharSequence DownAction = null;

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  Thread.sleep(1000);
				
		  driver.get("https://vctcpune.com/selenium/practice.html");
		// how to send keys using Actions class
		  
		//2. create object of Actions Class
		  Actions act=new Actions(driver);
		  
		//1.Find Element
		  WebElement SelectButton = driver.findElement(By.id("dropdown-class-example"));
		  
		//  SelectButton.click();
		  
		 act.click(SelectButton).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  
		  
		  
	
		
	}

}
