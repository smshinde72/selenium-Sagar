package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Software\\Selenium\\chromedriver_win32//chromeDriver.exe");
	
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.facebook.com/login/");  //open application
		
		//Driver.close();  //close current tab of browser
		
		//Driver.quit(); //Cloase All tabs of browsers which opened by selenium
		
       //.manage().window().maximize();  //current tab maximize
        
        //Driver.manage().window().minimize();  //current tab minimize
		
		//Driver.navigate().to("https://www.instagram.com/accounts/login/");  //Navigate to another page
		//Driver.navigate().back();  //Navigate to back
		//Driver.navigate().forward();  //Navigate to Forward
		
		 //System.out.println(Driver.getTitle());  //Finding/ Print Title
		 //String Title=Driver.getTitle();
		 //System.out.println("The page title is "+ Title );
		 
		//System.out.println(Driver.getCurrentUrl());
		//String URL =Driver.getCurrentUrl();
		//System.out.println("The current page URl" +URL); 
		
	}

}
