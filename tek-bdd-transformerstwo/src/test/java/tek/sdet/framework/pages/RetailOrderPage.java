package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
		
}
	@FindBy(id = "orderLink")
	public WebElement orderLink;
	
	@FindBy(xpath = "//p[@class='order__header-btn']")
	public WebElement selectOrder;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelOrderBtn;
	
	@FindBy(id = "reasonInput")
	public WebElement cancelationReason;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrder;
	
	@FindBy(id = "returnBtn")
	public WebElement returnOrder;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffLocation;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewButton;

	@FindBy(id = "headlineInput")
	public WebElement headLine;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionBox;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmit;
	}
	

