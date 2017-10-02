package framework;

import org.openqa.selenium.By;

public class SearchResultPage extends BasePage{
	
	//Locators for web elements
		private By pmiPageLink = By.xpath(".//a[contains(text(), 'Who Can Join – PMI Requirements')]");
		
		
		
//Methods to do specific action on Search Result page
		public void clickOnPmiPageLink(){
			waitUntilElementClickable(pmiPageLink);
			clickOn(pmiPageLink);
		}
}
