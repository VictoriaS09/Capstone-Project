package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class HomeSteps extends CommonUtility {
private POMFactory factory = new POMFactory(); 
	
	
    @When("User search for {string} product")
    public void userSearchForProduct(String productValue) {
        sendText(factory.homePage().searchBar, productValue);
        click(factory.homePage().searchButton);
        logger.info("user searched for product "+ productValue );
    }
    @Then("The product should be displayed")
    public void theProductShouldBeDisplayed() {
        Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
           logger.info("the Product is displayed on home page");
    }
    @When("User click on All section")
    public void userClickOnAllSection() {
    	click(factory.homePage().allIcon);
		logger.info("user clicked on All section");

    }
    @Then("below options are present in Shop by Department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSidebar(io.cucumber.datatable.DataTable dataTable) {
    	List<List<String>> expectedSideBar = dataTable.asLists(String.class);

		List<WebElement> actualSideBar = factory.homePage().sideBarElements;

		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));
		}
	//Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
	//Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
	//	Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
		//Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
		//Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
		logger.info("actual is equal to expected");
    }
    @When("User change the category to {string}")
    public void userChangeTheCategoryTo(String string) {
    	click(factory.homePage().smartHomeSearch);
        logger.info("user changed category to Smart Home");
    }
    @When("User search for an item {string}")
    public void userSearchForAnItem(String string) {
    	sendText(factory.homePage().searchBar, "kasa outdoor smart plug");
        logger.info("user searched for product "+ string );
    }
    @When("User click on Search icon")
    public void userClickOnSearchIcon() {
    	click(factory.homePage().searchBtn);
 	   logger.info("user clicked on search icon");

    }
    @When("User click on item")
    public void userClickOnItem() {
    	click(factory.homePage().kasaPlugProductImage);
 	   logger.info("user clicked on kasa outdoor smart plug");
    }
    @When("User select quantity {string}")
    public void userSelectQuantity(String string) throws InterruptedException {
    	selectByVisibleText(factory.homePage().qtyDropDown, "2");
    	Thread.sleep(5000);
    	logger.info("user selected quantity 2");
    }
    @When("User click add to Cart button")
    public void userClickAddToCartButton() {
    	click(factory.homePage().addToCartButton);
	    logger.info("user clicked add to cart button");
    }
    @Then("the cart icon quantity should change to {string}")
    public void theCartIconQuantityShouldChangeTo(String string) {
    	Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantityIcon));
        logger.info("the cart icon quantity should change to 2");
    }

    @Then("User click on Cart option")
    public void userClickOnCartOption() {
        click(factory.homePage().cartBtn);
        logger.info("user clicked on cart option");
    }
    @Then("User click on Proceed to Checkout button")
    public void userClickOnProceedToCheckoutButton() {
        click(factory.homePage().proceedBtn);
        logger.info("user clicked on proceed to checkout button");
    }
    @Then("User click Add a new address link for shipping address")
    public void userClickAddANewAddressLinkForShippingAddress() {
    	click(factory.homePage().addAddress);
        logger.info("user clicked on add new address");
		
    }
    @Then("User click Add a credit card or Debit Card for Payment method")
    public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
        click(factory.homePage().addPayment);
        logger.info("user click add a credit or debit card");
    }
    @Then("User click on Add your card button")
    public void userClickOnAddYourCardButton() {
        click(factory.homePage().paymentSubmit);
        logger.info("user click on add your card button");
    }
    @Then("User click on Place Your Order")
    public void userClickOnPlaceYourOrder() {
        click(factory.homePage().orderBtn);
        logger.info("user click on place your order button");
    }



}
