package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTableColumnText {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);
		
		System.out.println(getUserCompanyName("Romi singh"));
		System.out.println(getUserCompanyName("Ali khan"));
		
		
	}
	public static String getUserCompanyName(String userName) {
		return driver
		.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']"))
		.getText();	
		
	}
	
	//Assignment 
//	get phone, home phone, mobile, email

}
