package testNGSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Automation\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
	}
}
