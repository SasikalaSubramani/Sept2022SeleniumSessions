package testNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
//	AAA rule 
	//test cases should be independent
	// it should not maintain any order
	//can be executed in any order
//	Example
	//CRUD
	// create a new user , assert ---T1
	// create a new user , get the same user , assert ---T1
	//create a new user , get the same user ,update the same user with phone, assert ---T1
	//create a new user , get the same user , delete the same user, assert ---T1
	
	//Assert: only one assertion should be there in a test case
	//we can avoid giving priority as well for the test cases
	
	
	@Test
	public void searchTest() {
		System.out.println("search test");
		int a = 9/3;
	}
	
	@Test(dependsOnMethods = "searchTest" )
	public void addToCardTest() {
		System.out.println("addToCart test");
	}
	
	@Test(dependsOnMethods = "addToCardTest" )
	public void paymentTest() {
		System.out.println("payment test");
	}

}
