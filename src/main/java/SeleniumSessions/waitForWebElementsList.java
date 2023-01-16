package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForWebElementsList {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.freshworks.com/");
		By footer = By.cssSelector("ul.footer-nav a");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
//		List <WebElement> foolterList =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));		
//		System.out.println(foolterList.size());
		
		List <WebElement> foolterList =waitForElementsVisible(footer, 10);
		System.out.println(foolterList.size());
		
	}
	
	/**
	 * An expectation for checking that all elements present on the web page that match the locatorare visible. 
	 * Visibility means that the elements are not only displayed but also have a heightand width that is greater than 0.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static List<WebElement> waitForElementsVisible (By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));		
	    return	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	
	public static List<WebElement> waitForElementsPresence (By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));		
	    return	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	

}
