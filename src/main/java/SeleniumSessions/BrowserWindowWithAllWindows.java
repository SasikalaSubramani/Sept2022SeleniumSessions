package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserWindowWithAllWindows {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement LnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbdEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		LnkdEle.click();
		fbdEle.click();
		twEle.click();
		ytEle.click();
		
		Set<String> handles = driver.getWindowHandles();		
		Iterator<String> it = handles.iterator();
		
		while (it.hasNext()) {
			String windowid = it.next();
			
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle());				
			Thread.sleep(1000);
			if(!windowid.equals(parentWindowId)) {
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url" +driver.getCurrentUrl());
		

	}

}
