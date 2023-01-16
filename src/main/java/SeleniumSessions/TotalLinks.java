package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {
	
public static void main(String[] args) {
	//1. Total links
	//2.print all the text of each link
	//3. avaoid the blank text
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver =brUtil.launchBrowser("chrome");
		
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https:www.amazon.com");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links: " +linksList.size());
		
		int count =1;
		for (WebElement e:linksList) {
			String text = e.getText();
			if(!(text.length()==0)) {
				System.out.println(count + " = " + text);
				}
		count++;
		}
		
}


}
