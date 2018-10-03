package steps;

import Objects.Basepage;
import Objects.Dressespage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dressespagesteps {

	Dressespage Dresspage;
	Basepage bp;

	public void Dressespagesteps() {

		Dresspage = new Dressespage();
	}

	@Given("^I am in home page$")
	public void i_am_in_home_page() throws Throwable {
		bp = new Basepage();
	}

	@When("^I hover on the first product$")
	public void i_hover_on_the_first_product() throws Throwable {

	}

	@Then("^I should see a Add to cart button displayed$")
	public void i_should_see_a_Add_to_cart_button_displayed() throws Throwable {

	}

	@When("^I click on dresses page$")
	public void i_click_on_dresses_page() throws Throwable {

	}

}
