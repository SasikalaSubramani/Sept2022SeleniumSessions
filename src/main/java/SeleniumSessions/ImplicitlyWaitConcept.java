package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		//It is a Dynamic wait
		
		//applicable only for web elements
		//it will be applied for all the web elements by default once it is declared		
//		not applicable for non web elements: alerts , title, urls
		//global wait
		
//		selenium 3.x methods : not available in 4 version
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20,, TimeUnit.SECONDS); 
		
//		seleinium4:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		WebElement e1 = driver.findElement(By.linkText("MacBook"));
		System.out.println(e1.getAttribute("href"));
		
		//e2
		//e3
		//e4
		
		//login page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//e5
		//e6
		
		//home page
		// even if we go back to home page
		//the latest wait will be applied that is 20 secs
		
		//if req we can override
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//register page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//product page 0 sces
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		

	}

}
