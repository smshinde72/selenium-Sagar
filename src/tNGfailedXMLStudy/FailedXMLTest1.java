package tNGfailedXMLStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedXMLTest1 {
	@Test
	  public void C()
	  {
		  Reporter.log("C is running",true);
	  }
	  
	  @Test
	  public void A()
	  {
		 // Assert.fail();
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
