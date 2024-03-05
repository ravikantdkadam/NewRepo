package StepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggingStep {
	
	@Before   // it will execute before each scenario
	
	public void browsersetup() {
		
		System.out.println("Open the browser");
	}
	
	
	
	@After   // It will execute after each scenario
	
	public void tear() {
		
		System.out.println("Close the browser");
	}
	
	
	

@Given("user is on login page1")
public void user_is_on_login_page1() {
    
}
@When("user enter the username and password")
public void user_enter_the_username_and_password() {
    
}

@Given("user is on login page")
public void user_is_on_login_page() {
    
}
@When("user enter the invalid username and password")
public void user_enter_the_invalid_username_and_password() {
   
	
}
@Given("user is on initial screen")
public void user_is_on_initial_screen() {
    
}
@When("user click on you order link")
public void user_click_on_you_order_link() {
    
}
@Then("user able to see the previous order list")
public void user_able_to_see_the_previous_order_list() {
   
	
	

}
@Given("user is on main page")
public void user_is_on_main_page() {
   
}
@When("user select the product")
public void user_select_the_product() {
	
}

@When("click on the Add to card button")
public void click_on_the_add_to_card_button() {

}
@Given("user is on homepage")
public void user_is_on_homepage2() {
   
}
@When("user click on account list")
public void user_click_on_account_list() {

}
@When("move the mouse on Signout link")
public void move_the_mouse_on_signout_link() {
  
}
@When("Click on Sign out link")
public void click_on_sign_out_link() {
 
}
@Then("user sign out from the amazon account")
public void user_sign_out_from_the_amazon_account() {
   
}
}



