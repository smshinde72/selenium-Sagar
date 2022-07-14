package kiteAppPOMUsingExcell;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassExcell {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);

		File MyFile=new File("G:\\Software\\Selenium\\Read Excell Sheet\\Excell Sheet1.xlsx");
		String ID = WorkbookFactory.create(MyFile).getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();
		String PWD = WorkbookFactory.create(MyFile).getSheet("Sheet3").getRow(1).getCell(1).getStringCellValue();
		String PIN = WorkbookFactory.create(MyFile).getSheet("Sheet3").getRow(1).getCell(2).getStringCellValue();
		
//		System.out.println(ID);
//		System.out.println(PWD);
//		System.out.println(PIN);
		
		Thread.sleep(1000);
		KiteLoginPage LogIN=new KiteLoginPage(driver); //Login Page Details pass and click on Login Button
		LogIN.SendUsername(ID);
		LogIN.SendPassword(PWD);
		LogIN.ClickLoginButtion();
		
		Thread.sleep(1000);
		KitePinPage pin=new KitePinPage(driver); //PIN Page Details pass and click on Continue Button
		pin.SendPIN(PIN);
		pin.ClickContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage Home=new KiteHomePage(driver);
		Home.GetID(ID);
		Home.ClickLogoutButton();
		
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
