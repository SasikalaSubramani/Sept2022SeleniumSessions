package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//WebDriver wait->FluentWait->wait (until)
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://classic.crmpro.com/index.html");
		By forgotpwd = By.linkText("Forgot Password?11");
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(ElementNotInteractableException.class)
//				.ignoring(NoSuchElementException.class)
//				.ignoring(StaleElementReferenceException.class)
//				.withMessage("Element not found on the page....");
//				
//				
//	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(forgotpwd));
//	ele.click();
		waitForElementToBeVisibleWithFluentWiat(forgotpwd, 10, 2);

	}
	
	public static WebElement waitForElementToBeVisibleWithFluentWiat(By locator, int timeOut, int intervalTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime))
				.ignoring(ElementNotInteractableException.class)
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("Element not found on the page....");
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public static WebElement waitForElementToBeVisible(By locator, int timeOut, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut),Duration.ofSeconds(intervalTime));
		wait.ignoring(NoSuchElementException.class)
			.ignoring(ElementNotInteractableException.class)
			.withMessage("Element not found on the page....");
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

}
