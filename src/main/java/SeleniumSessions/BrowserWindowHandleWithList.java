package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserWindowHandleWithList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		String parentWindowId = driver.getWindowHandle();
		
		WebElement LnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		LnkdEle.click();
		
		//1.Capture the window IDs
		Set<String> handles = driver.getWindowHandles();
		
		//convert set to list
		
		List<String> handleList =  new ArrayList<String>(handles);
		String PWID = handleList.get(0);
		String CWID = handleList.get(1);
		
		driver.switchTo().window(CWID);
		System.out.println("child window url" +driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(PWID);
		System.out.println("child window url" +driver.getCurrentUrl());
		driver.quit();
		
		
	}

}
