package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsElementDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();		
		driver = brUtil.launchBrowser("chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		driver.get("https://naveenautomationlabs.com/opencart/");
		Thread.sleep(3000);
		
//		boolean flag = driver.findElement(By.name("search")).isDisplayed();
//		
//		if (flag) {
//			System.out.println("ele is dispalyed");
//		}
//		else {
//			System.out.println("ele is not displayed");
//		}
		
		By search = By.name("search");
		By logo = By.xpath("//img[@title=\"naveenopencart\"]");
		
//		if(eleUtil.doIsDisplayed(search)) {System.out.println("PASS");}		
//		if(eleUtil.doIsDisplayed(logo)) {System.out.println("PASS");}	
		
//		int count = driver.findElements(search).size();
//		if(count==1) {
//			System.out.println("ele is displayed");
//		}
		
		if(eleUtil.isSingleElementExist(search)) {System.out.println("PASS");}		
		if(eleUtil.isSingleElementExist(logo)) {System.out.println("PASS");}
		if(eleUtil.isMultipleElementExist(logo,1)) {System.out.println("element displayed 1 time");}

	
	}
}
