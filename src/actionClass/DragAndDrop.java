package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  Thread.sleep(1000);
				
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  
		  Actions act =new Actions(driver);//first we create object of Actions class
		  WebElement Source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));//find source element
		 WebElement Destination = driver.findElement(By.id("loan"));//Find the element of destination
		  
		 //Method 1========
//		 act.moveToElement(Source).perform();
//		 act.clickAndHold().perform();
//		 act.moveToElement(Destination).perform();
//		 act.release().perform();
		  
		 //Method 2======
//		 act.clickAndHold(Source).perform();
//		 act.release(Destination).perform();
		 
		 //Method 3=====
//		 act.clickAndHold(Source).release(Destination).build().perform();
		 
		 //Method 4=====
		 act.dragAndDrop(Source, Destination).perform(); 
		 
		 Thread.sleep(1000);
		 WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 WebElement Dest = driver.findElement(By.id("amt8"));

		 act.dragAndDrop(src, Dest).perform();
		 
		 
	}

}
