package stepdefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SharedSD {

	private static final String URL = "https://www.joinallofus.org/";
	public static WebDriver driver = null;

//	This method will initialize browser before each scenario
	
	@Given("^I open the default browser$")
	@Before
	public static void before() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ahsan\\Desktop\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
	}

//	This method will quite browser after each scenario, if it is initialized 
	
	@Then("^I close the default browser$")
	@After
	public static void after() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

//	This is getter method to return driver
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
