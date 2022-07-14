package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());//by using size we finds nos of links present on that page
		
//		Iterator<WebElement> il = links.iterator();
//		while(il.hasNext())
//		{
//			System.out.println(il.next().getText());//by using getText we finds all links Names present on that page
//		}
		
//   OR----->
		
		for(WebElement fs:links)
		{
			System.out.println(fs.getText());
		}
			
			
	}

}
