package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.SignUpPage;

public class SignUpPageTest extends BaseClass{
  @BeforeMethod
  public void beforeSignup()
  {
	  removePopups();
  }
  @Test
  public void signup() {
	  SignUpPage sp=new SignUpPage(driver);
	  sp.signup_click();
	  sp.enter_name("Somashekar");
	  sp.enter_email("somashekar@yahoo.com");
	  sp.signup_button();
  }
  @AfterMethod
  public void afterSignup()
  {
	  removePopups();
  }
}
