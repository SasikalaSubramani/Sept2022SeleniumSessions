package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);

		//alert.sendKeys("12345");
		alert.accept();
//		alert.dismiss();

	}

}
