package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {

	    @Test (groups = "smoke")
	    public void login() {
		    System.out.println("logged in");
	    }
	    @Test (groups = "regression")
	    public void search() {
		    System.out.println("Product found");
        }
	    @Test (groups ="regression")
	    public void select() {
		    System.out.println("Product has been selected");
	    }
		@Test(groups ="regression")
		public void addToCart() {
			System.out.println("Product has been added");
		}
		@Test(groups ="regression")
		public void payment() {
			System.out.println("Payment made successfully");
		}
		@Test(groups = "smoke")
		public void logout() {
			System.out.println("logout successfully");
		}

}
