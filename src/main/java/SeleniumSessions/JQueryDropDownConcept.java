package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JQueryDropDownConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.launchBrowser("chrome");
		ElementUtil eleUtil = new ElementUtil(driver);
		driver.manage().window().maximize();

		brUtil.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);

		By dropdown = By.id("justAnInputBox");
		eleUtil.doClick(dropdown);

		By choices = By.xpath("//span[@class=\"comboTreeItemTitle\"]");

		// 1. single selection:
//		selectChoice(choices,"choice 1");

		// 2.multiple selection:
//		selectChoice(choices,"choice 1","choice 2","choice 3","choice 7");

		// 3.Select all
//		selectChoice(choices, "all");

		// 4.
//		selectChoice(choices,"choices 9");
		
		// 1. single selection:
//		selectCheckBox(choices, "single", "choice 1");

		// 2.multiple selection:
		selectCheckBox(choices,"Multiple", "choice 1","choice 2","choice 3","choice 7");

		// 3.Select all
//		selectCheckBox(choices, "all");

		// 4.
//		selectCheckBox(choices,"choices 9");

	}

	/**
	 * this method is handling single, multiple and all choice selection this method
	 * is handling if choice is not available pass the choices in case of multiple
	 * selection Please pass "all" in case of select all
	 * 
	 * @param locator
	 * @param choice
	 */
	public static void selectChoice(By locator, String... choice) {
		List<WebElement> choiceList = driver.findElements(locator);

		boolean flag = false;
		if (!(choice[0].equalsIgnoreCase("all"))) {
			for (WebElement e : choiceList) {
				String text = e.getText();
				for (int i = 0; i < choice.length; i++) {
					if (text.equals(choice[i])) {
						flag = true;
						e.click();
						break;
					}
				}
			}

		} else {
			// all selection
			try {
				for (WebElement e : choiceList) {
					e.click();
					flag = true;
				}
			} catch (Exception e) {
//				e.printStackTrace();

			}
		}
		if (flag == false) {
			System.out.println("Choice is not available..." + choice[0]);
		}
	}

	public static void selectCheckBox(By locator, String selectionType, String... choice) {
		List<WebElement> choiceList = driver.findElements(locator);
		String text;
		boolean flag = false;
		System.out.println(locator);
		System.out.println(selectionType);
		System.out.println(choice.length);
		switch (selectionType.toLowerCase()) {
		case "single":
			for (WebElement e : choiceList) {
				text = e.getText();
				if (text.equals(choice[0])) {
					e.click();
					flag = true;
				}
			}
		case "multiple":
			for (WebElement e : choiceList) {
				text = e.getText();
				for (int i = 0; i < choice.length; i++) {
					if (text.equals(choice[i])) {
						e.click();
						flag = true;
					}
				}
			}
//		case "all":
//			for (WebElement e : choiceList) {
//				System.out.println("Inside all");
//				e.click();
//				flag = true;
//			}

			break;

		default:
			System.out.println("Please pass the correct SelectionType");
			break;
			
		}
		if (flag == false) {
			System.out.println("Choice is not available..." + choice[0]);
		}
	}
}
