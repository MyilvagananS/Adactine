package com.adactine.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.adactine.runner.Runner1_Class;
import com.adactine_baseclass.Base_Class;
import com.adactine_baseclass.pageobjectmanager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition_Test extends Base_Class{
	public static WebDriver driver=Runner1_Class.driver;
	public static pageobjectmanager p=new pageobjectmanager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	   get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		input(p.getinstancehp().getUsername(),"Myilvaganan");
	   	}

	@When("^user Enter The password In password Field$")
	public void user_Enter_The_password_In_password_Field() throws Throwable {
	input(p.getinstancehp().getPass(), "J1LL7P");
	}

	@Then("^user Click On The Login Button And It Navigates To Search Hotel$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel() throws Throwable {
		click(p.getinstancehp().getLogin());
	   	}

	@When("^user Can Select The Location Available From Dropdown List$")
	public void user_Can_Select_The_Location_Available_From_Dropdown_List() throws Throwable {
	   dropdown(p.getinstancesh().getLocator(),"tex", "Sydney");
	}

	@When("^user Can Select The Hotel Available From Dropdown List$")
	public void user_Can_Select_The_Hotel_Available_From_Dropdown_List() throws Throwable {
	   dropdown(p.getinstancesh().getHotel(),"value", "Hotel Sunshine");
	}

	@When("^user Can Select The Room Type Available From Dropdown List$")
	public void user_Can_Select_The_Room_Type_Available_From_Dropdown_List() throws Throwable {
	  dropdown(p.getinstancesh().getRoomype(), "tex", "Standard");
	}

	@When("^user Can Select The Number Of Rooms Available From Dropdown List$")
	public void user_Can_Select_The_Number_Of_Rooms_Available_From_Dropdown_List() throws Throwable {
	  dropdown(p.getinstancesh().getNoofroom(),"index", "5");
	}

	@When("^user Can Pass The Check In Date In Field Box$")
	public void user_Can_Pass_The_Check_In_Date_In_Field_Box() throws Throwable {
		input(p.getinstancesh().getCheckin(), "28/04/2022");
	}

	@When("^user Can Pass The Check Out Date In Field Box$")
	public void user_Can_Pass_The_Check_Out_Date_In_Field_Box() throws Throwable {
	    input(p.getinstancesh().getCheckout(), "29/04/2022");
	}

	@When("^user Can Select The Number Of Adult Per Room From Dropdown List$")
	public void user_Can_Select_The_Number_Of_Adult_Per_Room_From_Dropdown_List() throws Throwable {
	    dropdown(p.getinstancesh().getAdultoom(), "index", "2");
	}

	@When("^user Can Select The Number Of Child Per Room From Dropdown List$")
	public void user_Can_Select_The_Number_Of_Child_Per_Room_From_Dropdown_List() throws Throwable {
	  dropdown(p.getinstancesh().getChildroom(), "tex", "2 - Two");
	}

	@Then("^User Click On the Search Button And It Navigates To Booked Itinerary$")
	public void user_Click_On_the_Search_Button_And_It_Navigates_To_Booked_Itinerary() throws Throwable {
	 click(p.getinstancesh().getSearch());  
	}


	@When("^user Click On The Radio Button After Ensuring Applied Details Are Correct$")
	public void user_Click_On_The_Radio_Button_After_Ensuring_Applied_Details_Are_Correct() throws Throwable {
	 click(p.getinstancesa().getRadio1()); 
	}

	@Then("^user Click On The Continue Button And It Navigate To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page() throws Throwable {
	    click(p.getinstancesa().getContinue1());
	}


	@When("^user Enter The First Name In First Name Field Box$")
	public void user_Enter_The_First_Name_In_First_Name_Field_Box() throws Throwable {
	   input(p.getinstancebh().getFirstname(), "Myilv");
	}

	@When("^user Enter The Last Name In Last Name Field Box$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field_Box() throws Throwable {
	  input(p.getinstancebh().getLastname(), "S"); 
	}

	@When("^user Enter The Billing Address In Field Box$")
	public void user_Enter_The_Billing_Address_In_Field_Box() throws Throwable {
	 input(p.getinstancebh().getAddress(), "7g3 gangstar chennai");  
	}

	@When("^user Enter The Credit Card No In Field Box$")
	public void user_Enter_The_Credit_Card_No_In_Field_Box() throws Throwable {
	   input(p.getinstancebh().getCardno(), "1235678998745632");
	}

	@When("^user Can Select Credit Card Type From Dropdown List$")
	public void user_Can_Select_Credit_Card_Type_From_Dropdown_List() throws Throwable {
	   dropdown(p.getinstancebh().getCardtype(), "tex", "American Express");
	}

	@When("^user Can Select Expire Month From Dropdown List$")
	public void user_Can_Select_Expire_Month_From_Dropdown_List() throws Throwable {
	    dropdown(p.getinstancebh().getExpiremonth(), "tex", "May");
	}

	@When("^user Can Select Expire Year Type From Dropdown List$")
	public void user_Can_Select_Expire_Year_Type_From_Dropdown_List() throws Throwable {
		dropdown(p.getinstancebh().getExpireyear(), "tex","2022");
	}

	@When("^user Enter The Cvv Number In Field Box$")
	public void user_Enter_The_Cvv_Number_In_Field_Box() throws Throwable {
	   input(p.getinstancebh().getCvv(), "112");
	}

	@Then("^click on Book Now Button And It Navigates To Booking Confirmation$")
	public void click_on_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation() throws Throwable {
	   click(p.getinstancebh().getBooknow()); 
	}



	@Then("^user Click On The Logout Button And Navigate To Successfully Logout Page$")
	public void user_Click_On_The_Logout_Button_And_Navigate_To_Successfully_Logout_Page() throws Throwable {
	  click(p.getinstancela().getLogout());
	}

}
