package TestNg;

import org.testng.annotations.Test;

public class Priority {

	
		
		@Test
		//@Test annotated method
		public void demo1() {
			System.out.println("Demo Test 1");
		}
		@Test (priority = 3)
		//@Test annotated method
		public void demo2() {
			System.out.println("Demo Test 2");
		}
		@Test (priority  = 4)
		public void ademo() {
			System.out.println("Demo Test a");
		}
		@Test (priority  = 2)
		public void Bdemo() {
			System.out.println("Demo Test B");
		}
		@Test (priority  = 1)
		public void bdemo() {
			System.out.println("Demo Test b");
		}
		@Test
		public void ademo1() {
			System.out.println("Demo Test _");
		}
	
		
		
		
		
		
		
		
		
		
	

}
