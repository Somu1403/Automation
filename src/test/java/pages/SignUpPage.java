package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	public SignUpPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="Login")
	WebElement signup;
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement name;
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement email;
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement signUp_button;
	
	public void signup_click()
	{
		signup.click();
	}
	public void enter_name(String n)
	{
		name.sendKeys(n);
	}
	public void enter_email(String mail)
	{
		email.sendKeys(mail);
	}
	public void signup_button()
	{
		signUp_button.click();
	}
	
	

}
