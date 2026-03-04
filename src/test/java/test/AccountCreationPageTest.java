package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AccountCreationPage;
import pages.SignUpPage;

public class AccountCreationPageTest extends BaseClass {
	
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
  public void create_account() {
	  SignUpPage sp=new SignUpPage(driver);
	  sp.signup_click();
	  sp.enter_name("Somashekar");
	  sp.enter_email("somashekar@yahoo.com");
	  sp.signup_button();
	  AccountCreationPage ap=new AccountCreationPage(driver);
	  ap.select_title();
	  ap.inputPassword("somashekar");
	  ap.select_days("20");
	  ap.select_month("March");
	  ap.select_year("1980");
	  ap.select_newsletter();
	  ap.inputFirstName("Somashekar");
	  ap.inputLastName("G");
	  ap.inputCompany("Anudip");
	  ap.inputAddress1("Kaggadasapura");
	  ap.inputAddress2("C.V.Raman Nagar");
	  ap.inputCountry("India");
	  ap.inputState("Karnataka");
	  ap.inputCity("Bangalore");
	  ap.inputZipcode("123458");
	  ap.inputMobileNumber("9876543298");
	  ap.click_createAccount();
	  
  }
  public void verify_account_creation()
  {
	  String message="Account Created!";
	  Assert.assertTrue(driver.getPageSource().contains(message));
			  
  }
}
