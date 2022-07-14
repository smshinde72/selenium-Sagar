package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChieldBrowserPopus {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		Thread.sleep(1000);  
			
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		Thread.sleep(1000);
		


     	Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' HOTELS ']")).click();
        String xyz = driver.getWindowHandle();
		System.out.println(xyz);
		System.out.println("=========================");

		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
	 	 String MainPageID = it.next();
	   	 String BusesPageID = it.next();
		 String FlightsPageID = it.next();
		 String HotelsPageID = it.next();

//		 driver.switchTo().window(BusesPageID); //change focus from main page to BusPage
//    	driver.findElement(By.xpath("//div[@class='Nav-icons RetiringRoom']")).click();
    	
    	driver.switchTo().window(FlightsPageID);
    	driver.findElement(By.id("eType")).click();

		
	}

}
