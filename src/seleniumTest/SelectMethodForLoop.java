package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodForLoop {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		WebElement Day = driver.findElement(By.id("day"));
		Thread.sleep(500);
		Select D=new Select(Day);
		
		for(int i=9;i<=24;i++) //Asending order
		{
		  D.selectByIndex(i);
		
		}
		
		for(int i=24;i>=9;i--)
		{
			D.selectByIndex(i);
		}
		
	}

}
