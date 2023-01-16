package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class NewWindowConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());

	}

}
