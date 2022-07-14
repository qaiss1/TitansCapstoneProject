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
import page.objects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base {
	
	DesktopPageObject desk = new DesktopPageObject();
	
	//background
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website(){
		Assert.assertTrue(desk.isLogoPresent());
		Assert.assertEquals("TEK SCHOOL" , desk.getTitle());
		logger.info("user is on retail website");
		WebDriverUtility.takeScreenShot();	
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab(){
	desk.deskTopTabsClick();
	logger.info("user clicked on desktops tab");
		
	}
	
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops(){
		desk.showAllDesktopsClick();
		logger.info("user clicked on show all desktops");
		
		
	}
	
	//1st scenario
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page(){
		Assert.assertTrue(desk.allDesktopsPage());
		logger.info("user is on desktops page");
		WebDriverUtility.takeScreenShot();
		}
	
	//2nd scenario
	
	@And("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item(){
		desk.clickOnAddHpLp2Cart();
		logger.info("user clicked on add hp lp3065 to cart");
		WebDriverUtility.takeScreenShot();
		
		
	}
	
	@And("User select quantity 1")
	public void user_select_quantity_1(){
		desk.enter1QuantityForHpLP();
		logger.info("user selects quantity 1");
			
	}
	
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button(){
		desk.addToCart1();
		logger.info("user clicked on add to cart button");
		
	}
	
	@Then("User should see a message {String}")
	public void user_should_see_a_message(){
		Assert.assertTrue(desk.isSucessMessage1Present());
		if(desk.getSuccessMessage1().equals("Success: you have added HP LP 3065 to your Shopping cart!")){
			logger.info("user sees the succcess message");
			WebDriverUtility.takeScreenShot();
		}
		
		
	}
	
	//3rd scenario
	
	@And("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item(){
		desk.clickOnAddEOS2Cart();
		logger.info("user clicked on add eos 5d item to cart");
		WebDriverUtility.takeScreenShot();
		
		
	}
	
	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red(){
		desk.selectRedColor();
		logger.info("user selected red color from downdown");
		
		
	}
	
	@And("User select quantity 1")
	public void user_select_quantity1_1(){
		desk.selectQuanitity1ForEos();
		logger.info("user selected 1 quantity");
		
		
	}
	
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button1(){
		desk.addToCart2();
		logger.info("user clicked on add to cart button");
		
		
	}
	
	@Then("User should see a message {String}")
	public void user_should_see_a_message1(){
		Assert.assertTrue(desk.isSuccessMessage2Present());
		if(desk.getSuccessMessage2().equals("Success: You have added Canon EOS 5D to your shopping cart!")){
			logger.info("user successfully sees success message");
			WebDriverUtility.takeScreenShot();
		}
		
		
	}
	
	//4th scenario
	
	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item(){
		desk.clickOnEos5();
		WebDriverUtility.takeScreenShot();
		logger.info("user clicked on eos 5d page");
		
	}
	
	@And("User click on write a review link")
	public void user_click_on_write_a_review_link(){
		desk.clickOnAddReview();
		logger.info("user clicked on write a review link");
		
		
	}
	
	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable datatable){
		List<Map<String,String>> reviewInformation = datatable.asMaps(String.class, String.class);
		desk.enterName(reviewInformation.get(0).get("yourname"));
		desk.enterReview(reviewInformation.get(0).get("yourReview"));
		if(reviewInformation.get(0).get("Rating").equals("good")){
			desk.clickOnGoodRating();
		}
		logger.info("user filled review information with info ");
			
	
		
	}
	
	@And("User click on Continue Button")
	public void user_click_on_continue_button(){
		desk.clickOnContinueButton();
		logger.info("user clicked on continue button");
		
	}
	
	@Then("User should see a message with {String}")
	public void user_should_see_a_message_with(){
		Assert.assertTrue(desk.isSuccessMessage3Present());
		if(desk.getSuccessMessage3().equals("Thank you for your review. It has been submitted to the webmaster for approval.")){
			logger.info("user sees success message successfully");
			WebDriverUtility.takeScreenShot();
		}
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
