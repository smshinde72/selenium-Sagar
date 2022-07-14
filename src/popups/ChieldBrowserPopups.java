package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChieldBrowserPopups {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		
		String MainpageID = driver.getWindowHandle();//ID of main page
		System.out.println(MainpageID);
		System.out.println("================================");
		
		//System.out.println(driver.getWindowHandles());//id of multiple window  
		
		//OR
		
		Set<String> IDofAllWindowd = driver.getWindowHandles();
		
		Iterator<String> I = IDofAllWindowd.iterator();
		
//		while(I.hasNext())
//		{
//			System.out.println(I.next());
//		}
		
		String MainpageID1=I.next();//ID of main page
		String ChieldPageID = I.next(); //ID of Chield page
	
		//to chenge focus from main page to chield page
		Thread.sleep(1000);
		driver.switchTo().window(ChieldPageID);
		driver.manage().window().maximize();
		driver.findElement(By.id("the7-search")).sendKeys("Welcome");
		Thread.sleep(1000);
//		driver.close();//Close the current window
//		Thread.sleep(1000);
//		driver.quit();//Close the all window opened by selenium
		
		Thread.sleep(1000);
		//Again we need to focus on main page for finding element from main page
		driver.switchTo().window(MainpageID1);
		Thread.sleep(1000);
		WebElement St = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(St.getText());
		
		
		
	}

}
