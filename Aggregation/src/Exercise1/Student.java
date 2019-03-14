package Exercise1;

public class Student {
	
	int id;
	String name;
	
	void insertValue(int a, String b) {
		id = a;
		name = b;
	}

   void print() {
		
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
	}
	

}
