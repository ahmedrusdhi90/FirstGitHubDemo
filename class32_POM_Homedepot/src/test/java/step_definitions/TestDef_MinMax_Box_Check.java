package step_definitions;

import base.Base;
import static org.junit.Assert.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.SearchPage;

public class TestDef_MinMax_Box_Check extends Base{
	LandingPage landingPage = new LandingPage();
	SearchPage searchPage = new SearchPage();
	
	@Given("I am in landing page")
	public void i_am_in_landing_page() {
		landingPage.navigateURL();
	}

	@When("I click on search box")
	public void i_click_on_search_box() {
		landingPage.click_Search_Box();
		
	}

	@Then("I enter value inside of search box")
	public void i_enter_value_inside_of_search_box() {
		landingPage.enterValue();
	}

	@And("click on search button")
	public void click_on_search_button() {
		landingPage.click_Search_Btn();
	}

	@Then("I am in my Search Page")
	public void i_am_in_my_Search_Page() {
		assertEquals("Ryobi Portable Drill", searchPage.getSearchItemText());
	}

	@And("I enter price min")
	public void i_enter_price_min() {
		searchPage.enterMinPrice("50");
	}
	
	@And("I enter price max")
	public void i_enter_price_max() {
		searchPage.enterMaxPrice("150");
	}

	@And("Click on Go button")
	public void click_on_Go_button() {
		
	}

}
