package testPackageNGValidateUID;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import basePackageNG.BaseProp;
import utilityPackageNG.UtilityListener;

public class Listener extends BaseProp implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			UtilityListener.CaptureScreenshotNG(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("TC failed check again",true);
	}
}
