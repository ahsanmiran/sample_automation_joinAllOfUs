package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;


public class SignUpSD {
	
	private HomePage home = new HomePage();


	@Given("^I am on the home page of joinallofus\\.com$")
	public void iAmOnTheHomePageOfJoinallofusCom(){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), "Precision Medicine – Prevent Health Disparities | All of Us");
	}

	@When("^I hover over HOW TO JOIN from menu bar$")
	public void iClickOnHOWTOJOINFromMenuBar() {
		home.mouseHoverOverHowToJoinMenu();
	}

	@When("^I click on GET STARTED - SIGN UP sub menu$")
	public void iClickOnGETSTARTEDSIGNUPSubMenu() {
		home.clickOnGetStartedSubenu();
	}

	@When("^I click on the SUBSCRIBE TO UPDATE link$")
	public void iClickOnTheSUBSCRIBETOUPDATELink() {
		home.clickOnSubscribeToUpdateLink();
	}

	@Then("^I got a form with the title \"([^\"]*)\"$")
	public void iGotAFormWithTheTitle(String formTitle){
		Assert.assertEquals(home.getFormTitle(), formTitle);
	}

	@When("^I write email address \"([^\"]*)\" into Enter email input field$")
	public void iWriteEmailAddressIntoEnterEmailInputField(String emailAddress) {
		home.writeEmailAddress(emailAddress);
	}

	@When("^I write \"([^\"]*)\" into First name input field$")
	public void iWriteIntoFirstNameInputField(String firstName) {
		home.writeFirstName(firstName);
	}

	@When("^I write \"([^\"]*)\" into Last name input field$")
	public void iWriteIntoLastNameInputField(String lastName) {
		home.writeLastName(lastName);
	}

	@When("^I write \"([^\"]*)\" into ZIP code input field$")
	public void iWriteIntoZIPCodeInputField(String zipCode) {
		home.writeZipCode(zipCode);
	}

	@When("^I click on Subscribe button$")
	public void iClickOnSubscribeButton() {
		home.clickOnSubscribeButton();
	}

	@Then("^I verify the success message displayed as \"([^\"]*)\"$")
	public void iVerifyTheSuccessMessageDisplayedAs(String successMsg) {
		Assert.assertEquals(home.getSuccessMsg(), successMsg);
	}
	
	

}
