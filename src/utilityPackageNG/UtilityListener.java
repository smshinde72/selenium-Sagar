package utilityPackageNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bouncycastle.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityListener
{
	public static String ReadDataFromPropertiesFile(String Key) throws IOException
	{
		java.util.Properties P=new java.util.Properties();
	
		FileInputStream File=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium Project\\MyProperty.properties");
	
		P.load(File);
	
		String value = P.getProperty(Key);
		return value;
			
	}
	
			 public static void CaptureScreenshotNG(WebDriver driver, String TCID) throws IOException
		 {
			 File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			 File Dest =new File("G:\\Software\\Screenshot\\MyNGScreenshot"+TCID+".png");
			 
			org.openqa.selenium.io.FileHandler.copy(Src, Dest);
		 }

}
