package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserWindowOnebyOne {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			BrowserUtil brUtil = new BrowserUtil();
			driver = brUtil.launchBrowser("chrome");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
//			String parentWindowId = driver.getWindowHandle();
			
			WebElement LnkdEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
			LnkdEle.click();
			
			Set<String> handles = driver.getWindowHandles();		
			Iterator<String> it = handles.iterator();
			
			String parentWindowId = it.next();			
			String childWindowId = it.next();
			
			driver.switchTo().window(childWindowId);
			System.out.println("child window url" +driver.getCurrentUrl());
			driver.close();			
			driver.switchTo().window(parentWindowId);
			
			WebElement fbdEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
			fbdEle.click();
			
			Set<String> handles2 = driver.getWindowHandles();		
			Iterator<String> it2 = handles2.iterator();
			
			parentWindowId = it2.next();			
			childWindowId = it2.next();
			
			driver.switchTo().window(childWindowId);
			System.out.println("child window url" +driver.getCurrentUrl());
			driver.close();			
			driver.switchTo().window(parentWindowId);
			
			WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
			twEle.click();
			
			Set<String> handles3 = driver.getWindowHandles();		
			Iterator<String> it3 = handles3.iterator();
			
			parentWindowId = it3.next();			
			childWindowId = it3.next();
			
			driver.switchTo().window(childWindowId);
			System.out.println("child window url" +driver.getCurrentUrl());
			driver.close();			
			driver.switchTo().window(parentWindowId);
			
			
			WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
			ytEle.click();
			
			Set<String> handles4 = driver.getWindowHandles();		
			Iterator<String> it4 = handles4.iterator();
			
			parentWindowId = it4.next();			
			childWindowId = it4.next();
			
			driver.switchTo().window(childWindowId);
			System.out.println("child window url" +driver.getCurrentUrl());
			driver.close();			
			driver.switchTo().window(parentWindowId);
			
			

	}

}
