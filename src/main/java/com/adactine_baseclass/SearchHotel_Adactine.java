package com.adactine_baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Adactine {
	public static WebDriver driver;
	@FindBy(id="location")
	private WebElement locator;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomype;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement noofroom;
	@FindBy(id="datepick_in")
	private WebElement checkin;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultoom;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childroom;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Search;
	public SearchHotel_Adactine(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocator() {
		return locator;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomype() {
		return roomype;
	}
	public WebElement getNoofroom() {
		return noofroom;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultoom() {
		return adultoom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSearch() {
		return Search;
	}
	
	
	
	
	
			
	
}

