package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class annotation {
	
	WebDriver dvr = null;
	
	@Given("^User is on BuyTickets Page$")
	public void user_is_on_buy_tickets_page() {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Damon/Downloads/geckodriver-v0.11.1-win64/geckodriver.exe");
		dvr = new FirefoxDriver();
		dvr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dvr.get("www.trainline.com");
	}
	
	@When("^User enters OutDate$")
	public void usr_enters_date() {
		
	}
	
}