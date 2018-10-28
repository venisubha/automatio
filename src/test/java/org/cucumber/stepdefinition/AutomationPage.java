package org.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPage {
	static WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement Signin;
	public AutomationPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getSignin() {
		return Signin;
	}
	public void setSignin(WebElement signin) {
		Signin = signin;
	}
	

}
