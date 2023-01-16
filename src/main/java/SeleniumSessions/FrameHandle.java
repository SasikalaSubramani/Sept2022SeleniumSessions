package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		driver.switchTo().frame(2);
//		driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String header = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame(); //when we have frame inside a frame 
		
		
		
		

	}

}
