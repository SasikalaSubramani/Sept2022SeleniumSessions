package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElement {
	
	//Browser
	//page---elements
	//iframe-- elements
	//shadow dom (open)---elament ----tea-- SendKeys
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://selectorshub.com/xpath-practice-page/");
			Thread.sleep(4000);
			
//			driver.findElement(By.id("tea")).sendKeys("masala tea");
			
			//
			
			driver.switchTo().frame("pact");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			WebElement tea =
					(WebElement)js.executeScript(" return document.querySelector(\"#snacktime\").shadowRoot.querySelector('#tea')");
			
			tea.sendKeys("Masala tea");

	}

}
