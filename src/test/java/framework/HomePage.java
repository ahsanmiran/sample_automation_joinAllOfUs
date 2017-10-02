package framework;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	
//Locators for web elements
	private By howToJoinMenuLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=6]");
	private By  getStartedSubmenuLocator= By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=7]");
	private By subscribeToUpdatesLocator = By.xpath(".//a[contains(text(), 'SUBSCRIBE TO UPDATES')]");
	private By subscriptionFormTitleLocator = By.xpath("//h5[contains(text(), 'Subscribe to News')]");
	private By emailInputFieldLocator = By.name("news_email");
	private By firstNameInputFieldLocator = By.name("news_first_name");
	private By lastNameInputFieldLocator = By.name("news_last_name");
	private By zipCodeInputFieldLocator = By.name("news_zip_code");
	private By subscribeButtonLocator = By.name("op");
	private By successMsgLocator = By.xpath(".//h1[contains(text(), 'Thank You')]");
	private By searchBoxLocator = By.name("keys");
	private By goButtonLocator = By.id("edit-submit");

	
//Methods to do specific action on Home page
	public void mouseHoverOverHowToJoinMenu(){
		mouseHoverOver(howToJoinMenuLocator);
	}
	
	public void clickOnGetStartedSubenu(){
		clickOn(getStartedSubmenuLocator);
	}
	
	public void clickOnSubscribeToUpdateLink(){
		clickOn(subscribeToUpdatesLocator);
	}
	
	public String getFormTitle(){
		return getTextFromElement(subscriptionFormTitleLocator);
	}
	
	public void writeEmailAddress(String emailAddress){
		sendText(emailInputFieldLocator, emailAddress);
	}
	
	public void writeFirstName(String firstName){
		sendText(firstNameInputFieldLocator, firstName);
	}
	
	public void writeLastName(String lastName){
		sendText(lastNameInputFieldLocator, lastName);
	}
	
	public void writeZipCode(String zipCode){
		sendText(zipCodeInputFieldLocator, zipCode);
	}
	
	public void clickOnSubscribeButton(){
		clickOn(subscribeButtonLocator);
	}
	
	public String getSuccessMsg(){
		return getTextFromElement(successMsgLocator);
	}
	
	public void clickOnSearchBox(){
		clickOn(searchBoxLocator);
	}
	
	public void writeSearchItem(String text){
		sendText(searchBoxLocator, text);
	}
	
//	Using Java Script click method to click on GO button
	
	public void clickOnGoButton(){
		clickMethodByJs(goButtonLocator);
	}	
}
