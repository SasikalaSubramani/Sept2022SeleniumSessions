package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//explicitly wait:
		// can be applied for a specific element
		//not global wait
		//can be applied for non web elements: alerts, urls, title
		//1. WebDriver wait --C
		//2. FluentWait ---C
		
		//1. WebDriver wait -->extends -->fluentwait(C) --->implements --->Wait(I)---until()
											//until()
											// other  methods
		
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://naveenautomationlabs.com/opencart/");		
//		By mackBook = By.linkText("MacBook11");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		WebElement mac_ele = wait.until(ExpectedConditions.presenceOfElementLocated(mackBook));
//		WebElement mac_ele = waitForElementPresence(mackBook,10);
//		mac_ele.click();
		
		By emailID = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@value='Login']");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		waitForElementPresence(emailID,10).sendKeys("naveen@gmail.com");
		getElement(password).sendKeys("test@123");
		getElement(login).click();
		
		
		
	}
	//An expectation for checking that an element is present on the DOM of a page. 
//	This does notnecessarily mean that the element is visible
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	//An expectation for checking that an element is present on the DOM of a page and visible.
//	Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
