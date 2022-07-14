package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindsImagesPresentOnWebPage {


	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
				
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("indian f");
		
		Thread.sleep(1000);
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(result.size());
		System.out.println("-------------------------");
		
		Thread.sleep(2000);
		Iterator<WebElement> ir = result.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next().getText());
		}
		
		Thread.sleep(2000);
		for(WebElement fr:result)
		{
			String actualResult = fr.getText();
			String ExpectedResult = "indian flag";
			Thread.sleep(1000);
			if(actualResult.equals(ExpectedResult))
			{
			
				fr.click();
				break;
			}
			
		}
		System.out.println("=================================");
		driver.findElement(By.linkText("Images")).click();
		
		List<WebElement> AllImagesCount = driver.findElements(By.tagName("Img"));
		
		System.out.println(AllImagesCount.size());

	}
	

}
