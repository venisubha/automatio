package org.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefintion extends BaseClass1{
	static WebDriver driver;
	static AutomationPage auto=new AutomationPage(driver);
	static SignIn signin=new SignIn(driver);
	static CreateAccountpage account=new CreateAccountpage(driver);
	@Given("^browser launch$")
	public void browser_launch() throws Throwable {
		getDriver("chrome");
		
	}

	@When("^get the url$")
	public void get_the_url() throws Throwable {
		getUrl("http://automationpractice.com/index.php");
	}
	@Then("^signin$")
	public void signin() throws Throwable {
		Thread.sleep(5000);
		mouseOver(auto.getSignin());
		click(auto.getSignin());
   }

	@When("^get the user name$")
	public void get_the_user_name() throws Throwable {
		//set
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^get the password$")
	public void get_the_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^click the signin$")
	public void click_the_signin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^verify recover my account$")
	public void verify_recover_my_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}


}
