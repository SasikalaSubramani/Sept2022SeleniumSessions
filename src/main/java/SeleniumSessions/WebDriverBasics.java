package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1. open browser
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");		
//		WebDriver driver = new ChromeDriver();
//		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver = new ChromeDriver(opt);
		
		//2. launch url:
		driver.get("https://www.google.com");
				
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
		
		String title = driver.getTitle();
		
		if (pagesource.contains("Copyright The Closure Library Authors")) {
			System.out.println("This info is present");
		}

		
		
		
		
	}

}