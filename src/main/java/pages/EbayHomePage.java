package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.PropertyReader;

public class EbayHomePage {
	
	String sURL=PropertyReader.readDataFromPropertyFile("Environment", "ebay");
	private WebDriver driver;
	private By productNameTxt=By.id("gh-ac");
	private By productCategoryDrop=By.id("gh-cat");
	private By searchButton=By.id("gh-btn");
	private By searchResultList=By.xpath("(//hl[@class='srp-controls__count-heading']/span");
	
	
	public EbayHomePage(WebDriver driver) {
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
