package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver Driver=new ChromeDriver();
        
        Driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
        
//        Thread.sleep(2000);
//        Driver.findElement(By.id("hide-textbox")).click();
//        Driver.findElement(By.name("show-hide")).isDisplayed();
//        System.out.println(Driver.findElement(By.name("show-hide")).isDisplayed());
//        //-----OR-----------
//        WebElement Show = Driver.findElement(By.name("show-hide"));
//        boolean S=Show.isDisplayed();
//        System.out.println(S);
//        
//       Thread.sleep(2000);
//        Driver.findElement(By.id("show-textbox")).click();
//        Driver.findElement(By.name("show-hide")).isDisplayed();
//        System.out.println(Driver.findElement(By.name("show-hide")).isDisplayed());
//        //------OR-----
//        WebElement Hide = Driver.findElement(By.name("show-hide"));
//        boolean H=Hide.isDisplayed();
//        System.out.println(H);
//       
//        ========By using conditopns=========
        
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
