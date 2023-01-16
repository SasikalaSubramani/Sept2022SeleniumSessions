package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		
		 driver = new ChromeDriver();
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 
		 driver.close();
		

	}

}
