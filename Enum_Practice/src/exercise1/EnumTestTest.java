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
		
		EnumTest m1 = new EnumTest(Month.JANUARY);
		
		 input= new Scanner(System.in);
		String ss;
		ss=input.nextLine();
		Assert.assertEquals (ss, m1.getMonth());
	}

}
