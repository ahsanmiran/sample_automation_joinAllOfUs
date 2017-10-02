package framework;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefinition.SharedSD;



public class BasePage {
	
//	Method to click on any web element
	
	public void clickOn(By locator) {
		try {
			SharedSD.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

//	Method to send text to any input field
	
	public void sendText(By locator, String text) {
		try {
			SharedSD.getDriver().findElement(locator).clear();
			SharedSD.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

//	Method to get text from any web element
	
	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = SharedSD.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}
	

	public void clickOnBrowserBackArrow() {
		SharedSD.getDriver().navigate().back();
	}

	public void clickOnBrowserForwardArrow() {
		SharedSD.getDriver().navigate().forward();
	}

	public void refreshBrowser() {
		SharedSD.getDriver().navigate().refresh();
	}
	
//	This method will hover over on web element
	
	public static void mouseHoverOver(By hoverOverLocator){
	WebElement element = SharedSD.getDriver().findElement(hoverOverLocator);
	Actions action = new Actions(SharedSD.getDriver());
	action.moveToElement(element).perform();
	}
	
//	Explicit wait

	public static void waitUntilElementClickable(By linkLocator){
		try {
			WebDriverWait wait = new WebDriverWait(SharedSD.getDriver(), 10);
			wait.until(ExpectedConditions.elementToBeClickable(linkLocator));
		} catch (TimeoutException e) {
			Assert.fail("No clickable element found.");
			e.printStackTrace();
		}
	}
	
	
	public static void dragAndDropElement(By dragItemLocator, By dropTargetLocator){
		Actions action = new Actions(SharedSD.getDriver());
		WebElement dragIt = SharedSD.getDriver().findElement(dragItemLocator);
		WebElement dropHere = SharedSD.getDriver().findElement(dropTargetLocator);
		action.dragAndDrop(dragIt, dropHere).perform();
	}
	
//	This method will press enter button
	
	public static void pressEnter(){
		Actions action = new Actions(SharedSD.getDriver());
		action.sendKeys(Keys.ENTER);
	}
	
//	This Java Script method will click on web elements
	
	public static void clickMethodByJs(By locator){
		WebElement element = SharedSD.getDriver().findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor)SharedSD.getDriver();
		js.executeScript("arguments[0].click()", element);
	}
}
