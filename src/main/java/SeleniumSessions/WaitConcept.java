package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		//wait
		//1. static wait : Thread.sleep(5000) is from java Thread is class sleep is a method 
		
		//2.Dynamic wait
		
			//1.Implicitly wait: for all the elements in the page
			//2.Explicitly wait: for a specific element
				//1.WebDriver wait
				// 2.fluent wait

	}

}
