package tek.sdet.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.orderPage().orderLink);
	    logger.info("user clicked on order section");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	    logger.info("user cliked on first order in list");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    click(factory.orderPage().cancelOrderBtn);
	    logger.info("user clicked on cancel order button");
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
		selectByVisibleText(factory.orderPage().cancelationReason, "Bought wrong item");
		logger.info("user selected cancelation reason");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.orderPage().cancelOrder);
	    logger.info("user clicked order button");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
	   logger.info("Your order has been canceled message is displayed");
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnOrder);
	    logger.info("user clicked return items button");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		selectByVisibleText(factory.orderPage().cancelationReason, "Item damaged");
		logger.info("user selected return reason");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.orderPage().dropOffLocation, "FedEx");
		logger.info("user selected drop off service");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.orderPage().cancelOrder);
	    logger.info("user clicked on return order button");
	}

	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().reviewButton);
	    logger.info("user clicked on review button");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
		sendText(factory.orderPage().headLine, "Amazing Product");
		sendText(factory.orderPage().descriptionBox, "so cool to use!");
		logger.info("user wrote a review");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.orderPage().reviewSubmit);
	    logger.info("user clicked add your review");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
	    logger.info("Your review was added successfully");
	}




	
}
