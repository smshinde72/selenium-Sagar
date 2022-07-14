package testNGStudy;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGEg1 {
  @Test
  public void MyMethod1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		String IDofMainPage = it.next();
		String IDofSecondPage = it.next();
		
		//focus from main page to on 2nd page byusing getWindowHandles
		driver.switchTo().window(IDofSecondPage);
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//a[text()='PRACTICE']")).click();
		
		Thread.sleep(1000);
		System.out.println("Hi this is my method");//Print in console but not in report
		
		Reporter.log("Hi this is TestNg first method");//pring in report but not in console
		
		Reporter.log("Hi this is TestNg first method 1",true);//print in consloe as will as pring in report by using true 
		
  }
}
