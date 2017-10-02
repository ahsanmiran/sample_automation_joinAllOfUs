package framework;

import org.openqa.selenium.By;

public class MenuBarPage extends BasePage{
	
	//Locators for web elements
		private By aboutMenuLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=1]");
		private By programOverviewLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=2]");
		private By privacySafeguardLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=3]");
		private By whosInvolvedLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=4]");
		private By faqSubmenuLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=5]");
		private By howToJoinMenuLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=6]");
		private By getStartedSubmenuLocator= By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=7]");
		private By whoCanJoinLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=8]");
		private By whatYouNeedToDoLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=9]");
		private By benefitsOfTakingPartLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=10]");
		private By howYourDataWillBeUsedLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=11]");
		private By visitAllOfUsPartnerLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=12]");
		private By newsAndEventLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=13]");
		private By eventsSubmenuLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=14]");
		private By directorsCornerLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=15]");
		private By communityMenuLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=16]");
		private By logInMenuLocator = By.xpath(".//*[@id='block-basis-main-menu']/descendant::a[position()=17]");
		private By logInPageTitleLocator = By.xpath("//h3[text()='Hi!']");
		
//Methods to do specific action on Menu Bar
		
//		Method to hover over on ABOUT menu button
		
		public void mouseHoverOverAboutMenu(){
			mouseHoverOver(aboutMenuLocator);
		}
		
//		Method to click on Program Overview Sub menu button
		
		public void clickOnProgramOverview(){
			clickOn(programOverviewLocator);
		}
		
		public void clickOnPrivacySafeguard(){
			clickOn(privacySafeguardLocator);
		}
		
		public void clickOnwhosInvolved(){
			clickOn(whosInvolvedLocator);
		}
		
		public void clickOnFaqSubmenu(){
			clickOn(faqSubmenuLocator);
		}
		
//		Method to hover over on How To Join menu button
		
		public void mouseHoverOverHowToJoinMenu(){
			mouseHoverOver(howToJoinMenuLocator);
		}
		
		public void clickOnGetStartedSubmenu(){
			clickOn(getStartedSubmenuLocator);
		}
		
		public void clickOnWhoCanJoinSubmenu(){
			clickOn(whoCanJoinLocator);
		}
		
		public void clickOnWhatYouNeedToDoSubmenu(){
			clickOn(whatYouNeedToDoLocator);
		}
		
		public void clickOnBenefitsOfTakePartSubmenu(){
			clickOn(benefitsOfTakingPartLocator);
		}
		
		public void clickOnHowYourDataWillBeUsedSubmenu(){
			clickOn(howYourDataWillBeUsedLocator);
		}
		
		public void clickOnVisitPartnerLocationSubmenu(){
			clickOn(visitAllOfUsPartnerLocator);
		}	
		
		public void mouseHoverOverNewsAndEventsMenu(){
			mouseHoverOver(newsAndEventLocator);
		}
		
		public void clickOnEventsSubmenu(){
			clickOn(eventsSubmenuLocator);
		}
		
		public void clickOnDirectorsCornerSubmenu(){
			clickOn(directorsCornerLocator);
		}
		
		public void clickOnCommunityMenu(){
			clickOn(communityMenuLocator);
		}
		
		public void clickOnLogInMenu(){
			clickOn(logInMenuLocator);
		}
		
//		This method will return text from web element
		
		public String getPageTitleOfLogInPage(){
			return getTextFromElement(logInPageTitleLocator);
		}
		
}
