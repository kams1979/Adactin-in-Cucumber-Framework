package Step_DemoCucumber;

import base.com.Base_new;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.demo.BookAHotel;
import pom.demo.Booked_Itinerary;
import pom.demo.BookingConfirmation;
import pom.demo.Login_POM;
import pom.demo.Search_Hotel;
import pom.demo.Select_Hotel;

public class Step_Demo5 extends Base_new  {
	     
	Login_POM lp= new Login_POM(driver);
	Search_Hotel sh= new Search_Hotel(driver);
	Select_Hotel sh2 = new Select_Hotel(driver);
	BookAHotel bh= new BookAHotel(driver);
	BookingConfirmation bc=new BookingConfirmation(driver);
	Booked_Itinerary bi= new Booked_Itinerary(driver);
	
	
	
	@Given("user able to launch the url")
	public void user_able_to_launch_the_url() {
		Url("https://adactinhotelapp.com/");
	}
	             //Login
	@When("User able to enter the valid username")
	public void user_able_to_enter_the_valid_username() throws Throwable {
		//SendKeys(lp.getUser(),"aswinkumar799");
		SendKeys(lp.getUser(), Read_data(0, 0));
		
	}
	
	@When("User able to enter the valid password")
	public void user_able_to_enter_the_valid_password() throws Throwable {
		//SendKeys(lp.getPass(),"dcc123");
		SendKeys(lp.getPass(), Read_data(0, 1));
		
	}
	
	@When("User able to click the login button")
	public void user_able_to_click_the_login_button() {
		click1(lp.getLogin());
		
	}
	
	@Then("User able to navigate the Home page")
	public void user_able_to_navigate_the_home_page() {
		
	}

                 //Search Hotel
	
	@Given("User able to enter the valid Location")
	public void user_able_to_enter_the_valid_location() {
		Selectby_Index(sh.getLocation(), 2);
	}
	
	
	@When("User able to enter the valid Hotels")
	public void user_able_to_enter_the_valid_hotels() {
		Selectby_Index(sh.getHotels(), 2);
	}
	
		
	@When("User able to enter the valid RoomType")
	public void user_able_to_enter_the_valid_room_type() {
		Selectby_Index(sh.getRoomtype(), 2);
		
	}
	
	@When("User able to enter the valid NumberofRooms")
	public void user_able_to_enter_the_valid_numberof_rooms() {
		Selectby_Index(sh.getNumberofRooms(), 2);
	}
	
	
	@When("User able to enter the valid CheckinDate")
	public void user_able_to_enter_the_valid_checkin_date() {
		sh.getCheckinDate().clear();
		SendKeys(sh.getCheckinDate(), "24/02/2023");
	}
	
	@When("User able to enter the valid CheckoutDate")
	public void user_able_to_enter_the_valid_checkout_date() {
		sh.getCheckoutDate().clear();
		SendKeys(sh.getCheckoutDate(), "28/02/2023");
	}
	
	@When("User able to enter the valid AdultsperRoom")
	public void user_able_to_enter_the_valid_adultsper_room() {
		Selectby_Index(sh.getAdultperroom(), 2);
	}
	
	@When("User able to enter the valid ChildrenPerRoom")
	public void user_able_to_enter_the_valid_children_per_room() {
		Selectby_Index(sh.getChildperroom(), 2);
	}
	
	@When("User able to click the search button")
	public void user_able_to_click_the_search_button() {
		click1(sh.getSearch());
		
	}
	
	@Then("User able to navigate the nextpage Select Hotel")
	public void user_able_to_navigate_the_nextpage_select_hotel() {
	}

	         //Select Hotel
	       
	@Given("User able to view the select hotel page")
	public void user_able_to_view_the_select_hotel_page() {
	}
	
	@When("User able to select the Radio button")
	public void user_able_to_select_the_radio_button() {
		click1(sh2.getSelect());
		
	}
	
	@When("User able to click the continue button")
	public void user_able_to_click_the_continue_button() {
		click1(sh2.getContinue());
	}
	
