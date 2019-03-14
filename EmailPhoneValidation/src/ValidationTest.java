import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		Validation v1= new Validation();
		assertEquals("Valid",v1.verifyPhone("01725150891"));
		assertEquals("Not Valid",v1.verifyPhone("01325150891"));
		assertEquals("Valid",v1.verifyEmail("abdulkuddus@yoyo.com"));
		assertEquals("Not Valid",v1.verifyEmail("abdulkuddusyoyo.com"));
		
	}

}
