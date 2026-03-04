package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginWithMultipleUsers extends BaseClass {
	@BeforeMethod
	  public void beforeSignup()
	  {
		  removePopups();
	  }
	@AfterMethod
	  public void afterSignup()
	  {
		  removePopups();
	  }
@Test(dataProvider="testData")
public void login(String email, String pwd) {
	  LoginPage l=new LoginPage(driver);
	  l.click_login();
	  l.inputEmail(email);
	  l.inputPassword(pwd);
	  l.login_button_click();
	  verify_login();
 }
public void verify_login()
{
	  Assert.assertTrue(driver.getPageSource().contains("Logout"));
}
  
  @DataProvider(name="testData")
  public Object[][] credentials()
  {
	  return new Object[][] {
	        {"somashekar@yahoo.com", "test123"},
	        {"kpra@123", "pra12"},
	        {"", ""}, 
	        {"k.praba@yahoo.com", "kpraba123"}
	    };
}
}