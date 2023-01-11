package BasicTestScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScriptTest extends BaseClass{

	
	@Test (priority = 1)
	public void verifyHomePage() {
		System.out.println("HomePage has Been verified.");
	}
	@Test (priority = 2)
	public void verifyCustomer() {
		System.out.println("Customer has been verified.");
	}
}
