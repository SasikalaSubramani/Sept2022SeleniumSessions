package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver =brUtil.launchBrowser("chrome");
		
		driver.manage().window().maximize();
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		1.ID: Unique attribute
		
//		2.Name: It can be duplicate
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
//		By emailID = By.name("email");
//		eleUtil.doSendKeys(emailID, "test@gmail.com");
//		
//		3.Class name: It can be duplicate
//		driver.findElement(By.className("form-control")).sendKeys("naveen");
		
//		4.xpath : xpath is not an attribute, address of the element in html dom ...will be traversing from the top
//		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		
//		By emailID = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		eleUtil.doSendKeys(emailID, "test@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");
//		eleUtil.doClick(loginBtn);
//		
		//5. css: not an attribute
		
//		By emailID = By.cssSelector("#input-email");
//		By password = By.cssSelector("#input-password");
//		By loginBtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//		
//		eleUtil.doSendKeys(emailID, "test@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");
//		eleUtil.doClick(loginBtn);
		
		//6.linkText : only for links.. and can be duplicate
		
//		driver.findElement(By.linkText("Register")).click();
		
//		By registerLink = By.linkText("Register");
//		eleUtil.doClick(registerLink);
//		
		//7. partialLinkText: 
		
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8.tagName : HTML tag: can be duplicate
//		
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		By header = By.tagName("h2");
		String headertext = eleUtil.doGetElementText(header);
		System.out.println(headertext);

		
	
	}

}
