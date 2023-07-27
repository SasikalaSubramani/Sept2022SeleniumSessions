package testNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailTest {

	WebDriver driver;

	@BeforeTest

	public void setup() {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		driver = new ChromeDriver(opt);
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");		
//		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https:www.gmail.com");
		driver.manage().window().maximize();

	}

	@Test
	public void gmailLoginTest() {
		
		String usename = "sasikalasubramani96@gmail.com";
		String password = "Sasi@123";
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(usename);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]//span[contains(text(),'Next')]")).click();

	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}

}
