package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.WebDriverUtility;

public class HomePageStepDefinition extends Base {
	
	HomePageObject home = new HomePageObject();
	
	//background
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website(){
		Assert.assertTrue(home.isLogoPresent());
		Assert.assertEquals("TEK SCHOOL" , home.getTitle());
		logger.info("user is on retail website");
		WebDriverUtility.takeScreenShot();
		
	}
	
	//1st scenario
	
	@When("User click on Currency")
	public void user_click_on_currency(){
		home.clickOnCurrency();
		logger.info("user clicked on currency tab");
		
		
	}
	
	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_downdown(){
		home.clickOnEuro();
		logger.info("user clicked on euro from dropdown");
		
	}
		
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro(){
		Assert.assertEquals("Ex Tax: 392.30€", home.returnEuro());
		logger.info("user changed to euro");
		WebDriverUtility.takeScreenShot();
		
		
	}
	
	//2nd scenario
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart(){
		home.clickOnShoppingCart();
		logger.info("user clicked on shopping cart");
		
		
	}
	
	@Then("Your shopping cart is empty! message should display")
	public void message_should_display(){
		Assert.assertEquals("Your shopping cart is empty!", home.getEmptyCart());
		logger.info("user shopping cart is empty");
		WebDriverUtility.takeScreenShot();
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