	@Then("User able to navigate to Book A Hotel Page")
	public void user_able_to_navigate_to_book_a_hotel_page() {
		
	}
	
	
	
         //Book A Hotel
	@Given("User able to enter the First Name")
	public void user_able_to_enter_the_first_name() throws Throwable {
		//SendKeys(bh.getName(), "Aswin");
		SendKeys(bh.getName(),Read_data(1, 0));
	}
	@When("User able to enter the Last Name")
	public void user_able_to_enter_the_last_name() throws Throwable {
		//SendKeys(bh.getLname(), "Krish");
		SendKeys(bh.getLname(),Read_data(1, 1));
	   
	}
	@When("User able to enter the Billing Address")
	public void user_able_to_enter_the_billing_address() throws Throwable {
		//SendKeys(bh.getBillingAddress(), "Chennai");
		SendKeys(bh.getBillingAddress(),Read_data(2, 0));
	 
	}
	@When("User able to enter the valid Credit Card Number")
	public void user_able_to_enter_the_valid_credit_card_number() throws Throwable {
		//SendKeys(bh.getCreditCardNo(),"1234 5678 9876 4321");
		SendKeys(bh.getCreditCardNo(),Read_data(2, 1));
		 
	}
	
	@When("User able to Select the valid Credit Card Type")
	public void user_able_to_select_the_valid_credit_card_type() {
		Selectby_Index(bh.getCreditType(), 1);
	}
	@When("User able to Select the Valid Expiry Month")
	public void user_able_to_select_the_valid_expiry_month() {
		Selectby_Index(bh.getExpDate(), 1);
	}
	
	@When("User able to Select the Valid Expiry Year")
	public void user_able_to_select_the_valid_expiry_year() {
		Selectby_Index(bh.getExpYear(), 5);
	}
	
	@When("User able to enter the valid CVV")
	public void user_able_to_enter_the_valid_cvv() throws Throwable {
		//SendKeys(bh.getCVVNo(), "564");
		SendKeys(bh.getCVVNo(),Read_data(3, 0));
	}
	
	@When("User able to click the BookNow button")
	public void user_able_to_click_the_book_now_button() throws InterruptedException  {
		Thread.sleep(4000);
		click1(bh.getBookNow());
		
	}
	@Then("User able to navigate to Book Confirmation Page")
	public void user_able_to_navigate_to_book_confirmation_page() throws InterruptedException {
		//Thread.sleep(10000);
		//click1(bc.getMyItinerary());
		
		
	}
	
	@Given("User able to View  Confirmation page")
	public void user_able_to_view_confirmation_page() {
	}
	@When("User able to view the MyItinerary")
	public void user_able_to_view_the_my_itinerary() {
	}
	@When("User able to click the my itenarary button")
	public void user_able_to_click_the_my_itenarary_button() throws InterruptedException {
		Thread.sleep(10000);
		click1(bc.getMyItinerary());
		
	}
	@Then("User able to navigate to Booked Itinerary Page")
	public void user_able_to_navigate_to_booked_itinerary_page() {
	}


             //Logout
	
	@Given("user able to view the booked Itinerary Page")
	public void user_able_to_view_the_booked_itinerary_page() {
	}
	@When("User able to Click the Orderid CheckBox")
	public void user_able_to_click_the_orderid_check_box() {
		click1(bi.getOrderid());
		
	}
	@When("User able to Click the Cancel Selected button")
	public void user_able_to_click_the_cancel_selected_button() {
		click1(bi.getCancelSelected());
		
	}
	@When("User able to View the Prompt Alert")
	public void user_able_to_view_the_prompt_alert() {
	}
	@When("User able to click the OK button")
	public void user_able_to_click_the_ok_button() {
		Alert1();
		
	}
	@When("User should click the Logout button")
	public void user_should_click_the_logout_button() {
		  click1(bi.getLogout());
		  
	}
	@Then("User should Sucessfully Logged out from Adactin Page")
	public void user_should_sucessfully_logged_out_from_adactin_page() {
	}





        





	
}
