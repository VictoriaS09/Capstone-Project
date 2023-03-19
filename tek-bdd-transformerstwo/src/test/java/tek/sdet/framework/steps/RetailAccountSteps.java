package tek.sdet.framework.steps;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated Name and Phone values ");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		logger.info("user profile information updated");
	}
	@When("User enter below information")
	public void userEnterBelowInformation(io.cucumber.datatable.DataTable dataTable) {
	   sendText(factory.accountPage().previousPassword, "Tekschool123!");
	   sendText(factory.accountPage().newPassword,"Tekstudent123!");
	   sendText(factory.accountPage().confirmPassword,"Tekstudent123!");
	   logger.info("user entered information");
	}
	@When("User click on change password button")
	public void userClickonChangePasswordButton() {
		click(factory.accountPage().changePasswordBtn);
		logger.info("user clicked on change password button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		logger.info("password updated successfully");
	}
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	   click(factory.accountPage().addYourPaymentLink);
	   logger.info("user clicked add a payment method link");
	}
	@When("User fill debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
	    sendText(factory.accountPage().cardNumber, "1234567890123456");
	    sendText(factory.accountPage().nameOncard,"Mary Sue");
	    selectByVisibleText(factory.accountPage().monthDropDown, "4");
	    selectByVisibleText(factory.accountPage().yearDropDown,"2024");
	    sendText(factory.accountPage().securityCode,"111");
	    logger.info("user filled debit or credit card information");
	    
	}
	@When("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	    click(factory.accountPage().submit);
	    logger.info("user clicked on add your card");
	}
	@Then("a message should be displayed payment added successfully")
	public void paymentMethodUpdatedSuccessfully(String string) {
		waitTillPresence(factory.accountPage().paymentAddedSuccessfully);
		Assert.assertEquals(string, factory.accountPage().paymentAddedSuccessfully.getText());
		logger.info("payment added successfully");
}
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	    click(factory.accountPage().yourCard);
	    click(factory.accountPage().removeYourCard);
	    logger.info("user clicked on remove option of card section");
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	    logger.info("payment details should be removed");
	}
	@When("User click on  Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("user clicked on Add address option");

	}
	@When("User fill new address form with below information")
	public void userFllNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		sendText(factory.accountPage().fullNameField,DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
		sendText(factory.accountPage().phoneNumberField,DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.accountPage().cityField,DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		selectByVisibleText(factory.accountPage().stateDropDown,DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		sendText(factory.accountPage().zipCodeField,DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		logger.info("user filled the new address form with information provided in data table");

	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressButton);
		logger.info("user clicked on Add your Address button");
	}
	@Then("a message should be displayed address added successfully")
	public void addressAddedSucessfully(String expectedMessage) {
		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
		Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());	

	}
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    click(factory.accountPage().editYourAddress);
	    logger.info("user clicked on edit address option");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		clearTextUsingSendKeys(factory.accountPage().fullNameField);
		sendText(factory.accountPage().fullNameField,DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
		sendText(factory.accountPage().phoneNumberField,DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		clearTextUsingSendKeys(factory.accountPage().streetAddressField);
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		clearTextUsingSendKeys(factory.accountPage().apartmentNumber);
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		clearTextUsingSendKeys(factory.accountPage().cityField);
		sendText(factory.accountPage().cityField,DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		selectByVisibleText(factory.accountPage().stateDropDown,DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		clearTextUsingSendKeys(factory.accountPage().zipCodeField);
		sendText(factory.accountPage().zipCodeField,DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		logger.info("user filled new address form with below information");
		
	}
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	    click(factory.accountPage().removeYourAddress);
	    logger.info("user clicked on remove address section");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	    logger.info("Address details are removed");
	}

}
