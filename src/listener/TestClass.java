package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)

public class TestClass 
{
  @Test
  public void MyMethod1() 
  {
	  Reporter.log("MyMehod1 is Running",true);
  }
  
  @Test
  public void MyMethod2() 
  {	  Assert.fail();
	  Reporter.log("MyMehod2 is Running",true);
  }
  
  @Test(dependsOnMethods = {"MyMethod2"})
  public void MyMethod3() 
  {
	  Reporter.log("MyMehod3 is Running",true);
  }
  
  
}
