package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		
//		2.	Alert is an interface which contains abstract methods like:
//			1. accept(): use to click on ok button.
//			2. dismiss(): use to click on cancel button.
//			3. getText(): use to get text present in a alert popup.
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText()); //3. getText(): use to get text present in a alert popup.
//		alt.accept(); //1. accept(): use to click on ok button.
//	    alt.dismiss();//2. dismiss(): use to click on cancel button.
		
	}

}
