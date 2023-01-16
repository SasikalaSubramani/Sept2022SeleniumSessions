package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazoTest {

	public static void main(String[] args) {
		
		String browserName= "Chrome";
		
		BrowserUtil brUtil= new BrowserUtil();
		
		WebDriver driver =brUtil.launchBrowser(browserName);		
		brUtil.launchUrl("http://www.amazon.com");
		String actTitle = brUtil.getPageTitle();
		System.out.println(actTitle);
		if (actTitle.contains("Amazon")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}

	}

}
