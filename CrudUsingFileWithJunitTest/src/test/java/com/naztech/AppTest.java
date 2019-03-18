/**
 * 
 */
package com.naztech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author abdullah.kafi
 *
 */
class AppTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		App.createFile();

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Test Completed");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testadd() {
		App a1=new App("101","kodumiaaa","30","50000");
		assertEquals(true,a1.add());
		
	}
	@Test
	void testremove() {
		App a2=new App("102","nurapagla","45","100000");
		App a3=new App("103","abulmama","35","70000");
		a2.add();
		a3.add();
		assertEquals(true,a2.removeFromFile());
	}
	@Test
	void testupdate() {
		App a4=new App("104","goromkashem","50","80000");
		a4.add();
		assertEquals(true,a4.update("401", "thandakashem", "50", "8000"));
		
	}
	@Test
	void testsearch() {
		assertEquals(true,App.search("103"));
	}

}
