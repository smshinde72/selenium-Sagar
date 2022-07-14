package screenshoot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotEg2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(500);
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(1000);
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Thread.sleep(1000);
		
		String Str=RandomString.make(3);
		
		File Location = new File("G:\\Software\\Screenshot\\Screenshot"+Str+".png");
		//Thread.sleep(1000);
		
	    FileHandler.copy(ss, Location);
	  
		
		

	}

}
