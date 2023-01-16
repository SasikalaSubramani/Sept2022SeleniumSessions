package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelectTag {
		
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			BrowserUtil brUtil = new BrowserUtil();		
			 driver =brUtil.launchBrowser("chrome");		
			ElementUtil eleUtil = new ElementUtil(driver);		
			driver.manage().window().maximize();
			
			brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/#free-trial-info-menu");
			
			Thread.sleep(2000);
			
//			WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//			Select select = new Select(country);
//			
//			select.selectByIndex(5);			
//			select.selectByVisibleText("Bahrain");
//			select.selectByValue("Australia");
			
			By country = By.id("Form_getForm_Country");
			eleUtil.doSelectDropDownByIndex(country, 5);
			eleUtil.doSelectDropDownByVisibleText(country, "India");
			eleUtil.doSelectDropDownByValue(country, "Brazil");
	}
		
		
		
}
