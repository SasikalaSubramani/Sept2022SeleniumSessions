package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTableCheckBoxConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/../preceding-sibling::td/input[@type='checkbox']")).click();
		selectUserCheckBox("Joe.Root");

	}
	
	public static void selectUserCheckBox(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/../preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
