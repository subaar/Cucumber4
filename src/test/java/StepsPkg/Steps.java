package StepsPkg;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	@Given("^User is on netbanking login page$")
	public void user_is_on_netbanking_login_page() throws Throwable {
	System.out.println("one");
	}

	@When("^user logs in with valid un and pw$")
	public void user_logs_in_with_valid_un_and_pw() throws Throwable {
		System.out.println("two");

	}

	@Then("^homepage is displayed$")
	public void homepage_is_displayed() throws Throwable {
		System.out.println("three");

	}

	@Then("^all cards are displayed$")
	public void all_cards_are_displayed() throws Throwable {
		System.out.println("four");

	}

}
