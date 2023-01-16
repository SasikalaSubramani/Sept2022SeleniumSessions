package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		JavascriptExecutor js = (JavascriptExecutor)driver;		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		System.out.println(jsUtil.getTitleByJS());

//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Order History")) {
//			System.out.println("PASS");
//		}
//		jsUtil.refreshBrowserByJS();

//		jsUtil.generateAlert("ogin page is displayed");

//		WebElement element =driver.findElement(By.id("input-email"));
//		jsUtil.drawBorder(element);
//		
//		jsUtil.flash(element);

		driver.get("https://www.amazon.com/");
//		jsUtil.scrollPageDown();
//		Thread.sleep(3000);
//		jsUtil.scrollPageUp();
//		Thread.sleep(3000);
//		jsUtil.scrollPageDown("1200");
		
//		WebElement element = driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));
//		jsUtil.scrollIntoView(element);
//		jsUtil.drawBorder(element);
		
		WebElement help = driver.findElement(By.linkText("Help"));
		jsUtil.clickElementByJS(help);
		

	}

}
