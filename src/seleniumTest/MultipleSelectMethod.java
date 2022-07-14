package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectMethod {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement cars = driver.findElement(By.id("cars"));
		
		Select C =new Select(cars);
		Thread.sleep(500);
		System.out.println(C.isMultiple()); //---->if multiple select is possible then pint "True" therwise false
		
		C.selectByIndex(3);
		C.selectByVisibleText("Volvo");
		C.selectByIndex(2);
		
		Thread.sleep(1000);
		
		// C.deselectAll(); //---->We can deselect all from selected
		
		C.deselectByIndex(2);    //---->We can deselect which is want from  selected
		C.deselectByVisibleText("Volvo");
	}

}
