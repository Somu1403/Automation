package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginPageTest extends BaseClass{
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
  @Test
  public void login() {
	  LoginPage l=new LoginPage(driver);
	  l.click_login();
	  l.inputEmail("somashekar@yahoo.com");
	  l.inputPassword("somashekar");
	  l.login_button_click();
	  verify_login();
   }
  public void verify_login()
  {
	  Assert.assertTrue(driver.getPageSource().contains("Logout"));
  }
}
