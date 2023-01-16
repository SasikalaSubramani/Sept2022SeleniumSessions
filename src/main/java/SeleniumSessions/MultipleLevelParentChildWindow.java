package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MultipleLevelParentChildWindow {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
	}
	public static void selectLevell4MenuItem (String htmlTag, String l1Menu, String l2Menu, String l3Menu,String l4Menu) throws InterruptedException {
		
		WebElement shopByCatL1 = driver.findElement(By.xpath("//a[@qa=\"categoryDD\"]"));
		
		Actions act = new Actions(driver);		
		act.moveToElement(shopByCatL1).build().perform();
		Thread.sleep(2000);
		
		WebElement BeveragesL2 = driver.findElement(By.xpath("(//a[text() = 'Beverages'])[2]"));
		act.moveToElement(BeveragesL2).build().perform();
		Thread.sleep(2000);
		
		WebElement teaL3 = driver.findElement(By.xpath("(//a[text() = 'Tea'])[2]"));
		act.moveToElement(teaL3).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text() = 'Green Tea'])[2]")).click();
	}

}
