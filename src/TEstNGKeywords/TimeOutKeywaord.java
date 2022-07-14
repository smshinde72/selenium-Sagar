package TEstNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutKeywaord
{
	 @Test (timeOut = 500)//timeOut keyword use to Fail the test case if time consuming 
	 	  public void C() throws InterruptedException
	  {
		 Thread.sleep(500);
		  Reporter.log("C is running",true);
	  }
	  
	  @Test
	  public void A()
	  {
		  Reporter.log("A is running",true);
	  }
	  
	  @Test
	  public void D()
	  {
		  Reporter.log("D is running",true);
	  }
	  
	  @Test
	  public void B()
	  {
		  Reporter.log("B is running",true);
	  }
}
