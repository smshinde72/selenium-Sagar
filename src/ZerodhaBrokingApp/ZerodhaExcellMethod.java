package ZerodhaBrokingApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaExcellMethod {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		 File MyFile=new File("G:\\Software\\Selenium\\Read Excell Sheet\\Excell Sheet1.xlsx");
		 Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		 String UserName = MySheet.getRow(1).getCell(0).getStringCellValue();
		 String Password = MySheet.getRow(1).getCell(1).getStringCellValue();
		 String PINCode = MySheet.getRow(1).getCell(2).getStringCellValue();
		 
		 System.out.println(UserName);
		 System.out.println(Password);
		 System.out.println(PINCode);
		
		 Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		  WebDriver driver=new ChromeDriver();
		  Thread.sleep(200);
				
		  driver.get("https://kite.zerodha.com/#loggedout");
		  
		  WebElement UID = driver.findElement(By.id("userid"));
		  WebElement PW = driver.findElement(By.id("password"));
		  WebElement LonginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		  Thread.sleep(200);
		  UID.sendKeys(UserName);
		  PW.sendKeys(Password);
		  LonginButton.click();
		  
		  Thread.sleep(1000);
		  WebElement PIN = driver.findElement(By.id("pin"));
		  WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		  PIN.sendKeys(PINCode);
		  ContinueButton.click();
		  
		  Thread.sleep(1000);
		  WebElement UserID = driver.findElement(By.xpath("//span[@class='user-id']"));
		  String ActualID = UserID.getText();
		   String ExceptedID = UserName;
		  Thread.sleep(1000);
		  if(ActualID.equals(ExceptedID))
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
