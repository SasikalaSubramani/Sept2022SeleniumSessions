package testNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailTest {

	WebDriver driver;

	@BeforeTest

	public void setup() {

//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
//		driver = new ChromeDriver();
		

		 System.setProperty("webdriver.gecko.driver","D:\\Automation\\driver\\geckodriver.exe");
//	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("user-data-dir=C:/Users/91978/AppData/Local/Google/Chrome/User Data/Default");
//	        options.addArguments("--start-maximized");
//	        WebDriver driver = new ChromeDriver(options);
		 	driver = new FirefoxDriver();
	        driver.get("https://mail.google.com");

	}

	@Test
	public void gmailLoginTest() {

		String usename = "sasikalasubramani96@gmail.com";
		String password = "Sasi@123";

		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(usename);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}

}
