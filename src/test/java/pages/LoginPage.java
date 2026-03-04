package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="Login")
	WebElement login;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[1]/div[1]/div/form/button")
	WebElement login_button;
	
	public void click_login()
	{
		login.click();
	}
	public void inputEmail(String e)
	{
		email.sendKeys(e);
	}
	public void inputPassword(String p)
	{
		password.sendKeys(p);
	}
	public void login_button_click()
	{
		login_button.click();
	}
	

}
