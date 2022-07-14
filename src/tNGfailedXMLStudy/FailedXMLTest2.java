package tNGfailedXMLStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedXMLTest2 {
	@Test
	  public void P()
	  {
		  Reporter.log("P is running",true);
	  }
	  
	  @Test
	  public void Q()
	  {
		  Reporter.log("Q is running",true);
	  }
	  
	  @Test
	  public void R()
	  {
		  Assert.fail();
		  Reporter.log("R is running",true);
	  }
	  
	  @Test
	  public void S()
	  {
		  Reporter.log("S is running",true);
	  }
}
