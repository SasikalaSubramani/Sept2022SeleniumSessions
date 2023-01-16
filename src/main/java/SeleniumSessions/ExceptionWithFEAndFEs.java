package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExceptionWithFEAndFEs {
	
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();		
		 driver =brUtil.launchBrowser("chrome");		
		ElementUtil eleUtil = new ElementUtil(driver);		
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
		//NoSuchElementException
		
//		List <WebElement> linksList = driver.findElements(By.xpath("//div[@class=\"list-group11\"]/a"));
//		System.out.println(linksList.size());//0- returns empty list in case of wrong xpath
		
		List <WebElement> linksList = driver.findElements(By.xpath("//div[@@@class=\"list-group11\"]/a"));
		//InvalidSelectorException if there is any error in xpath syntax
		
		
		

	}

}
