package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage {
	String sURL="https://www.amazon.in/";
	private WebDriver driver;
	private By productNameTxt=By.id("twotabsearchtextbox");
	private By productCategoryDrop=By.id("searchDropdownBox");
	private By searchButton=By.id("nav-search-submit-button");
	private By searchResultList=By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]");
			
			
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public  void navigateURL() {
			driver.navigate().to(sURL);
		}
	
	
	public void enterproductName(String prodName) {
		WebElement oProduct;
		oProduct=driver.findElement(productNameTxt);
		oProduct.clear();
		oProduct.sendKeys(prodName);
		
	}
	
	public void enterProductDrop(String ProdCat) {
		WebElement oProductDrop;
		oProductDrop=driver.findElement(productCategoryDrop);
		Select oSelect=new Select(oProductDrop);
		oSelect.selectByVisibleText(ProdCat);
	}

	public void clickSearchButton() {
		WebElement oSearch=driver.findElement(searchButton);
		oSearch.click();
}
	
	public String getSearchResult() {
		WebElement oResult;
		oResult=driver.findElement(searchResultList);
		String sResult=oResult.getText();
		return sResult;
	}
}

