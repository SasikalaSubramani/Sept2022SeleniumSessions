package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args)  {
		BrowserUtil brUtil = new BrowserUtil();		
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		WebElement rightCLickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightCLickEle).build().perform();
		
		List<WebElement> menuItems = driver.
		findElements(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]/li[contains(@class,'context-menu-icon')]/span"));
		
		for (WebElement e: menuItems) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("Copy")) {
				e.click();
				break;
				
			}
		}
		
		

	}

}
