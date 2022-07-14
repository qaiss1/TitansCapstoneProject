package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {
	
	public DesktopPageObject(){
		PageFactory.initElements(driver, this);
	}
	
	//background
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentLogo;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsButton;
	
	//1st scenario
	
	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement allDesktops;
	
	//2nd scenario
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[3]/div/div[2]/div[2]/button[1]")
	private WebElement addToCartHpLp;
	
	@FindBy(id= "input-quantity")
	private WebElement quantity1HpLp;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton1;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage1;
	
	//3rd scenario
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement addToCartEos;
	
	@FindBy(xpath ="//select[@id='input-option226']")
	private WebElement selectDropdown;
	
	@FindBy(xpath= "//option[@value='15']")
	private WebElement selectRedColor;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantity1Eos;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton2;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage2;
	
	//4th scenario
	
	@FindBy(xpath ="//a[@href= 'http://tek-school.com/retail/index.php?route=product/product&path=20&product_id=30'][1]")
	private WebElement clickOnEos;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement clickOnwriteAReview;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement nameEntry;
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement reviewEntry;
	
	@FindBy(xpath = "//input[@type='radio' and @value='5']")
	private WebElement goodRating;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage3;
	
	//background methods
	public boolean isLogoPresent(){
		if(testEnvironmentLogo.isDisplayed())
		return true;
		else
		return false;}
	
	public String getTitle(){
		return driver.getTitle();
		
	}
	
	public void deskTopTabsClick(){
		desktopsTab.click();
	}
	
	public void showAllDesktopsClick(){
		showAllDesktopsButton.click();
	}
	
	//1st scenario methods
	
	public boolean allDesktopsPage(){
		if(allDesktops.isDisplayed())
			return true;
		else
			return false;
	}
	
	//2nd scenario methods
	
	public void clickOnAddHpLp2Cart(){
		addToCartHpLp.click();
	}
	
	public void enter1QuantityForHpLP(){
		quantity1HpLp.click();
		quantity1HpLp.clear();
		quantity1HpLp.sendKeys("1");
		
	}
	
	public void addToCart1(){
		addToCartButton1.click();
			
	}
	public boolean isSucessMessage1Present(){
		if(successMessage1.isDisplayed())
			return true;
		else
			return false;
	}
	
	public String getSuccessMessage1(){
		return successMessage1.getText();
		
	}
	
	//3rd scenario methods
	
	public void clickOnAddEOS2Cart(){
		addToCartEos.click();
	}
	
	public void selectRedColor(){
		selectDropdown.click();
		selectRedColor.click();
	}
	
	public void selectQuanitity1ForEos(){
        quantity1Eos.click();
        quantity1Eos.clear();
        quantity1Eos.sendKeys("1");
	}
	
	public void addToCart2(){
		addToCartButton2.click();
	}
	public boolean isSuccessMessage2Present(){
		if(successMessage2.isDisplayed())
			return true;
		else
			return false;
	}
	
	public String getSuccessMessage2(){
		return successMessage2.getText();
	}
	
	//4th SCenario Methods
	
	public void clickOnEos5(){
		clickOnEos.click();
	}
	
	public void clickOnAddReview(){
		clickOnwriteAReview.click();
	}
	
	public void enterName(String yourname){
		nameEntry.sendKeys(yourname);
	}
	
	public void enterReview(String yourReview){
		reviewEntry.sendKeys(yourReview);
	}
	
	public void clickOnGoodRating(){
		goodRating.click();
	}
	
	public void clickOnContinueButton(){
		continueButton.click();
	}
	
	public boolean isSuccessMessage3Present(){
		if(successMessage3.isDisplayed())
			return true;
			else 
				return false;
		}
	
	
	public String getSuccessMessage3(){
		return successMessage3.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
