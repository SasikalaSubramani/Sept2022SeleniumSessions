package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://www.flipkart.com/account/?rd=0&link=home_account");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("macbook pro");
		By searchIcon = By.xpath("//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']");
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(searchIcon)).build().perform();
		
		
//		driver.findElement(searchIcon).click();
		
		

	}

}
