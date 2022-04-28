package com.adactine_baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Adactine {
	public static WebDriver driver;
@FindBy(xpath="//input[@type='radio']")
private WebElement radio1;
@FindBy(xpath="//input[@type='submit']")
private WebElement continue1;
public SelectHotel_Adactine(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement getRadio1() {
	return radio1;
}
public WebElement getContinue1() {
	return continue1;
}

}
