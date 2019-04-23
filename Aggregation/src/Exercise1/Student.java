package Exercise1;

public class Student {
	
	int id;
	String name;
	
	public boolean insertValue(int a, String b) {
		id = a;
		name = b;
		return true;
	}

   void print() {
		
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
	}
	

}
