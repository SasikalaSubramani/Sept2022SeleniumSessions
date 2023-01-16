package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pseudoElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String man_text =
		js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')")
		.toString();
		
		System.out.println(man_text);
		
		if (man_text.contains("*")) {
			System.out.println("this is mandatory field");
		}
		
	}

}
