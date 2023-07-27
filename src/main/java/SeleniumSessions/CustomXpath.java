package SeleniumSessions;

public class CustomXpath {

	public static void main(String[] args) {
		
		//path or address of the of the element
		//xml path
		//2 types: custom/relative, absolute
		//absolute - starts from root node
		///html/body/div[2]/div/div/div/div[2]/div/h2
		
		//relative xpath
		//htmltag[@attribute = 'value']
		//htmltag[@attribute = 'value' and @attribute = 'value'  and @attribute = 'value']
		//htmltag[@attribute = 'value' or @attribute = 'value'}
		// we can use both and, or
		
		//text()
		// text is not an attribute it is function
		//htmltag[text()='value']
		//h2[text()='Customer']
		
		//text() and attribute
		//htmltag[text()='value' and @attr='value']
		//htmltag[ @attr='value' and text()='value']
		// we can add n number of attributes along with text function
		
		//contains:
		//htmltag[contains(@attribute,'value')]
		//input[contains(@id,'email')]
		//input[@id='input-email']
		
		//contains() with text()
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'New')]
		
		//2 Attributes 1 with contain() one with out contains		
		//htmltag[contains(text(),'value') and @att1='value' and @attr2='value']
		
		//starts-with()
		//htmaltag[starts-with(@att,@value)]
		//htmaltag[starts-with(@att,@value) and @att1=''value and @attr2='value']
		//htmaltag[starts-with(@att1,@value) and starts-with(@att1,@value)]
		
		//starts-with() and contains()
		//htmaltag[starts-with(@att1,@value) and contains(text(),'value')]
		
		//ends-with() is not available
		
		//indexing
		//(input[@class='form-control'])[2]
		
		//position() same as index
		//(input[@class='form-control'])[position()=6]
		
		//last() to get the last element
		//(input[@class='form-control'])[last()]
		//we can reverse the order
		//(input[@class='form-control'])[last()-1]
		//(input[@class='form-control'])[last()-2]
		
		//((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		
		//first() -  NA
		
		//htmltag[@attribute = 'value']
		//input[name='email'] - checks only input tag which has name as email
		//*[name='email'] - checks all the tags which has name as email		
				
		
		
	}

}
