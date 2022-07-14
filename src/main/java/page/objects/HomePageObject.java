package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


public class HomePageObject extends Base {
	
	 public HomePageObject(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	//backGround
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentLogo;
	
	//1st scenario
	
	@FindBy(xpath ="//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currencyButton;
	
	@FindBy(xpath ="//button[text()='€ Euro']")
	private WebElement euroButton;
	
	@FindBy(xpath="//span[text()='Ex Tax: 392.30€']") // return Ex Tax: 392.30€
	private WebElement euro;
	
	//2nd scenario
	@FindBy(xpath= "//button[@type='button' and @data-toggle='dropdown' ]")
	private WebElement cartButton;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!' ]")
	private WebElement emptyCart;
	
	//background methods
	
	
	public boolean isLogoPresent(){
		if(testEnvironmentLogo.isDisplayed())
		return true;
		else
		return false;}
	
	public String getTitle(){
		return driver.getTitle();
		
	}
	
	//1st scenario methods
	
	public void clickOnCurrency(){
		currencyButton.click();
	}
	
	public void clickOnEuro(){
		euroButton.click();
	}
	
	public String returnEuro(){
		return euro.getText();
	}
	
	//2nd scenario
	
	public void clickOnShoppingCart(){
		cartButton.click();
	}
	
	public String getEmptyCart(){
		return emptyCart.getText();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
