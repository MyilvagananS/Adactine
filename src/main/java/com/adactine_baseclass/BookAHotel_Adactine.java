package com.adactine_baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BookAHotel_Adactine {
@FindBy(xpath="//input[@name='first_name']")
private WebElement firstname;
@FindBy(xpath="//input[@name='last_name']")
private WebElement lastname;
@FindBy (xpath="//textarea[@name='address']")
private WebElement address;
@FindBy(xpath="//input[@onkeypress='return OnlyNumbersonly(event)' and @name=\"cc_num\"]")
private WebElement cardno;
@FindBy(xpath="//select[@name='cc_type']")
private WebElement cardtype;
@FindBy(xpath="//select[@name=\"cc_exp_month\"]")
private WebElement Expiremonth;
@FindBy (xpath="//select[@name='cc_exp_year']")
private WebElement Expireyear;
@FindBy(xpath="//input[@name=\"cc_cvv\"]")
private WebElement cvv;
@FindBy(xpath="//input[@type=\"button\"]")
private WebElement booknow;
public static WebDriver driver;
public BookAHotel_Adactine(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardno() {
	return cardno;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getExpiremonth() {
	return Expiremonth;
}
public WebElement getExpireyear() {
	return Expireyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBooknow() {
	return booknow;
}
}
