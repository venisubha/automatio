package org.cucumber.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class Stepdefinition {
	
	static WebDriver driver;
	
	@When("^User launch the browser$")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("^User load the facebook application$")
	public void user_load_the_facebook_application() {
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enter the user name '(.*)' for fb$")
	public void user_Enter_the_user_name(String value) {
		driver.findElement(By.id("email")).sendKeys(value);
	}
	
	@When("^User enter the password '(.*)' for fb$")
	public void user_enter_the_password(String value) {
		driver.findElement(By.id("pass")).sendKeys(value);
	}
	
	@When("^User click the login button$")
	public void user_click_the_login() {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}
	
	@When("^User wait for page load")
	public void user_wait_for_page_load() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@When("^User verifies the recover your account page$")
	public void user_verifies_the_recover() {
		WebElement rA = driver.findElement(By.xpath("//*[@id=\"login_link\"]/div[1]/a"));
		String rAtext = rA.getText();
		 Assert.assertEquals("Recover", rAtext);
	}
}
