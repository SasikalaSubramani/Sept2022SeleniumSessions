package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllAlertTypes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//		BrowserUtil brUtil = new BrowserUtil();
//		driver = brUtil.launchBrowser("chrome");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		driver=new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement alertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement ocnfirmBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement promptBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		alertBtn.click();
		Alert al1 = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al1.getText());
		al1.accept();
		Thread.sleep(2000);
		
		ocnfirmBtn.click();
		Alert al2 = driver.switchTo().alert();
		Thread.sleep(2000);
		al2.dismiss();
		Thread.sleep(2000);
		
		ocnfirmBtn.click();
		al2 = driver.switchTo().alert();
		Thread.sleep(2000);
		al2.accept();
		Thread.sleep(2000);
		
		
		promptBtn.click();
		Alert al3 = driver.switchTo().alert();
		Thread.sleep(2000);
		al2.sendKeys("Hello Testing");
		al3.dismiss();
		Thread.sleep(2000);
		
		promptBtn.click();
		al3 = driver.switchTo().alert();
		Thread.sleep(2000);
		al3.sendKeys("Hello Testing");
		al3.accept();
		Thread.sleep(2000);
		
		
		
		
	}

}
