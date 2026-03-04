package pages;


	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class SearchProductPage {
	

	    WebDriver driver;

	    // Constructor
	    public SearchProductPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

		/*
		 * @FindBy(xpath="//a[text()=' Products']") WebElement products;
		 */
	    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	    WebElement products;
       public void click_products()
       {
    	   products.click();
       }
	   @FindBy(id = "search_product")
	   
	   
	    public WebElement searchBox;

	    @FindBy(id = "submit_search")
	    public WebElement searchButton;

	    @FindBy(xpath = "//div[@class='productinfo text-center']/p")
	    public List<WebElement> productNames;

	  
	    public void searchProduct(String product) {
	        searchBox.sendKeys(product);
	        searchButton.click();
	    }

	    public int getResultsCount() {
	        return productNames.size();
	    }

	    public List<WebElement> getProductNames() {
	        return productNames;
	    }
	}



