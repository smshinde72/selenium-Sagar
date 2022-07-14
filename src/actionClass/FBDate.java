package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FBDate {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
				
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		Actions fb=new Actions(driver);
		
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(400);	
		fb.click(day).perform();
		
		for(int i=0;i<=10;i++)
		{
			fb.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		fb.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	//	fb.keyDown(firstName, Keys.SHIFT).sendKeys("a").keyUp(firstName, Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT).sendKeys("mar").build().perform();
		
		fb.keyDown(firstName, Keys.SHIFT).sendKeys("y").keyUp(firstName,Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT).sendKeys("ogendra").build().perform();
	}

}
