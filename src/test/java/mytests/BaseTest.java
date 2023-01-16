package mytests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	@Parameters({"url", "browser", "headless"})
	@BeforeTest
	public void setup(String url, String browserName, String headLess) {

		System.out.println("Launching browser : " + browserName);
		ChromeOptions co = new ChromeOptions();		
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			co.setHeadless(Boolean.parseBoolean(headLess));
			driver = new ChromeDriver();
			break;
		case "firefox":
//			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser...." + browserName);
			break;
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(url);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
