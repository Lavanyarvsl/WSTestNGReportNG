package qspiders.reportNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Day  -> Selenium 8th program
public class ReportNG1 
{
	 @Test
	  public void f() {
		  
		  Reporter.log("Hi",true);
		  
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  Reporter.log("Bye",true);
	  }
	  
	  @AfterMethod
	  
	  public void afterMethod() {
		  Reporter.log("Byeeeeeeee",true);
	  }
}
