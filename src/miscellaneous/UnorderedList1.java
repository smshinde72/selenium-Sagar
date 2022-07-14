package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList1 {

	public UnorderedList1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
				
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(links.size());
		
		for(WebElement ll:links)//print links names
		{
			System.out.println(ll.getText());
		}
		
		Thread.sleep(2000);
		for(WebElement ll:links)
		{
			String actualResult = ll.getText();
			String expectedResult = "honda amaze";
			Thread.sleep(1000);
			if(actualResult.equals(expectedResult))
			{
				ll.click();
				break;
			}
						
		}
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();

	}

}
