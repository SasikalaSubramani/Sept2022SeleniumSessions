package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver launchBrowser (String browserName) {
		
		System.out.println("browser name is: " + browserName);
		
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
//			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\driver\\chromedriver.exe");		
			driver = new ChromeDriver();			
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\Automation\\driver\\geckodriver.exe");		
			driver = new FirefoxDriver();			
			break;
		case "safari":	
			driver = new SafariDriver();			
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "D:\\Automation\\driver\\chromedriver.exe");		
			driver = new ChromeDriver();			
			break;

		default:
			System.out.println("please pass the right browser name....." + browserName);
			break;
		}
		return driver;
	}
	
	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("url is null");
			throw new FrameworkException("URLISNULL");
		}
		if (url.length()==0) {
			System.out.println("url is BLANK");
			throw new FrameworkException("URLISBLANK OR URLISEMPTY");
		}
		if ((url.indexOf("http")!=0) && (url.indexOf("https")!=0)) {
			System.out.println("http(s) is missing in the URL");
			throw new FrameworkException("HTTP(S) is missing");
		}
		
		driver.get(url);
		
	}
	public void launchUrl(URL url) {
		String newurl = String.valueOf(url);
		if (newurl == null) {
			System.out.println("url is null");
			throw new FrameworkException("URLISNULL");
		}
		if (newurl.length()==0) {
			System.out.println("url is BLANK");
			throw new FrameworkException("URLISBLANK OR URLISEMPTY");
		}
		if ((newurl.indexOf("http")!=0) && (newurl.indexOf("https")!=0)) {
			System.out.println("http(s) is missing in the URL");
			throw new FrameworkException("HTTP(S) is missing");
		}
		
		driver.navigate().to(url);
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}

}
