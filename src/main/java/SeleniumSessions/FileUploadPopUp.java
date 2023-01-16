package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		
		//type should be file
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\91978\\OneDrive\\Desktop\\Test.png");
		
		
		
		

	}

}
