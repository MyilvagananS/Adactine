Feature: Hotel Booking In Adactine Application

Scenario: Login Functionality of Adactine Hotel Page
Given user Launch The Application 
When user Enter The Username In Username Field
And user Enter The password In password Field
Then user Click On The Login Button And It Navigates To Search Hotel  

Scenario: Search Hotel Functionality Of Adactine Hotel 
When user Can Select The Location Available From Dropdown List
And user Can Select The Hotel Available From Dropdown List
And user Can Select The Room Type Available From Dropdown List
And user Can Select The Number Of Rooms Available From Dropdown List
And user Can Pass The Check In Date In Field Box
And user Can Pass The Check Out Date In Field Box
And user Can Select The Number Of Adult Per Room From Dropdown List
And user Can Select The Number Of Child Per Room From Dropdown List
Then User Click On the Search Button And It Navigates To Booked Itinerary

Scenario: select Hotel Functionality Of Adactine Hotel 
When user Click On The Radio Button After Ensuring Applied Details Are Correct
Then user Click On The Continue Button And It Navigate To Book A Hotel Page

Scenario: Book A Room Functionality Of Adactine Hotel 
When user Enter The First Name In First Name Field Box
And user Enter The Last Name In Last Name Field Box
And user Enter The Billing Address In Field Box
And user Enter The Credit Card No In Field Box
And user Can Select Credit Card Type From Dropdown List
And user Can Select Expire Month From Dropdown List
And user Can Select Expire Year Type From Dropdown List
And user Enter The Cvv Number In Field Box
Then click on Book Now Button And It Navigates To Booking Confirmation

Scenario: Logout Functionality Of Adactine Hotel 
Then user Click On The Logout Button And Navigate To Successfully Logout Page
