package TEstNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependentOnMethodKeyword {
	 @Test (dependsOnMethods = {"D"})
	  public void C()
 {
	  Reporter.log("C is running",true);
 }
 
 @Test(dependsOnMethods = {"D"})  //dependsOnMethods keyword used if TC depends on other
 public void A()
 {
	  Reporter.log("A is running",true);
 }
 
 @Test
 public void D()
 {
	  Reporter.log("D is running",true);
 }
 
 @Test(dependsOnMethods = {"D"})
 public void B()
 {
	  Reporter.log("B is running",true);
 }
}
