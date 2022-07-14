package utilityPackageNG;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	
	//Read Data from excell Sheet
	public static String GetDataFromExcell(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File MyFile=new File("G:\\Software\\Selenium\\Read Excell Sheet\\Excell Sheet1.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		String Value = MySheet.getRow(row).getCell(cell).getStringCellValue();
		return Value;
	}

	//Take ScreenShot of TC is passed
	 public static void CaptureScreenshotNG(WebDriver driver, String TCID) throws IOException
	 {
		 File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File Dest =new File("G:\\Software\\Screenshot\\MyNGScreenshot"+TCID+".png");
		 
		org.openqa.selenium.io.FileHandler.copy(Src, Dest);
	 }
	
}
