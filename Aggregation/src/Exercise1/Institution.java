package Exercise1;

public class Institution {
	
	int institutionId;
	String institutionName;

	int size=0;
	private Department d[]= new Department[0];
	
	void insertValue(int a, String b) {
		
		institutionId = a;
		institutionName=b;
	}
	void add(Department a) {
		
		if(size>=d.length-1) {
			Department temp[]=d.clone();
			d = new Department[d.length+1];
			System.arraycopy(temp, 0, d, 0, temp.length);
			//d[size]=a;
			//size++;
			
		}
		d[size]=a;
		size++;
		
	}
	void print() {
		
		System.out.println("Institution Name: "+institutionName);
		System.out.println("Institution ID: "+institutionId);
		
		for(int i=0;i<size;i++) {
			
			d[i].print();
		}
		
		
		
	}
	
	void nsearch(int a) {
		
		for(int i=0; i<size;i++) {
			
			d[i].search(a);
		}
	}
	

}
