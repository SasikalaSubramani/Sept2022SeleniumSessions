package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();		
		 driver =brUtil.launchBrowser("chrome");		
		ElementUtil eleUtil = new ElementUtil(driver);		
		driver.manage().window().maximize();

		brUtil.launchUrl("https:www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]/span"));
//		
//		System.out.println(suggList.size());
//		
//		for (WebElement e : suggList) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.equals("selenium testing")) {
//				e.click();
//				break;
//			}
			
//		}
		
		By suggList = By.xpath("//div[@class=\"wM6W7d\"]/span");
		eleUtil.doClickOnElement(suggList, "selenium testing");
		System.out.println(driver.getTitle());
		
	}

}
