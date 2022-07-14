package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base{
	
	public LaptopNoteBooksPageObject(){
		PageFactory.initElements(driver, this);
	}
	
	//background
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentLogo;
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksTab;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptops;
	
	//1st scenario
	
	@FindBy(xpath ="//img[@title='MacBook']")
	private WebElement macBookItem;
	
	@FindBy(xpath= "//button[@id='button-cart']")
	private WebElement addToCartButton1;
	
	@FindBy(xpath="//div[text()='Success: You have added ']")
	private WebElement successMessage1;
	
	@FindBy(xpath = "//span[@id='cart-total']") //used after removing item from cart too
	private WebElement cartTotal;
	
	@FindBy(xpath = "//button[@type='button' and @data-toggle='dropdown' ]")
	private WebElement cartButton;
	
	@FindBy(xpath ="//button[@type='button' and @title='Remove' ]")
	private WebElement cartRedX;
	
	//2nd Scenario
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement comparisonButtonMacBook;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement comparisonButtonMacBookAir;
	
	@FindBy(xpath="//div[text()=' Success: You have added ']")
	private WebElement successMessage2;
	
	@FindBy(xpath= "//a[text()='product comparison']")
	private WebElement productComparisonLink;
	
	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement productComparison;
	
	//3rd scenario
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement sonyVaioWishList;
	
	@FindBy(xpath = "//div[text()=' You must ']")
	private WebElement mustSignInMessage;
	
	//4th scenario
	
	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement macBookPro;
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookProPrice;
	
	//BackGround Methods
	
	public boolean isLogoPresent(){
		if(testEnvironmentLogo.isDisplayed())
		return true;
		else
		return false;}
	
	public String getTitle(){
		return driver.getTitle();
		
	}
	
	public void clickOnLaptopsAndNOteBookTab(){
		laptopsAndNotebooksTab.click();
	}
	
	public void clickOnShowAllLaptops(){
		showAllLaptops.click();
	}
	
	//1st scenario methods
	
	public void clickOnMacbookItem(){
		macBookItem.click();
	}
	
	public void addMacBookToCart(){
		addToCartButton1.click();
	}
	
	
	public String getSuccessMessage1(){
		return successMessage1.getText();
		
	}
	public boolean isSucessMessage1Present(){
		if(successMessage1.isDisplayed())
			return true;
		else
			return false;
	}
	
	public String getcartTotal1Item(){
		return cartTotal.getText();
			}
			
	public boolean cartTOtal602(){
		if(getcartTotal1Item().equals("1 item(s)-602.00"))
			return true;
		else return false;
	}
	

public void clickOnCartButon(){
	cartButton.click();
}
	
public void clickOnRedX(){
	cartRedX.click();
}

public String getCartTotal0Items(){
	return cartTotal.getText();
}

public boolean cartTotal0(){
	if(getCartTotal0Items().equals("0 item(s)"))
			return true;
	else return false;
}

//2nd scenario methods

public void clickOnComparisonMacbook(){
	comparisonButtonMacBook.click();
}

public void clickOnComparisonMacbookAir(){
	comparisonButtonMacBookAir.click();
}

public String returnSuccessFulComparisonMessage(){
	return successMessage2.getText();
}

public boolean successComparsionMessageTrue(){
	if(returnSuccessFulComparisonMessage().equals("Success: You have added MacBook Air to your product comparison!"))
			return true;
	else return false;   }

public void clickOnComparisonTab(){
	productComparisonLink.click();
}

public String productComparisonVerification(){
	return productComparison.getText();
}

public boolean productComparisonTrue(){
	if(productComparisonVerification().equals("Product Comparison"))
		return true;
		else return false;
	
}

//3rd scenario methods

public void addSonyToWishList(){
	sonyVaioWishList.click();
}

public String wishListMessage(){
	return mustSignInMessage.getText();
}

public boolean wishListMessageVerification(){
	if(wishListMessage().equals("You must login or create an account to save Sony VAIO to your wish list!"))
		return true;
	else return false;
}

//4th scenario methods

public void clickOnMacBookPro(){
	macBookPro.click();
}

public String  macBookProPrice(){
	return macBookProPrice.getText();
}

public boolean macBookProPriceVerification(){
	if(macBookProPrice().equals("$2,000.00"))
		return true;
	else return false;
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
