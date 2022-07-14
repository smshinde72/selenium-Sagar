package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(1000);
			
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  Actions act=new Actions(driver);
	  Thread.sleep(2000);
	  
	WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

	//====Right Click on button
	//Method 1=========
//	act.moveToElement(RightClick).perform(); //Move Arrow of mouse on the element
//	
//	act.contextClick().perform();//Right click on the element
	
	//Method 2====
//	act.moveToElement(RightClick).contextClick().build().perform();//perform both action (move on the element and right click)
	Thread.sleep(2000);
	//Method 3===
//	act.contextClick(RightClick).perform();//perform both actions
	

	//====Right Click on Selenium button
	
	WebElement seleniumButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	
//	act.contextClick(seleniumButton).perform();//right clicked
//	act.click(seleniumButton).perform(); //only click
	
	
	// now double click on button Action method============>
	
	WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//	act.doubleClick(DoubleClick).perform();// method 1
//	act.moveToElement(DoubleClick).doubleClick().build().perform();  //Method 2
	//Method 3
	act.moveToElement(DoubleClick).perform();
	act.doubleClick().perform();
	
	
	
	
	
	}

}
