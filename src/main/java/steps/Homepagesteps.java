package steps;


import org.junit.Assert;

import Objects.Basepage;
import Objects.Dressespage;
import Objects.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepagesteps {
	Dressespage Dresspage;
	Basepage bp;
	Homepage Homepage;

	public Homepagesteps(){
	bp=new Basepage();
}

	@Given("^I am in homepage$")
	public void i_am_in_homepage() throws Throwable {
		Homepage=new Homepage();
	}

	@When("^I select the dresses page$")
	public void i_select_the_dresses_page() throws Throwable {
		Homepage.clickdresses();
	}

	@Then("^I should see dresses page$")
	public void i_should_see_dresses_page() throws Throwable {
		Assert.assertTrue(Homepage.gettitle().contains("Dresses"));
	}
	
	@When("^I enter the email in newsletter and hit enter$")
	public void i_enter_the_email_in_newsletter_and_hit_enter() throws Throwable {
		Homepage.getnewsletter();
	}
	
	@Then("^I should see the email subscription message$")
	public void i_should_see_the_email_subscription_message() throws Throwable {
		Assert.assertTrue(Homepage.getmessage().contains("Newsletter"));
	}
}
