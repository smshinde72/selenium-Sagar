package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)

public class TestClass2 
{
  @Test
  public void MyMethod4() 
  {
	  Reporter.log("MyMehod4 is Running",true);
  }
  
  @Test
  public void MyMethod5() 
  {	  Assert.fail();
	  Reporter.log("MyMehod5 is Running",true);
  }
  
  @Test(dependsOnMethods = {"MyMethod5"})
  public void MyMethod6() 
  {
	  Reporter.log("MyMehod6 is Running",true);
  }
  
  
}
