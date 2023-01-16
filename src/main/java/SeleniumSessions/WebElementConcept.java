package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// create webelement +perform action on it -->click, sendKeys, getText,isDisplayed
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");	
		
		 driver = new ChromeDriver();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		Locator 1 : ID
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		
		//LOGOUT
		//driver.findElement(By.id("input-email")).sendKeys("Tom@gmail.com");
		
		
		//2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");
		//LOGOUT
		//emailId.sendKeys("Tom@gmail.com");
		
		//3 By locator
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email_ele = driver.findElement(emailId);
//		WebElement pwd_ele = driver.findElement(password);
//		
//		email_ele.sendKeys("naveen@gmail.com");
//		pwd_ele.sendKeys("naveen@123");
		
		//4th By locator + generic function
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("tom@gmail.com");
//		getElement(password).sendKeys("tom@123");
		
		//5 By locator +generic function - getElement () and action methods
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "test@gmail.com");
//		doSendKeys(password, "test@123");
		
		//6 By locator +generic function - getElement () and action methods in a util class
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(password, "naveen@123");
		
		//create a separate generic util class and a test class with main method
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}
	public static void doSendKeys (By locator, String value) {
		getElement(locator).sendKeys(value);
		

	}

}
