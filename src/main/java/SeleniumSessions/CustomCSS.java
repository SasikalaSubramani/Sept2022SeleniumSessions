package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSS {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//CSS:cascaded style sheet
		
		//id
//		#id
//		#input-email
		
		//id with tag
//		input#input-email
		
		//Class
//		.class
//		.form-control
		
		//class and id
//		#id.class
//		#input-email.form-control
//		.class#id
//		.form-control#input-emailn  
//		input.form-control#input-email
		
		
		//contains denoted by *
		//htmltag[attr*=value]
//		input[id*=email]
		
		//starts-with denoted by ^
//		input[id^=input]
		//ends-with denoted  by $
//		input[id$=email]
		
//		input[id^=input][placeholder^=E-Mail]
		
//		input[id^=input][placeholder^=E-Mail][name='email']
		
		//text? - no support
		//disadvantage of css
		
		//parent child concept 
//		select#Form_getForm_Country>option --direct child element >
//		select#Form_getForm_Country option -> direct and indirect (space)
		
//		/form#hs-login div --- 20
//		form#hs-login div --- 8
		
		//child to parent: not supported
		//backward traversing is not supported
		
		//Sibling concept
		// preceding is not supported
		
		//following-sibling is denoted by +
//		label[for="input-email"]+input
		
		//comma in css:
		
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login");
		By mand_eles= By.cssSelector("input#username,input#password,button#loginBtn,input#remember");
		int count= driver.findElements(mand_eles).size();
		System.out.println(count);
		
		//indexing in css:		
//		div.row ul.footer-nav li:nth-of-type(2)
		
		//not in css
//		div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside) -- total disabled dates
//		div.DayPicker-Day--selected - current date
//		div.DayPicker-Day:not(.DayPicker-Day--outside)-- dates from both the months
//		div.DayPicker-Day:not(.DayPicker-Day--outside):not(DayPicker-Day--disabled)-- only enabled dates from both the months
		
//		xpath vs css
		
		//syntax: css
		//text : xpath
		//contains/starts-with/endswith : both
		//contains +text+attr : xpath
		//backward traversing: xpath
		//siblings: xpath
		//dynamic: both
		//comma: css
		//indexing : xpath
		//performace: both
//		it depend on the xpath which we have created (custom xpath is faster)..both are better in terms of performance
		//svg elements: css doesn't support, we shd use only special xpaths
		
		
		
		
		

	}

}
