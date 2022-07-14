package testNGIncludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGroupTest1 
{
	@Test(groups = "Sanity")
	  public void C()
	  {
		  Reporter.log("C is running",true);
	  }
	  
	  @Test(groups = "Regression")
	  public void A()
	  {
		  Reporter.log("A is running",true);
	  }
	  
	  @Test(groups = "Regression")
	  public void D()
	  {
		  Reporter.log("D is running",true);
	  }
	  
	  @Test(groups = "Sanity")
	  public void B()
	  {
		  Reporter.log("B is running",true);
	  }

}
