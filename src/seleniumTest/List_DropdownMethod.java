package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_DropdownMethod {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
         Select D=new Select(Day);
         Select M=new Select(month);
         Select Y=new Select(year);
         
         
         
         Thread.sleep(1000);
         D.selectByVisibleText("6");
         Thread.sleep(2000);
       //M.selectByVisibleText("Mar");
         M.selectByValue("11");
         Thread.sleep(2000);
         Y.selectByValue("1995");
         
         Thread.sleep(1000);
         driver.findElement(By.name("firstname")).sendKeys("Sagar");
         Thread.sleep(1000);
         driver.findElement(By.name("lastname")).sendKeys("Shinde");
         Thread.sleep(1000);
         driver.findElement(By.name("reg_email__")).sendKeys("Sagar7974@gmail.com");
         Thread.sleep(1000);
         driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Sagar7974@gmail.com");
         driver.findElement(By.id("password_step_input")).sendKeys("Sagar7974@");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@value='2']")).click();
         
		
	}

}
