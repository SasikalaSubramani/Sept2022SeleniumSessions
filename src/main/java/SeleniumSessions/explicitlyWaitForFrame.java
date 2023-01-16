package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlyWaitForFrame {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));

		// frameToBeAvailableAndSwitchToIt method : returns the driver after switching to the frame..
//		so that we can directly work on the frame elements 
//		 no need of switch to frame	
		
//		waitForFramePresenceAndSwitch(2,5);
		
		waitForFramePresenceAndSwitch(2,5);
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();

	}
	
	public static void waitForFramePresenceAndSwitch(int frameIndex, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	public static void waitForFramePresenceAndSwitch(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	public static void waitForFramePresenceAndSwitch(WebElement frameElemeent, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElemeent));
	}
	public static void waitForFramePresenceAndSwitch(String nameOrID, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrID));
	}

}
