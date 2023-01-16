package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLanguageList {
	
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();		
		 driver =brUtil.launchBrowser("chrome");		
		ElementUtil eleUtil = new ElementUtil(driver);		
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https:www.google.co.in");
		
		By langLocator = By.xpath("//div[@id=\"SIvCob\"]/a");
		
		eleUtil.doClickOnElement(langLocator, "ਪੰਜਾਬੀ");
		
			
		}


}
