Feature: Adactin


Scenario: Login Functionality

Given user able to launch the url

When User able to enter the valid username

And User able to enter the valid password

And User able to click the login button

Then User able to navigate the Home page

Scenario: Search Hotel

Given User able to enter the valid Location

When User able to enter the valid Hotels

And User able to enter the valid RoomType

And User able to enter the valid NumberofRooms

And User able to enter the valid CheckinDate

And User able to enter the valid CheckoutDate

And User able to enter the valid AdultsperRoom

And User able to enter the valid ChildrenPerRoom

And User able to click the search button

Then  User able to navigate the nextpage Select Hotel

Scenario: Select Hotel

Given User able to view the select hotel page

When  User able to select the Radio button

And  User able to click the continue button

Then User able to navigate to Book A Hotel Page

Scenario: Book A Hotel

Given  User able to enter the First Name

When  User able to enter the Last Name

And User able to enter the Billing Address

And User able to enter the valid Credit Card Number

And User able to Select the valid Credit Card Type

And User able to Select the Valid Expiry Month

And User able to Select the Valid Expiry Year

And User able to enter the valid CVV

And User able to click the BookNow button

Then User able to navigate to Book Confirmation Page

Scenario: Booking Confirmation

Given  User able to View  Confirmation page

When User able to view the MyItinerary 

And User able to click the my itenarary button

Then User able to navigate to Booked Itinerary Page

Scenario: Booked Itinerary

Given  user able to view the booked Itinerary Page

When  User able to Click the Orderid CheckBox

And User able to Click the Cancel Selected button

And  User able to View the Prompt Alert

And  User able to click the OK button

And  User should click the Logout button

Then User should Sucessfully Logged out from Adactin Page


















