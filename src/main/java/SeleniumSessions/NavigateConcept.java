package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcept {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().to(new URL ("https://www.google.com"));

	}

}
