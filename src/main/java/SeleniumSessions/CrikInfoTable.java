package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrikInfoTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://www.espncricinfo.com/series/india-in-new-zealand-2022-23-1322272/new-zealand-vs-india-3rd-odi-1322280/full-scorecard");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println(getWicketTakerName("Shreyas Iyer"));
		
	}
	
	public static String getWicketTakerName (String playerName) {
		return driver.findElement(By.xpath("(//span[contains(text(),'"+playerName+"')]//ancestor::td//following-sibling::td)[1]")).getText();
	}

}
