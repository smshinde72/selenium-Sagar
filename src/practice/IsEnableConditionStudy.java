package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableConditionStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");

	        WebDriver Driver=new ChromeDriver();
	        
	        Driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
	        
	        WebElement hidebutton = Driver.findElement(By.id("hide-textbox"));
	        WebElement showbutton = Driver.findElement(By.id("show-textbox"));
	        WebElement showtextbox = Driver.findElement(By.name("show-hide"));
	        hidebutton.click();
	        if(showtextbox.isDisplayed())
	        {
	        	System.out.println("Text box is displayed");
	        }
	        else
	        {
	        	//showbutton.click();
	        if(showtextbox.isDisplayed())
	        {
	        System.out.println("Text Box is Displayed Now");
	        }
	        else
	        {
	        	System.out.println("Text box is not yet displayed");
	        }
	        
	        }

	}

}
