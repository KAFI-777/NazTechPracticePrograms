package Exercise1;

public class Department {
	
	int deptId;
	String deptName;

	
	int size=0;
	
	private Student s[]= new Student[0];
	
	public boolean insertValue(int a,String b ) {
		
		deptId = a;
		deptName=b;
		return true;
		
	}
	
	public boolean add(Student a) {
		
		if(size>=s.length-1) {
			Student temp[]=s.clone();
			s = new Student[s.length+1];
			System.arraycopy(temp, 0, s, 0, temp.length);
			
		}
		s[size]=a;
		size++;
		return true;
		
	}
	
	public void print() {
		
		System.out.println("Department Name: "+deptName);
        System.out.println("Department Id: "+deptId);
		
		for(int i=0; i<size;i++) {
			
			s[i].print();
		}
			
	}
	
	public Student search(int a) {
		
		for (int i=0;i<size;i++) {
			
			if(s[i].id==a) {
				
				return s[i];	
			}	
		}
		return null;
		
	}

}
