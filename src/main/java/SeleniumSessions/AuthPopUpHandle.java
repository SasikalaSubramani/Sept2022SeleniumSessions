package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AuthPopUpHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(4000);
		
		//pass the url and password in url itself
		//fromat - https://username:pwd@domainname
		
		//limitation -- username or pwd should not contain @
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

}
