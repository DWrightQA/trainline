package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class TestCaseTwo {

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Damon/Downloads/geckodriver-v0.11.1-win64/geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("http://www.thetrainline.com");
		String str = drv.getTitle();
		Assert.assertTrue("Should contain 'Trainline'",str.contains("Trainline"));
		
		WebElement origin = drv.findElement(By.id("originStation\n"));
		origin.sendKeys("Brighton");
		origin.sendKeys(Keys.RETURN);
		
		WebElement destination = drv.findElement(By.id("destinationStation\n"));
		destination.sendKeys("London Bridge");
//		destination.sendKeys(Keys.RETURN);
//
//		
//		drv.findElement(By.id("submitButton")).click();
//		drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
//		
//		WebElement timeTable = drv.findElement(By.id("matrixLength1"));
//		Assert.assertTrue("Timetable should be on screen",timeTable.isDisplayed());
//		
//		
//		drv.quit();
		
	}

}
