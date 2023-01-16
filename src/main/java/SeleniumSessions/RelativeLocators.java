package SeleniumSessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in./dashboard/canada");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.linkText("London, Canada"));
		//right ele
		String rightindex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();		
		System.out.println(rightindex);
		//left ele
		String leftrank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftrank);
		//below ele
		String below = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(below);
		//avove elem
		String above = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(above);
		
		// near of ele
		
		String nearEleText = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearEleText);
		
		
		//try this on selectorshub page 
		// assigment
		
		System.out.println("********************************************");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement ele1 = driver.findElement(By.xpath("//td[text()='John Smith']"));
		
		String right = driver.findElement(with(By.tagName("td")).toRightOf(ele1)).getText();
		System.out.println(right);
		String left = driver.findElement(with(By.tagName("td")).toLeftOf(ele1)).getText();
		System.out.println(left);
		String above1 = driver.findElement(with(By.tagName("td")).above(ele1)).getText();
		System.out.println(above1);
		String below1 = driver.findElement(with(By.tagName("td")).below(ele1)).getText();
		System.out.println(below1);
		String near = driver.findElement(with(By.tagName("td")).near(ele1)).getText();
		System.out.println(near);
		
	}

}
