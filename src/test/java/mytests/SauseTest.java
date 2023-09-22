package mytests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauseTest {

	private static WebDriver driver;

	// Login Page
	private By userName = By.xpath("//*[@id='user-name']");
	private By passWord = By.xpath("//*[@id='password']");
	private By loginBtn = By.xpath("//*[@id='login-button']");

	// Product Page
	private By productPageHeader = By.xpath("//div[@class='header_secondary_container']/span");
	private By productCount = By.xpath("//div[@class=\'inventory_item\']");
//	private By sortoption = By.xpath("//select[@data-test='product_sort_container']");
	private By filterOptions= By.xpath("//select[@data-test='product_sort_container']");

	private By maxPriceProduct = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
	
	private By cart = By.linkText("shopping_cart_link");
	private By cartQty = By.xpath("//div[@class='cart_quantity']");

	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void loginTest() {
		SauseTest.getElement(driver, userName).sendKeys("standard_user");
		SauseTest.getElement(driver, passWord).sendKeys("secret_sauce");
		SauseTest.getElement(driver, loginBtn).click();

		// validation
		String productPageTitle = SauseTest.getText(driver, productPageHeader);
		Assert.assertEquals(productPageTitle, "Products");

	}

	@Test
	public void productCountTest() {

		List<WebElement> productList = SauseTest.getElements(driver, productCount);
		int productCount = productList.size();

		// validation
		Assert.assertEquals(productCount, 6);

	}

	@Test
	public void addProductToCartTest() throws InterruptedException {

//		SauseTest.doSelectDropDownByValue(filterOptions, "hilo");
//		SauseTest.clickElementByJS(getElement(driver,maxPriceProduct));
		
		
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
//		driver.findElement(By.xpath("//select[@data-test='product_sort_container']")).click();
//		Select select = new Select(driver.findElement(By.xpath("//select[@data-test='product_sort_container']")));
//		select.selectByValue("hilo");
		
		
		
		
		//cart verification
		SauseTest.doClick(cart);
		String cartQTY = SauseTest.getText(driver, cartQty);
		Assert.assertEquals(productCount, "1");

	}

	// Element Utils
	public static WebElement getElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(driver, locator).click();

	}

	public static String getText(WebDriver driver, By locator) {
		return getElement(driver, locator).getText();
	}

	public static List<WebElement> getElements(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(driver, locator));
		select.selectByValue(value);
	}
	public static void clickElementByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

}
