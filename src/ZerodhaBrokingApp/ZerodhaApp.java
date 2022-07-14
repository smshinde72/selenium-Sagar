package ZerodhaBrokingApp;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaApp {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  Thread.sleep(200);
				
		  driver.get("https://kite.zerodha.com/#loggedout");
		  
		  WebElement UID = driver.findElement(By.id("userid"));
		  WebElement PW = driver.findElement(By.id("password"));
		  WebElement LonginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		  Thread.sleep(200);
		  UID.sendKeys("KT0818");
		  PW.sendKeys("Sarkar1@");
		  LonginButton.click();
		  
		  Thread.sleep(1000);
		  WebElement PIN = driver.findElement(By.id("pin"));
		  WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		  PIN.sendKeys("351735");
		  ContinueButton.click();
		  
		  Thread.sleep(1000);
		  WebElement UserID = driver.findElement(By.xpath("//span[@class='user-id']"));
		  String ActualID = UserID.getText();
		   String ExceotedID = "KT088";
		  Thread.sleep(1000);
		  if(ActualID.equals(ExceotedID))
		  {
			  Thread.sleep(1000);
			  System.out.println("UserID is matching TC is PASSED");
		  }

		  else {
			  System.out.println("UserID is not matching TC is FAILED");
			  }
		  
	       UserID.click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//a[@target='_self']")).click();
	       Thread.sleep(2000);
	       driver.quit();
	       
	
	}

}
