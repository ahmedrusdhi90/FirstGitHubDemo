package pages;

import org.openqa.selenium.By;

import base.Base;

public class SearchPage extends Base{
	
	By minBox = By.xpath("//div[1]/form/div/div[1]/input");
	By maxBox = By.xpath("//form/div/div[2]/input[@type='tel']");
	By goBtn = By.xpath("//div[1]/form/div/button");
	By searchItemName = By.xpath("//h1[@class='results-header__keyword']");
	
	public void enterMinPrice(String minPrice) {
		driver.findElement(minBox).sendKeys(minPrice);
	}
	public void enterMaxPrice(String maxPrice) {
		driver.findElement(maxBox).sendKeys(maxPrice);
	}
	public void clickGoButton() {
		driver.findElement(goBtn).click();
	}
	
	public String getSearchItemText() {
		return driver.findElement(searchItemName).getText();
	}

}
