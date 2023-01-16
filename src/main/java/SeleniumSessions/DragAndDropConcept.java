package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();		
		driver = brUtil.launchBrowser("chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		
		
		
		

	}

}
