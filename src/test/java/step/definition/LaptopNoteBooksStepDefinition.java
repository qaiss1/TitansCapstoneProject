package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;


public class LaptopNoteBooksStepDefinition extends Base{

	LaptopNoteBooksPageObject laptop = new LaptopNoteBooksPageObject();
	
	//background
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website(){
		Assert.assertTrue(laptop.isLogoPresent());
		Assert.assertEquals("TEK SCHOOL" , laptop.getTitle());
		logger.info("user is on retail website");
		WebDriverUtility.takeScreenShot();
		}
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_and_notebook_tab(){
		
		laptop.clickOnLaptopsAndNOteBookTab();
		logger.info("user clicked on laptop and notebook tab");
		
	}
	
	@And("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_and_notebook_option(){
		laptop.clickOnShowAllLaptops();
		logger.info("user on show all laptop and notebooks page");
		
		
	}
	
	//1st scenario
	@And("User click on MacBook item")
	public void user_click_on_macbook_item(){
		laptop.clickOnMacbookItem();
		logger.info("user clicked on macbook item");
		WebDriverUtility.takeScreenShot();
		
	}
	
	@And("User click add to Cart button")
	public void user_click_on_cart_button(){
		laptop.addMacBookToCart();
		logger.info("user added macbook item to cart");
		
	}
	
	@Then("User should see a message {String}")
	public void user_should_see_a_message(){
		laptop.getSuccessMessage1();
		if(laptop.isSucessMessage1Present())
		logger.info("user sees message");
		
	}
	
	@And("User should see 1 item(s)-602.00 showed to the cart")
	public void user_should_see_1_item_showed_to_the_cart(){
		laptop.getcartTotal1Item();
		if(laptop.cartTOtal602()){
			logger.info("user sees 1 item in cart");
		}
		
		
		
	}
	
	@And("User click on cart option")
	public void user_click_on_cart_option(){
		laptop.clickOnCartButon();
		logger.info("user clicked on cart option");
	
		
		
	}
	
	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart(){
		laptop.clickOnRedX();
		logger.info("user removed item from cart");
		
	}
	
	@Then("item should be removed and cart should show 0 item(s)")
	public void item_should_be_removed_and_cart_should_show_0_items(){
		Assert.assertEquals("0 item(s)" , laptop.getCartTotal0Items());
		WebDriverUtility.takeScreenShot();
		logger.info("user removed items from cart and now it is 0");
		
	}
	
	
	//2nd scenario
	
	
	@And("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_macbook(){
		laptop.clickOnComparisonMacbook();
		logger.info("user added macbook to comparison");
		WebDriverUtility.takeScreenShot();
		
	}
	
	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparions_icon_on_macbook_air(){
		laptop.clickOnComparisonMacbookAir();
		logger.info("user added macbook air to comparison");
		
		
	}
	
	@Then("User should see a message {String}")
	public void user_should_see_a_message1(){
		laptop.returnSuccessFulComparisonMessage();
		if(laptop.successComparsionMessageTrue()){
			logger.info("user successfully added items to comparison page");}
		
		
	}
	
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link(){
		laptop.clickOnComparisonTab();
		
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart(){
		laptop.productComparisonVerification();
		Assert.assertTrue(laptop.productComparisonTrue());
		logger.info("user is on product compariosn chart");
		WebDriverUtility.takeScreenShot();
		
		
		
	}
	
	
	//3rd scenario
	
	
	@And("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_vaio_laptop_to_wish_list(){
		laptop.addSonyToWishList();
		logger.info("user attempted to add sony vaio laptop to wishlist");
		
		
	}
	
	@Then("User should get a message {String}")
	public void user_should_get_a_message2(){
		Assert.assertEquals("You must login or create an account to save Sony VAIO to your wish list!", laptop.wishListMessage());
		logger.info("user must create account to add item to wish list ");
		WebDriverUtility.takeScreenShot();
		
		
	}
	
	//4th scenario
	
	@And("User click on MacBook Pro item")
	public void user_click_on_macbok_pro_item(){
		laptop.clickOnMacBookPro();
		logger.info("user on macbook pro page");
		
		
	}
	
	@Then("User should see  $2,000.00 price tag is present on UI.")
	public void user_should_See_2k_price_tag_is_present_on_ui(){
		Assert.assertEquals("$2,000.00", laptop.macBookProPrice());
		logger.info("user sees 2k price tag in ui");
		WebDriverUtility.takeScreenShot();
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
