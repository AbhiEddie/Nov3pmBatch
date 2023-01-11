package TestNg;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test (invocationCount = 5)
	public void demoTest() {
		System.out.println("Test");
	}
	@Test (invocationCount = 5)
	public void demoTest1() {
		System.out.println("Test1");

}
}
