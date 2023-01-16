package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImages {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();		
		WebDriver driver =brUtil.launchBrowser("chrome");
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https:www.amazon.com");
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));		
		System.out.println("total images: " + imagesList.size());
		
		//print src alt height of each image
		
		for (WebElement e : imagesList) {
			String srcValue = e.getAttribute("src");
			String altValue = e.getAttribute("alt");
			String heightValue = e.getAttribute("height");
			
			System.out.println(srcValue + " || " + altValue +  " || " + heightValue);
			
		}

	}

}
