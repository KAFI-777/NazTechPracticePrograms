
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.Department;
import Exercise1.Institution;
import Exercise1.Student;

class AggTest {

	@Test
	void test() {
		  Student s1=new Student();  
		  Student s2=new Student();
		  Student s3=new Student();
		  Student s4=new Student();
		  Student s5=new Student();
		  Department d1 = new Department();
		  Department d2 = new Department();
		  Department d3 = new Department();
		  Department d4 = new Department();
		  Institution i1= new Institution();
		  Institution i2= new Institution();
		  
		  assertEquals(true,s1.insertValue(101,"Abdullah"));
		  assertEquals(true,s2.insertValue(102,"Kafi"));
		  assertEquals(true,s3.insertValue(103,"Rohim"));
		  assertEquals(true,s4.insertValue(104,"Karim"));
		  assertEquals(true,s5.insertValue(201, "Mofiz"));
		  
		  assertEquals (true,d1.insertValue(60,"CSE"));
		  assertEquals(true,d2.insertValue(70,"BBA"));
		  assertEquals(true,d3.insertValue(80,"ECONOMICS"));
		  assertEquals(true,d4.insertValue(00,"TOTO COMPANY"));
		  assertEquals(true,d1.add(s1));
		  assertEquals(true,d1.add(s2));
		  assertEquals(true,d2.add(s3));
		  assertEquals(true,d3.add(s4));
		  assertEquals(true,d4.add(s5));
		  
		  assertTrue(i1.add(d1));
		  assertTrue(i1.add(d2));
		  assertTrue(i1.add(d3));
		  assertTrue(i2.add(d4));
		  
		  assertEquals(null,i1.nsearch(502));
		  assertEquals(true,i1.nsearch(102).equals(s2));
		  assertEquals(true,i1.nsearch(101).equals(s1));
		  assertEquals(true,d2.search(103).equals(s3));
		  assertEquals(true,d3.search(104).equals(s4));
		  assertEquals(true,i2.nsearch(201).equals(s5));
		  //assertEquals()
		  
		  
	}

}
