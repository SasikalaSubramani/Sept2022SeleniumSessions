package testNGSessions;

import org.testng.annotations.Test;

public class ExpectionExceptionsConcept {
	
	String name;
	// if we don't kw the exception class we can add Exception.class

	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class}, priority =1, description = "exception test")
	public void caculationTest() {
		System.out.println("caculation Test");
//		int a = 9/0;
		ExpectionExceptionsConcept obj = null;
		obj.name = "Tom";
	}

}
