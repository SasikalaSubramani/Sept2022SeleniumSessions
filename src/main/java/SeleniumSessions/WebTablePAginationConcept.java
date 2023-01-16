package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePAginationConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// multiple selection

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectorMultipleCountry("India");

			}
			// pagination concept
			WebElement next = driver.findElement(By.linkText("Next"));

			if (next.getAttribute("Class").contains("disabled")) {
				System.out.println("Pagenation is over.....");
				break;
			}
			next.click();
			Thread.sleep(1000);

		}

	

	// single selection
//		while (true) {
//			if(driver.findElements(By.xpath("//td[text()='Denmark']")).size()>0) {
//				selectorCountry ("Denmark");
//				break;
//			}
//				
//				else {
//					//pagination concept
//					WebElement next =driver.findElement(By.linkText("Next"));
//					
//					if (next.getAttribute("Class").contains("disabled")) {
//						System.out.println("PAgenation is over.....Country is not found");
//						break;
//					}
//					next.click();
//					Thread.sleep(1000);
//					
//				}
//				
//			}
	}

	public static void selectorCountry(String country) {
		driver.findElement(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static void selectorMultipleCountry(String country) throws InterruptedException {
		List<WebElement> checkBoxList = driver.findElements(
				By.xpath("(//td[text()='" + country + "'])/preceding-sibling::td/input[@type='checkbox']"));
		
		for (WebElement e : checkBoxList) {
			
			e.click();
		}
	}
	//

}
