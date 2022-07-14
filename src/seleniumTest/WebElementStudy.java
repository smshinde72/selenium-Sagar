package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementStudy {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Driver =new ChromeDriver();
		
		Driver.get("https://www.facebook.com/login/");
		
		// sendKeys--> This method is use to enter value in test box
//		Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sagar7974@");
 //       Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sagarshinde");
		
        // Clear --->This method is use to clear value from text box
   //     Driver.findElement(By.xpath("//input[@type='password']")).clear();
        
        //Click--->this method use to click buttons or options
        Driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		// getText--->this method is use o get text from webpage
        
      Driver.findElement(By.id("identify_email")).sendKeys("Sagar@gmail.com");
       Driver.findElement(By.name("did_submit")).click();
        
        //isSelected--->This method use to verify radio/check box is selected
   
        
	}

}
