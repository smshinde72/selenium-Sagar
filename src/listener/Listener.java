package listener;

 import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{ //Listener is listen each and every event of that class
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("test case passed successfully",true);	
		Reporter.log("Name of success Test method is "+result.getName(),true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Test Case failed plz check again",true);
		Reporter.log("Name of failed test method is "+result.getName(),true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("test case skipped, please check dependant method");
		Reporter.log("Name of skipped test method is "+result.getName(),true);
	}

}
