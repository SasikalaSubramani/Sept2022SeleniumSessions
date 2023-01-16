package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(4000);
		
		By.xpath("//inpu[@class='form-control private-form__control login-email']");//valid
		By.className("form-control private-form__control login-email");//invalid bcz of the space
		By.className("login-email");//valid as we have either of them
		By.cssSelector(".form-control.private-form__control.login-email"); //valid
				
		By.className(".form-control login-email");//invalid
		By.className("private-form__control");//valid

	}

}
