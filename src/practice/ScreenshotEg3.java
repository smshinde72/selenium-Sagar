package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotEg3 {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "G:\\\\Software\\\\Selenium\\\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.amazon.in/ref=nav_logo");
	    
	    File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    String xyz = RandomString.make(4);
	    
	    File Dest =new File("G:\\Software\\Screenshot\\Amazon"+xyz+".png");
	    
	    FileHandler.copy(SS, Dest);

	}

}
