package TestNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(priority =1)
	public void login() {
		System.out.println("logged in");
	}
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Product found");
}
	@Test(dependsOnMethods = "search")
	public void select() {
		Assert.fail();
		System.out.println("Product has been selected");
	}

		@Test(dependsOnMethods = "select")
		public void addToCart() {
			System.out.println("Product has been added");
		}
		@Test(dependsOnMethods = "addToCart")
		public void payment() {
			System.out.println("Payment made successfully");
		}
		@Test(dependsOnMethods = "payment")
		public void logout() {
			System.out.println("logout successfully");
		
		}
		
		
}

		