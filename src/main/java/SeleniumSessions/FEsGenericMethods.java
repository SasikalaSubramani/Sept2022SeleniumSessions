package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FEsGenericMethods {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.manage().window().maximize();

		brUtil.launchUrl("https://www.freshworks.com/");
		By footerLinks = By.xpath("//div[contains(@class,'footer-left-section')]//a");
		
		int actFooterCount = totalElemetsCount (footerLinks);
		System.out.println(actFooterCount);
		if (actFooterCount == 21) {
			System.out.println("footer count -----PASS");
		}
		
		List<String> footerlinks = getElementsTextList(footerLinks);
		System.out.println(footerlinks);
		
		if(footerlinks.contains("Investors")) {System.out.println("PASS");	}
		if(footerlinks.contains("Customers")) {System.out.println("PASS");	}
		if(footerlinks.contains("Affiliates")) {System.out.println("PASS");	}
		
		
		//Verify all the footer links ----Assignemnet #Terms of service and 
		
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int totalElemetsCount(By locator) {
		return getElementsTextList(locator).size();
	}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

}
