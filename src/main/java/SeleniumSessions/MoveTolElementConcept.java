package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveTolElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		selectSubMenu("div", "div", "Add-ons", "Student Discount");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doClick(By locator) {
		getElement(locator).click();

	}

	public static void selectSubMenu(String parentHtmlTag, String childHtmlTag, String parentMenu, String childMenu)
			throws InterruptedException {
		By parentMenuLocator = By.xpath("//" + parentHtmlTag + "[(text()='" + parentMenu + "')]");
		By childtMenuLocator = By.xpath("//" + childHtmlTag + "[(text()='" + childMenu + "')]");

		WebElement parentMenuElement = getElement(parentMenuLocator);

		Actions act = new Actions(driver);

		act.moveToElement(parentMenuElement).build().perform();
		getElement(parentMenuLocator).click();
		Thread.sleep(3000);

		getElement(childtMenuLocator).click();

	}

}
