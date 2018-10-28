package org.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	static WebDriver driver;
	@FindBy(name="email_create")
	private WebElement email;
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement createAccount;
	@FindBy(xpath="//h3[text()='Create an account']")
	private WebElement scrollInto;
	public SignIn(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getScrollInto() {
		return scrollInto;
	}
	public void setScrollInto(WebElement scrollInto) {
		this.scrollInto = scrollInto;
	}
	
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getCreateAccount() {
		return createAccount;
	}
	public void setCreateAccount(WebElement createAccount) {
		this.createAccount = createAccount;
	}

}
