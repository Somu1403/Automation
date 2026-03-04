package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationPage {
	WebDriver driver;
	public AccountCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="id_gender2")
	WebElement gender;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="days")
	WebElement days;
	@FindBy(id="months")
	WebElement months;
	@FindBy(id="years")
	WebElement years;
	@FindBy(id="newsletter")
	WebElement newsletter;
	@FindBy(id="first_name")
	WebElement first_name;
	@FindBy(id="last_name")
	WebElement last_name;
	@FindBy(id="company")
	WebElement company;
	@FindBy(id="address1")
	WebElement address2;
	@FindBy(id="address2")
	WebElement address1;
	@FindBy(id="country")
	WebElement country;
	@FindBy(id="state")
	WebElement state;
	@FindBy(id="city")
	WebElement city;  
	@FindBy(id="zipcode")
	WebElement zipcode;
	@FindBy(id="mobile_number")
	WebElement mobile_number;
	@FindBy(xpath="//*[@id=\"form\"]/div/div[1]/div/div/form/button")
	WebElement createAccount;
	
	public void select_title()
	{
		gender.click();
	}
	public void inputPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void select_days(String day)
	{
		Select d=new Select(days);
		d.selectByVisibleText(day);
	}
	public void select_month(String m)
	{
		Select mon=new Select(months);
		mon.selectByVisibleText(m);
	}
	public void select_year(String y)
	{
		Select yea=new Select(years);
		yea.selectByVisibleText(y);
	}
	public void select_newsletter()
	{
		newsletter.click();
	}
	public void inputFirstName(String fn)
	{
		first_name.sendKeys(fn);
	}
	public void inputLastName(String ln)
	{
		last_name.sendKeys(ln);
	}
	public void inputCompany(String ln)
	{
		company.sendKeys(ln);
	}
	public void inputAddress1(String addr)
	{
		address2.sendKeys(addr);
	}
	public void inputAddress2(String addr)
	{
		address2.sendKeys(addr);
	}
	public void inputCountry(String c)
	{
		Select s=new Select(country);
		s.selectByVisibleText(c);
			
	}
	public void inputCity(String c)
	{
		city.sendKeys(c);
	}
	public void inputState(String s)
	{
		state.sendKeys(s);
	}
	public void inputZipcode(String zc)
	{
		zipcode.sendKeys(zc);
	}
	public void inputMobileNumber(String num)
	{
		mobile_number.sendKeys(num);
	}
	public void click_createAccount()
	{
		createAccount.click();
	}

}
