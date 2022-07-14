package screenshoot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String abc=RandomString.make(3);
		
		File Dest=new File("G:\\Software\\Screenshot\\Screenshot1"+abc+".png");
		
		FileHandler.copy(src, Dest);
		
	}

}
