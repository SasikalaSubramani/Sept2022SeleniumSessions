package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserWindowPopUp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement LnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		LnkdEle.click();
		
		//child window open
		//switch driver to child window
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		
		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		//2nd : switch work
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window url" +driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url" +driver.getCurrentUrl());
		
		driver.quit();
		
		

	}

}
