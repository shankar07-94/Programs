package ngpractice;

import org.testng.annotations.Test;

public class Example4 {

	@Test
		 public void testcase4() {
		displayDetails();
			  System.out.println("Hello,I am TC1 from example4 class");
		  }
	@Test
	 public void testcase5() {
		  System.out.println("Hello,I am TC1 from example5 class");
		  displayDetails();  
	}

	void displayDetails() {
		System.out.println("I am display method of example6 class");
	}
	
}
