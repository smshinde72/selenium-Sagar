package screenshoot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshootEg1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
	

		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
				
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//------>Temporary Saved
		
		File Destination = new File("G:\\Software\\Screenshot\\Screenshot1.png");//----> Saved at desired location
		
		FileHandler.copy(Source, Destination);
		
		
	}

}
