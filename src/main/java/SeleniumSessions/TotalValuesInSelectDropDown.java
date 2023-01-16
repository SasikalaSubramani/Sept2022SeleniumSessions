package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TotalValuesInSelectDropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();		
		 driver =brUtil.launchBrowser("chrome");		
		ElementUtil eleUtil = new ElementUtil(driver);		
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/#free-trial-info-menu");
		Thread.sleep(2000);
		
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		Select select = new Select(country);
//		List<WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size());
//		
//		for(WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.equals("Canada")) {
//				e.click();
//				break;
//			}
//		}
		
		By country = By.id("Form_getForm_Country");
		eleUtil.doSelectDropDownValue(country, "Canada");
		
	}

}
