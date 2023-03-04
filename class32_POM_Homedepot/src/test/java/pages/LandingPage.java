package pages;

import org.openqa.selenium.By;

import base.Base;

public class LandingPage extends Base{
	
	public void navigateURL() {
		driver.get("https://www.homedepot.com/");
	}

	By searchBox = By.xpath("//input[@class='SearchBox__input']");
	By searchBtn = By.xpath("//*[@id=\"headerSearchButton\"]");
	
	public void click_Search_Box() {
		driver.findElement(searchBox).click();
	}
	public void enterValue() {
		driver.findElement(searchBox).sendKeys("Ryobi portable drill");
	}
	public void click_Search_Btn() {
		driver.findElement(searchBtn).click();
	}
	
}
