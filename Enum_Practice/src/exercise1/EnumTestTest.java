package exercise1;
import exercise1.EnumTest;
import org.junit.Assert;

//import junit.framework.Assert;

import java.util.Scanner;

import org.junit.Test;

public class EnumTestTest {
	
	private Scanner input;

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		EnumTest m1 = new EnumTest(Month.JANUARY);
		
		 input= new Scanner(System.in);
		String ss;
		ss=input.nextLine();
		//String n=m1.getMonth();
		
		Assert.assertEquals ( m1.getMonth(),ss);
		//Assert.assertTrue(n==ss);
	}

}
