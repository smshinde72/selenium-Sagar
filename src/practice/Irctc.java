package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
				
		driver.get("https://www.air.irctc.co.in/");
		Thread.sleep(1000);
		WebElement origin = driver.findElement(By.id("stationFrom"));
		WebElement destination = driver.findElement(By.id("stationTo"));
		Actions act =new Actions(driver);
		Thread.sleep(1000);
		origin.sendKeys("Mumbai");
		//act.sendKeys(origin, "Mumbai").perform();
		
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		destination.sendKeys("Bengaluru");
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}

}
