package TEstNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnablesKeyward {
	
	@Test(enabled = false)  //enabled keyword use to disable test method
	  public void C()
	  {
		  Reporter.log("C is running",true);
	  }
	  
	  @Test(enabled = true)
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
