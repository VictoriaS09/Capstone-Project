package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "profileImage")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;

	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement profileUpdateButton;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;

	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressOption;
	
	@FindBy(id = "countryDropdown")
	public WebElement country;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberField;
	
	@FindBy(id = "streetInput")
	public WebElement streetAddressField;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;
	
	@FindBy(id = "cityInput")
	public WebElement cityField;
	
	@FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;
	
	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPassword;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassword;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePasswordBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passwordUpdatedSuccessfullyMessage;
	
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
    public WebElement addYourPaymentLink;
	
	@FindBy(id = "cardNumberInput")
    public WebElement cardNumber;

    @FindBy(id = "nameOnCardInput")
    public WebElement nameOncard;
    
    @FindBy(xpath = "//select[@id='expirationMonthInput']")
    public WebElement monthDropDown;
    
    @FindBy(xpath = "//select[@id='expirationYearInput']")
    public WebElement yearDropDown;
    
    @FindBy(id = "securityCodeInput")
    public WebElement securityCode;
    
    @FindBy(id = "paymentSubmitBtn")
    public WebElement submit;
    
    @FindBy(xpath = "//div[contains(text(),'Payment Added Successfully')]")
    public WebElement paymentAddedSuccessfully;
    
    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editYourPayment; 
    
    @FindBy(xpath = "//div[@class='false account__payment-item']")
    public WebElement yourCard; 
    
    @FindBy(xpath = "//button[contains(text(),'remove')]")
    public WebElement removeYourCard; 
    
    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editYourAddress;
    
    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    public WebElement removeYourAddress;
    
    
}
