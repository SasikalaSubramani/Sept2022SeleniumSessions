package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitVsClose {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");
//				/			
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver = new ChromeDriver(opt);

		// launch url
		driver.get("https://www.google.com");

		// get current title
		String title = driver.getTitle();
		System.out.println("Title is : " + title);

//		driver.quit();// close the browser

		driver.close();// close the browser

//		System.out.println(driver.getTitle());

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
	}

}
