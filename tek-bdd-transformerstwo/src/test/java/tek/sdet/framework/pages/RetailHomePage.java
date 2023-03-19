package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
	@FindBy(xpath = "//span[contains(text(),'Plugs and Outlets')]")
	public WebElement plugsSidebar;
	
	@FindBy(xpath = "//img[contains(@alt, 'Kasa Outdoor Smart Plug')]")
	public WebElement kasaPlugProductImage;
	
	@FindBy(css = "select.product__select")
	public WebElement qtyDropDown;
	
	@FindBy(id = "addToCartBtn")
	public WebElement addToCartButton;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQuantityIcon;
	
	@FindBy(xpath = "//select[@id='search']")
	public WebElement smartHomeSearch;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/*[1]")
	public WebElement searchBtn;
	
	@FindBy(id = "cartBtn")
	public WebElement cartBtn;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedBtn;
	
	@FindBy(id = "addAddressBtn")
	public WebElement addAddress;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement addPayment;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmit;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement orderBtn;
}