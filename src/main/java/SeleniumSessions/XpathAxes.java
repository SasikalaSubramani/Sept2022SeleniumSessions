package SeleniumSessions;

public class XpathAxes {

	public static void main(String[] args) {
		
		
//		parent and child concept
		
//		//div[@class='private-form__input-wrapper']/input[@id='username']
		
		//Child keyword
		//div[@class='private-form__input-wrapper']/child::input[@id='username']
		
		//Child to parent
		//input[@id='username']/../../../../../../../../../..
//		//input[@id='username']/parent::div
		
		
//		Sibling
//		Preceding-sibling
//		one level up
//		//input[@id='input-email']/preceding-sibling::label
		
		
		//following sibling
//		//label[text()='E-Mail Address']//following-sibling::input
		
//		//div[text()='Get to Know Us']//following-sibling::ul//a
		
//		//a[text()='Joe.Root']/../preceding-sibling::td/input[@type='checkbox']

	}

}
