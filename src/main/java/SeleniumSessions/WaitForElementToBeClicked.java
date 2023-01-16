package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementToBeClicked {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		By forgotpwd = By.linkText("Forgot Password?");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//changing the interval time, default polling time is 500ms
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(1000));
		
		wait.until(ExpectedConditions.elementToBeClickable(forgotpwd)).click();
		

	}

}
