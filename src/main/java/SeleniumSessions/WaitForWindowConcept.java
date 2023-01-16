package SeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindowConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By linkedIn = By.xpath("//a[contains(@href,'linkedin')]");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(linkedIn)).click();

		
		if (wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
			System.out.println("There are 2 windows");
		}
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		String childWindowId = it.next();

		driver.switchTo().window(childWindowId);
		System.out.println("child window url" + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);

	}

}
