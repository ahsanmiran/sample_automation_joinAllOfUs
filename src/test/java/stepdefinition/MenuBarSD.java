package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.MenuBarPage;

public class MenuBarSD {
	
	MenuBarPage menuBar = new MenuBarPage();
	

	@Given("^I am on home page of joinallofus\\.com$")
	public void iAmOnTheHomePageOfJoinallofusCom(){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), "Precision Medicine – Prevent Health Disparities | All of Us");
	}
	
	@When("^I hover over ABOUT menu from main menu bar$")
	public void iClickOnABOUTFromMenuBar() {
		menuBar.mouseHoverOverAboutMenu();
	}
	

	@When("^I click on (PROGRAM_OVERVIEW|PRIVACY_SAFEGUARDS|WHO'S_INVOLVED|FAQ) sub menu$")
	public void iClickOnDifferentSubMenu(String subMenu) {
		
		switch (subMenu){
		case "PROGRAM_OVERVIEW":
			menuBar.clickOnProgramOverview();
			break;
		case "PRIVACY_SAFEGUARDS":
		menuBar.clickOnPrivacySafeguard();
			break;
		case "WHO'S_INVOLVED":
			menuBar.clickOnwhosInvolved();
			break;
		case "FAQ":
			menuBar.clickOnFaqSubmenu();
			break;
		}
	}
	
	@Then("^I verify PROGRAM OVERVIEW page title as \"([^\"]*)\"$")
	public void iVerifyPROGRAMOVERVIEWPageTitle (String title1){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title1);
	}
	
	@Then("^I verify PRIVACY SAFEGUARDS page title as \"([^\"]*)\"$")
	public void iVerifyPRIVACYSAFEGUARDSPageTitle (String title2){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title2);
	}

	@Then("^I verify WHO'S INVOLVED page title as \"([^\"]*)\"$")
	public void iVerifyWHOINVOLVEDPageTitle (String title3){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title3);
	}
	
	@Then("^I verify FAQ page title as \"([^\"]*)\"$")
	public void iVerifyFAQPageTitle (String title4){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title4);
	}
	
	@When("^I hover over HOW TO JOIN menu from main menu bar$")
	public void iClickOnHowToJoinFromMenuBar() {
		menuBar.mouseHoverOverHowToJoinMenu();;
	}
	
	@When("^I click on (GET_STARTED-SIGN_UP|WHO_CAN_JOIN|WHAT_YOU_WOULD_NEED_TO_DO|"
			+ "BENEFITS_OF_TAKING_PART|HOW_YOUR_DATA_WILL_BE_USED|VISIT_AN_ALL_OF_US_PARTNER_LOCATION) sub menu$")
	public void iClickOnDfrntSubMenu(String subMenu) {
		
		switch (subMenu){
		case "GET_STARTED-SIGN_UP":
			menuBar.clickOnGetStartedSubmenu();;
			break;
		case "WHO_CAN_JOIN":
		menuBar.clickOnWhoCanJoinSubmenu();;
			break;
		case "WHAT_YOU_WOULD_NEED_TO_DO":
			menuBar.clickOnWhatYouNeedToDoSubmenu();
			break;
		case "BENEFITS_OF_TAKING_PART":
			menuBar.clickOnBenefitsOfTakePartSubmenu();
			break;
		case "HOW_YOUR_DATA_WILL_BE_USED":
			menuBar.clickOnHowYourDataWillBeUsedSubmenu();
			break;
		case "VISIT_AN_ALL_OF_US_PARTNER_LOCATION":
			menuBar.clickOnVisitPartnerLocationSubmenu();
			break;
		}
	}
	
	@Then("^I verify GET STARTED-SIGN UP page title as \"([^\"]*)\"$")
	public void iVerifyGetStartedSignUpPageTitle (String title5){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title5);
	}
	
	@Then("^I verify WHO CAN JOIN page title as \"([^\"]*)\"$")
	public void iVerifyWHOCANJOINPageTitle (String title6){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title6);
	}
	
	@Then("^I verify WHAT YOU WOULD NEED TO DO? page title as \"([^\"]*)\"$")
	public void iVerifyWHATYOUWOULDNEEDTODOPageTitle (String title7){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title7);
	}
	
	@Then("^I verify BENEFITS OF TAKING PART page title as \"([^\"]*)\"$")
	public void iVerifyBENEFITSOFTAKINGPARTPageTitle (String title8){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title8);
	}
	
	@Then("^I verify HOW YOUR DATA WILL BE USED page title as \"([^\"]*)\"$")
	public void iVerifyHOWYOURDATAWILLBEUSEDPageTitle (String title9){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title9);
	}

	@Then("^I verify VISIT AN ALL OF US PARTNER LOCATION page title as \"([^\"]*)\"$")
	public void iVerifyVISITANALLOFUSPARTNERLOCATIONPageTitle (String title10){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title10);
	}
	
	@When("^I hover over NEWS & EVENTS menu from main menu bar$")
	public void iClickOnNewsEventsFromMenuBar() {
		menuBar.mouseHoverOverNewsAndEventsMenu();
	}
	
	@When("^I click on (EVENTS|DIRECTORS_CORNER) sub menu$")
	public void iClickOnDfntSubMenu(String subMenu) {
		
		switch (subMenu){
		case "EVENTS":
			menuBar.clickOnEventsSubmenu();
			break;
		case "DIRECTORS_CORNER":
		menuBar.clickOnDirectorsCornerSubmenu();
			break;
		}
	}
	
	@Then("^I verify EVENTS page title as \"([^\"]*)\"$")
	public void iVerifyEVENTSPageTitle (String title11){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title11);
	}
	
	@Then("^I verify DIRECTORS CORNER page title as \"([^\"]*)\"$")
	public void iVerifyDIRECTORSCORNERPageTitle (String title12){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title12);
	}
	
	@When("^I click on (COMMUNITY|LOG_IN) menu from main menu bar$")
	public void iClickOnDffrntSubMenu(String subMenu) {
		
		switch (subMenu){
		case "COMMUNITY":
			menuBar.clickOnCommunityMenu();
			break;
		case "LOG_IN":
		menuBar.clickOnLogInMenu();
			break;
		}
	}
	
	@Then("^I verify COMMUNITY page title as \"([^\"]*)\"$")
	public void iVerifyCOMMUNITYPageTitle (String title13){
			Assert.assertEquals(SharedSD.getDriver().getTitle(), title13);
	}
	
	@Then("^I verify LOG IN page title as \"([^\"]*)\"$")
	public void iVerifyLOGINPageTitle (String title14){
			Assert.assertEquals(menuBar.getPageTitleOfLogInPage(), title14);
	}
	
}
