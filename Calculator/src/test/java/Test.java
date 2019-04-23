
import java.util.Scanner;

import Calculaor.Cal_culator;
import junit.framework.Assert;

public class Test {
	
 private Scanner input;

	@org.junit.Test
	public void testadd() {
		
		Cal_culator c1= new Cal_culator();
		 input=new Scanner(System.in);
		
		float firstValue;
		float secondValue;
		float exception ;
		
		System.out.println("Enter First value");
		firstValue=input.nextFloat();
		
		System.out.println("Enter Second value");
		secondValue=input.nextFloat();
		
		System.out.println("Enter Exception value");
		exception=input.nextFloat();
		
		float result=c1.add(firstValue, secondValue);	
		
		//Assert.assertEquals(exception, result);
		Assert.assertTrue(result==exception);
		
	}

}
