package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base{
	
	RetailPageObject retail = new RetailPageObject();
	
	//background
	
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website(){
		Assert.assertTrue(retail.isLogoPresent());
		Assert.assertEquals("TEK SCHOOL", retail.getTitle());
		logger.info("user is on retail website");
		WebDriverUtility.takeScreenShot();
		}
	
	@And("User click on MyAccount")
	public void user_click_on_myAccount(){
		retail.clickOnMyAccOption();
		logger.info("user clicked on my account");
	}
	
	@When("User click on Login")
	public void user_click_on_login(){
		retail.clickOnLoginOption();
		logger.info("user clicked on login");
		
	}
	
	@And("User enter username {string} and password {string}")
	public void user_enter_userName_and_password(String userName, String password){
		retail.emailPasswordInput(userName, password);
		logger.info("user entered " + userName +"and " +password);
	}
	
	@And("User click on Login button")
	public void user_click_on_login_button(){
		retail.loginButtonClick();
		logger.info("user clicked on login button");
	}
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_myAccount_dashboard(){
		Assert.assertTrue(retail.isAccDashboardPresent());
		logger.info("user is on my account dashboard");
		WebDriverUtility.takeScreenShot();
		
	}
	
	//1st scenario
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link(){
		retail.clickOnAffiliateAccLink();
		logger.info("user is on register for affiliate account page");
		WebDriverUtility.takeScreenShot();
		}
	
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable datatable){
	List<Map<String,String>> affiliateInformation = datatable.asMaps(String.class, String.class);
	retail.companyInput(affiliateInformation.get(0).get("company"));
	retail.websiteInput(affiliateInformation.get(0).get("website"));
	retail.taxIdnput(affiliateInformation.get(0).get("taxID"));
	retail.payeeNameInput(affiliateInformation.get(0).get("payeeName"));
	retail.clickOnChequeBox();
	logger.info("user entered information from cucumber table");
	
	}
	
	@And("User check on About us check box")
	public void user_check_about_us_check_box(){
		retail.clickOnAboutUsBox();
		logger.info("user clicked on about us");
		
	}
	
	@And("User click on Continue button")
	public void user_click_on_continue_button(){
		retail.clickOnContinueButton1();
		logger.info("user clicked on continue button");
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message(){
		Assert.assertTrue(retail.successMessageIsPresent1());
		logger.info("user sees a success message");
		WebDriverUtility.takeScreenShot();
		
	}
	
	//2nd scenario
	
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link(){
		retail.clickOnEditAffiliateAccLink();
		logger.info("user clicked on edit affiliate information");
		WebDriverUtility.takeScreenShot();
		
	}
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button(){
		retail.clickOnBankBox();
		logger.info("user clicked on bank transfer radio button");
		
	}
	
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable table){
		List<Map<String,String>> editAfiliateInformation = table.asMaps(String.class , String.class);
		retail.enterBankName(editAfiliateInformation.get(0).get("bankName"));
		retail.enterBranchNumber(editAfiliateInformation.get(0).get("abaNumber"));
		retail.enterSwiftNumber(editAfiliateInformation.get(0).get("swiftCode"));
		retail.enterAccName(editAfiliateInformation.get(0).get("accountName"));
		retail.enterAccNumber(editAfiliateInformation.get(0).get("accountNumber"));
		logger.info("user filled bank information from feature page");
		
		
	}
	
	@And("User click on Continue button")
	public void user_click_on_continue_button1(){
		retail.clickOnContinueButton2();
		logger.info("user clicked on continue button");
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message1(){
		Assert.assertTrue(retail.successMessageIsPresent2());
		WebDriverUtility.takeScreenShot();
		logger.info("user sees a sucess message");
		
	}
	
	//3rd scenario
	
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link1(){
		retail.clickOnEditAccInformationLink();
		WebDriverUtility.takeScreenShot();
		logger.info("user should be on edit account information link");
	}
	
	@And("User modify below information")
	public void user_modify_below_information(DataTable table1 ){
		List <Map<String, String>>  accountInfo = table1.asMaps(String.class , String.class);
		retail.enterFirstName(accountInfo.get(0).get("firstname"));
		retail.enterLastName(accountInfo.get(0).get("lastName"));
		retail.enterEmailValue(accountInfo.get(0).get("email"));
		retail.enterTelValue(accountInfo.get(0).get("telephone"));
		logger.info("user entered information from cucumber table");
		
	}
	
	@And ("User click on continue button")
	public void user_click_on_continue_button2(){
		retail.clickOnContinueButton3();
		logger.info("user clicked on continue button");
		
	}
	
	@Then("User should see a message {String}")
	public void user_should_see_a_message(){
		Assert.assertTrue(retail.isSuccessMessage3Present());
		if (retail.getSuccessMessage().equals("Success: Your account has been successfully updated.")){
			logger.info("user sees a success message");
		WebDriverUtility.takeScreenShot();
		}
		
		
	}

}
