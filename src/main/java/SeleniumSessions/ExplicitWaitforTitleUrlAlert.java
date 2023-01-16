package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitforTitleUrlAlert {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleContains("Register"));
//		System.out.println(driver.getTitle());
		String title = waitForTitleContains("Register", 10);
		System.out.println(title);

		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@data-action-type=\"DISMISS\"]")).click();
		WebElement registry = driver.findElement(By.linkText("Registry"));
		registry.click();

		// title
		String actTitle = waitForTitleContains("Registry", 10);
		System.out.println(actTitle);

		// URL
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.urlContains("registries"));
//		System.out.println(driver.getCurrentUrl());

		String url = waitForURLContains("registries", 10);
		System.out.println(url);

		String url1 = waitForURL("https://www.amazon.com/registries?ref_=nav_cs_registry", 10);
		System.out.println(url1);

		// alert

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();

		// waiting for the alert and switching to the alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();

	}

	public static Alert waitForAlertPresentAndSwitch(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.alertIsPresent());

	}
	
	public static String getAlertText(int timeout) {
		 return waitForAlertPresentAndSwitch(timeout).getText();
	}
	public static void acceptAlert(int timeout) {
		waitForAlertPresentAndSwitch(timeout).accept();;
	}
	public static void dismissAlert(int timeout) {
		waitForAlertPresentAndSwitch(timeout).dismiss();;;
	}
	public static void alertSendKeys(int timeout, String value) {
		waitForAlertPresentAndSwitch(timeout).sendKeys(value);
	}

	public static String waitForURLContains(String urlFractionVal, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (wait.until(ExpectedConditions.urlContains(urlFractionVal))) {
			return driver.getCurrentUrl();

		} else {
			System.out.println("Expected URL is not visible");
			return null;
		}

	}

	public static String waitForURL(String urlValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
			return driver.getCurrentUrl();

		} else {
			System.out.println("Expected URL is not visible");
			return null;
		}

	}

	public static String waitForTitleContains(String titleFractionValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (wait.until(ExpectedConditions.titleContains(titleFractionValue))) {
			return driver.getTitle();

		} else {
			System.out.println("Expected title is not visible");
			return null;
		}

	}

	public static String waitForTitle(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (wait.until(ExpectedConditions.titleIs(titleValue))) {
			return driver.getTitle();

		} else {
			System.out.println("Expected title is not visible");
			return null;
		}

	}

}
