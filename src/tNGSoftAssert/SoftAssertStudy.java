package tNGSoftAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void MyMethod() 
  
  {
	  SoftAssert soft=new SoftAssert();// created object of Soft assert
	  
	  String a="Velocity1";
	  Boolean b=false;
	  String c="Velocity";
	  
	  soft.assertEquals(a, c,"TC Fail, given values are not equal,");
//	  Reporter.log("TC Pass, given values are equal");
  
	  soft.assertTrue(b,"TC Fail given value is false");
//	  Reporter.log("TC pass given value is true",true);
	  
	  soft.assertNull(c,"TC Fail , the value is not null");
	
	  soft.assertAll();
  }
}
