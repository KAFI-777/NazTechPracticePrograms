package Exercise1;

public class Department {
	
	int deptId;
	String deptName;

	
	int size=0;
	
	private Student s[]= new Student[0];
	
	void insertValue(int a,String b ) {
		
		deptId = a;
		deptName=b;
	
		
	}
	
	void add(Student a) {
		
		if(size>=s.length-1) {
			Student temp[]=s.clone();
			s = new Student[s.length+1];
			System.arraycopy(temp, 0, s, 0, temp.length);
			//s[size]=a;
			//size++;
			//System.out.println("YOYO");
			
		}
		s[size]=a;
		size++;
		
	}
	
	void print() {
		
		System.out.println("Department Name: "+deptName);
        System.out.println("Department Id: "+deptId);
		
		for(int i=0; i<size;i++) {
			
			s[i].print();
		}
		
		
		
	}
	
	void search(int a) {
		
		for (int i=0;i<size;i++) {
			
			if(s[i].id==a) {
				
				s[i].print();
				break;
			}
			
			
			
		}
		
	}

}
