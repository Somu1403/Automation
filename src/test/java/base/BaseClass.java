package base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseClass {
  public WebDriver driver;
  
  @BeforeSuite
  public void setUp() {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  options.addArguments("--disable-infobars");
	  options.addArguments("--disable-extensions");

	  driver = new ChromeDriver(options);

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
      driver.get("https://automationexercise.com/");
   
  }
  public void removePopups() {
	    try {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript(
	         "document.querySelectorAll('iframe, .adsbygoogle, .ad, .cookie, .modal',[id*=\"ad\"]).forEach(e => e.remove());"
	        );
	    } catch (Exception e) {
	        System.out.println("No popup found");
	    }
	}
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
  @AfterSuite
  public void tearDown() {
      driver.quit();
  }
}

