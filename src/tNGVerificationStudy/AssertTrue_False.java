package tNGVerificationStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue_False {
  @Test
  public void MyMethod() 
  {
	  boolean a=true;
	  boolean b=false;
	  String c=null;
	
	  //1) AssertTrue:>
//	  Assert.assertTrue(a,"TC Fail Given value is False");
//	  Reporter.log("TC pass given value is True",true);

	//2) AssertFalse:>
	  
//	  Assert.assertFalse(a,"TC fail Given values is true");
//	  Reporter.log("TC pass Given values is False",true);
	  
	  //3) AssertNull---->
	  
	  Assert.assertNull(c,"TC fail, test found values is not null");
	  Reporter.log("TC Pass, values is null",true);
  }
}
