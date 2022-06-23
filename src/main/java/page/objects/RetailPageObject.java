package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base{
	
	public RetailPageObject(){
		PageFactory.initElements( driver, this);
	}
	
	//backround
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentLogo;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountOption;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;
	
	@FindBy(id="input-email")
	private WebElement emailInput;
	
	@FindBy(id="input-password")
	private WebElement passwordInput;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Account']")
	private WebElement accountDashboard;
	
	//1st scenario
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement affiliateAccountLink;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyEntry;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement websiteEntry;
	
	@FindBy(xpath = "//input[@name='tax']")
	private WebElement taxIDentry;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeBox;
	
	
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement ChequePayeeName;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement AboutUsCheckBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessage1;
	
	//2nd scenario
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement afiliateInformationLink;
	
	@FindBy(xpath ="//input[@value='bank']")
	private WebElement bankBox;
	
	@FindBy(xpath ="//input[@id='input-bank-name']")
	private WebElement bankNameInput;
	
	@FindBy(xpath ="//input[@id='input-bank-branch-number']")
	private WebElement branchNumber;
	
	@FindBy(xpath ="//input[@id='input-bank-swift-code']")
	private WebElement swiftNumber;
	
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement AccName;
	
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement AccNumber;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton1;
	
	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessage2;
	
	//3rd scenario
	
	@FindBy(xpath = "//a[text()='Edit your account information']" )
	private WebElement accInfoLink;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement inputFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement inputLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement inputEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement inputTelephone;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton2;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage3;
	
	//methods for backround
	
	public boolean isLogoPresent(){
		if(testEnvironmentLogo.isDisplayed())
		return true;
		else
		return false;}
	
	public String getTitle(){
		return driver.getTitle();
		
	}
	
	
	public void clickOnMyAccOption(){
		myAccountOption.click();
	}
	
	public void clickOnLoginOption(){
		loginOption.click();
	}
	
	public void emailPasswordInput(String email, String password){
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
	}
	
	public void loginButtonClick(){
		loginButton.click();
	}
	
	public boolean isAccDashboardPresent(){
		if(accountDashboard.isDisplayed())
			return true;
		else return false;
	}
	
	//1st scneario
	
	public void clickOnAffiliateAccLink(){
		affiliateAccountLink.click();
	}
	
	public void enterAffiliateInformation(){
		
	}
	
	
	
	
	
	
	

}
