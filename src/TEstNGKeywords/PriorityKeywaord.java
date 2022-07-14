package TEstNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeywaord {
	@Test(priority = 1) //priority keyword use to Set Execution Order
	  public void C()
	  {
		  Reporter.log("C is running",true);
	  }
	  
	  @Test(priority = 3)
	  public void A()
	  {
		  Reporter.log("A is running",true);
	  }
	  
	  @Test(priority = 2)
	  public void D()
	  {
		  Reporter.log("D is running",true);
	  }
	  
	  @Test(priority = 4)
	  public void B()
	  {
		  Reporter.log("B is running",true);
	  }
}
