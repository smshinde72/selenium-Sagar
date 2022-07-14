package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
	
		Driver.get("https://auth.discoveryplus.in/login");
		
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		
		System.out.println(Driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled());
		
		WebElement butten = Driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean Disable=butten.isEnabled();
		
		System.out.println(Disable);
		
		Driver.findElement(By.id("mobileNumber")).sendKeys("8806527010");
		Thread.sleep(2000);
		
//		Driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
//		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		
		WebElement ButtonEnable = Driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean enable=ButtonEnable.isEnabled();
		System.out.println(enable);
		

		
		
		
		
	

	}

}
