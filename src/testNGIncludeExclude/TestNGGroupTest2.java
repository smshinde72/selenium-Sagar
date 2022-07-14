package testNGIncludeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGroupTest2
{
	@Test(groups = "Regression")
	  public void P()
	  {
		  Reporter.log("P is running",true);
	  }
	  
	  @Test(groups = "Sanity")
	  public void Q()
	  {
		  Reporter.log("Q is running",true);
	  }
	  
	  @Test(groups = "Sanity")
	  public void R()
	  {
		  Reporter.log("R is running",true);
	  }
	  
	  @Test(groups = "Regression")
	  public void S()
	  {
		  Reporter.log("S is running",true);
	  }

}
