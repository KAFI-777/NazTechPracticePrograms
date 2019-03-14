import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		Calculator c2= new Calculator();
		int result=c2.add(10, 20);
		assertEquals(30,result);
	}

}
