package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeoutConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://classic.freecrm.com/pricing.html");

	}

}
