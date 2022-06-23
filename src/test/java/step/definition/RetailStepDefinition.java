package step.definition;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;

public class RetailStepDefinition extends Base{
	
	RetailPageObject retail = new RetailPageObject();
	
	//backround
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website(){
		
	}
	
	@And("User click on MyAccount")
	public void user_click_on_myAccount(){
		
	}
	
	@When("User click on Login")
	public void user_click_on_login(){
		
	}
	
	@And("User enter username {string} and password {string}")
	public void user_enter_userName_and_password(String userName, String password){
		
	}
	
	@And("User click on Login button")
	public void user_click_on_login_button(){
		
	}
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_myAccount_dashboard(){
		
	}
	
	//1st scenario
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link(){
		
	}
	
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable datatable){
		
	}
	
	@And("User check on About us check box")
	public void user_check_about_us_check_box(){
		
	}
	
	@And("User click on Continue button")
	public void user_click_on_continue_button(){
		
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message(){
		
	}
	
	//2nd scenario
	
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link(){
		
	}
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button(){
		
	}
	
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable table){
		
	}
	
	@And("User click on Continue button")
	public void user_click_on_continue_button1(){
		
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message1(){
		
	}
	
	//3rd scenario
	
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link1(){
		
	}
	
	@And("User modify below information")
	public void user_modify_below_information(DataTable table1 ){
		
	}
	
	@And ("User click on continue button")
	public void user_click_on_continue_button2(){
		
	}
	
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String successmessage){
		
	}

}
