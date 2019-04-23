
public class MAIN {

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.setName("Kafi");
		//System.out.println(p1.getName());
		
		Person p2 = new Person(101,"Elias",30,"Male","Banani,Dhaka");
		//System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getAge()+" "+p2.getGender()+" "+p2.getAddress());
		System.out.println(p2.toString());
		
		Human h1 = new Human(102, "Miraj", 20, "Male", "Mirpur,Dhaka", "abc", "def", "ijk");
		
		System.out.println(h1.toString());
		System.out.println("Student = "+h1.study());
		
		
	

	}

}
