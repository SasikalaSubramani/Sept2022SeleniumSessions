package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MximiseBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		driver.manage().window().minimize();
		
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());

	}

}
