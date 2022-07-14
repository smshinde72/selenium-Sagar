package miscellaneous;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinksfromWebPage2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		ListIterator<WebElement> li = links.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next().getText());
		}
		
		
	}

}
