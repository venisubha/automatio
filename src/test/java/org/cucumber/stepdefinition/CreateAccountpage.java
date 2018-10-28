package org.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountpage {
	static WebDriver driver;
	@FindBy(id="id_gender2")
	private WebElement gender;
	@FindBy(name="customer_firstname")
	private WebElement firstName;
	@FindBy(id="customer_lastname")
	private WebElement lastName;
	@FindBy(id="passwd")
	private WebElement password;
	@FindBy(name="days")
	private WebElement date;
	@FindBy(id="months")
	private WebElement month;
	@FindBy(name="years")
	private WebElement year;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement checkbox;
	@FindBy(name="firstname")
	private WebElement firstName1;
	@FindBy(name="lastname")
	private WebElement lastName1;
	@FindBy(name="address1")
	private WebElement address;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(name="id_state")
	private WebElement state;
	@FindBy(id="postcode")
	private WebElement postalcode;
	@FindBy(id="id_country")
	private WebElement country;
	@FindBy(name="phone_mobile")
	private WebElement mobileno;
	@FindBy(name="alias")
	private WebElement aliasaddress;
	@FindBy(xpath="//span[text()='Register']")
	private WebElement register;
	public CreateAccountpage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver,this);
	}
	public WebElement getGender() {
		return gender;
	}
	public void setGender(WebElement gender) {
		this.gender = gender;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getDate() {
		return date;
	}
	public void setDate(WebElement date) {
		this.date = date;
	}
	public WebElement getMonth() {
		return month;
	}
	public void setMonth(WebElement month) {
		this.month = month;
	}
	public WebElement getYear() {
		return year;
	}
	public void setYear(WebElement year) {
		this.year = year;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(WebElement checkbox) {
		this.checkbox = checkbox;
	}
	public WebElement getFirstName1() {
		return firstName1;
	}
	public void setFirstName1(WebElement firstName1) {
		this.firstName1 = firstName1;
	}
	public WebElement getLastName1() {
		return lastName1;
	}
	public void setLastName1(WebElement lastName1) {
		this.lastName1 = lastName1;
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(WebElement address) {
		this.address = address;
	}
	public WebElement getCity() {
		return city;
	}
	public void setCity(WebElement city) {
		this.city = city;
	}
	public WebElement getState() {
		return state;
	}
	public void setState(WebElement state) {
		this.state = state;
	}
	public WebElement getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(WebElement postalcode) {
		this.postalcode = postalcode;
	}
	public WebElement getCountry() {
		return country;
	}
	public void setCountry(WebElement country) {
		this.country = country;
	}
	public WebElement getMobileno() {
		return mobileno;
	}
	public void setMobileno(WebElement mobileno) {
		this.mobileno = mobileno;
	}
	public WebElement getAliasaddress() {
		return aliasaddress;
	}
	public void setAliasaddress(WebElement aliasaddress) {
		this.aliasaddress = aliasaddress;
	}
	public WebElement getRegister() {
		return register;
	}
	public void setRegister(WebElement register) {
		this.register = register;
	}
	

}
