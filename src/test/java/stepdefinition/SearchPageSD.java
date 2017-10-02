package stepdefinition;

import org.testng.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import framework.SearchResultPage;

public class SearchPageSD {	
	private HomePage home = new HomePage();
	private SearchResultPage search = new SearchResultPage();
		
	@When("^I click on Search box from top right corner of the home page$")
	public void iClickOnSearchBoxFromTopRightCornerOfTheHomePage() {
//		Calling methods from HomePage
		home.clickOnSearchBox();
	}

	@When("^I write \"([^\"]*)\" into search box$")
	public void iWriteIntoSearchBox(String text) {
		home.writeSearchItem(text);
	}

	@When("^I click on GO button$")
	public void iClickOnGOButton() {
		home.clickOnGoButton();
	}

	@When("^I click on Who Can Join – PMI Requirements link$")
	public void iClickOnLink() {
//		Calling methods from SearchResultPage
		search.clickOnPmiPageLink();
	}

	@Then("^I verify page title as \"([^\"]*)\"$")
	public void iVerifiedPageTitleAs(String pageTitle) {
		Assert.assertEquals(SharedSD.getDriver().getTitle(), pageTitle);
}
}
