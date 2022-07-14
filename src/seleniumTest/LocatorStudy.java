package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStudy {


	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://vctcpune.com/selenium/practice.html");
		
		//Locater : xpath method using
		//xpath by Atribute--->  //tagname[@attribute name = ‘attribute value’]
		
//		Driver.findElement(By.xpath("//input[@value='Radio2']")).click();
//		Driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();

		//xpath by text.
		//Driver.findElement(By.xpath("//legend[text()='Element Displayed Example']']")).click();
		//Driver.findElement(By.xpath("//input[contains(@value,'Radio3')]")).click();
		Thread.sleep(1000);
		//Driver.findElement(By.xpath("//input[@value='Radio'][4]")).click(); //xpath by index
				
		
//		Driver.get("https://www.facebook.com/login/");
//		Thread.sleep(1000);
//		Driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();

		
		
		
		
	}

}
