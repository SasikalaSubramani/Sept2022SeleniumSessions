package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {


		BrowserUtil brUtil = new BrowserUtil();		
		WebDriver driver =brUtil.launchBrowser("chrome");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https:www.amazon.com");
		
		Thread.sleep(3000);		
//		String hrefValue = driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");		
//		System.out.println(hrefValue);
		
//		WebElement ele = driver.findElement(By.id("nav-logo-sprites"));
//		String hrefValue = ele.getAttribute("href");
//		String label = ele.getAttribute("aria-label");
		
		By logo = By.id("nav-logo-sprites");
		String hrefValue = eleUtil.doGetAttribute(logo, "href");
		String label = eleUtil.doGetAttribute(logo, "aria-label");
		
		System.out.println(hrefValue);
		System.out.println(label);

	}

}
