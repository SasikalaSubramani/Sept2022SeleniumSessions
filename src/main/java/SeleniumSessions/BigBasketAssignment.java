package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BigBasketAssignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		WebElement mainCat = driver.findElement(By.xpath("//a[@qa=\"categoryDD\"]"));		
		Actions act = new Actions(driver);		
		act.moveToElement(mainCat).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> Level1List = driver.
				findElements(By.xpath("//*[@id=\'navBarMegaNav\']//a"));
		
		for (WebElement e1: Level1List) {			
			act.moveToElement(e1).build().perform();
			Thread.sleep(1000);
			System.out.println(e1.getText());
			
			List<WebElement> Level2List = driver.
					findElements(By.xpath("(//ul[contains(@class,'nav-pills ')])[2]//a"));
			for (WebElement e2: Level2List) {				
				act.moveToElement(e2).build().perform();
				Thread.sleep(2000);
				System.out.println(" " +e2.getText());
				
				List<WebElement> Level3List = driver.
						findElements(By.xpath("(//ul[contains(@class,'list-unstyled')])[last()-1]//a"));
				
				for (WebElement e3: Level3List) {				
					act.moveToElement(e3).build().perform();
					Thread.sleep(1000);
					System.out.println("  " +e3.getText());
					
				}
			}	
		}
		
	}

}
