package tNGVerificationStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEuqalStudy {
  @Test
  public void MyMethod()
  {
	  String a="Velocity1";
	  String b="Velocity";
	 
	// Given char values are different then output will be as TC Pass  otherwise fail
	  //Assert.assertNotEquals(a, b,"Given two string values are not equals TC failed");
	  
	  // Given char values are Same/Equals then output will be as TC Pass otherwise fail
//	  Assert.assertEquals(a, b,"Given two string values are not equals TC failed");
//	  Reporter.log(" TC pass Given values are matched",true);
	  
	  //AssertNotEqual---->
	  Assert.assertNotEquals(a, b,"TC Fail , values are Same");
	  Reporter.log("TC pass Given two values are different/ Not matched",true);
	  
	  
  
  }
}
