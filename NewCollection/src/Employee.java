import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	public void removeF() {
		
	}
	
	public static void main(String[] args) {
		 String employeeId;
		 String employeeName;
		 String department;
		 String basicSalary;
		 String data[]= {"1","Elias","200","CSE"/*employeeId,employeeName,department,basicSalary*/};
		 
		 
		
//		ArrayList list1= new ArrayList();
//		ArrayList list2= new ArrayList();
//		list1.add("Sakib");
//		list1.add("20");
//		for(String a:data) {
//			list1.add(a);
//		}
//		//list.clear( );
//		list2.add("Kodu");
//		list2.add(10+20);
//		//list1.addAll(list2);
//		System.out.println(list1.size());
//		list1.addAll(list1.size(),list2);
////		System.out.println("Name: "+list1.get(2));
////		System.out.println("Age: "+list1.get(3));
//		System.out.println(list2);
//		System.out.println(list1);
//		System.out.println(list1.size());
////		List<String>list3=new ArrayList<String>();
////		list3.add("Piranha");
////		list3.add("20");
////		for(String x:list3)
////			System.out.println(x);
////		String y[]= {"E","10"};
////		for(String k:y)
////			list3.add(k);
		LinkedList<String> list4=new LinkedList<String>();
		list4.add("Salmon");
		list4.add("10");
		list4.add("Sea");
		//System.out.println(list4);
//		for(String j:list4)
//			System.out.println(j);
//		list4.addFirst("Upore");
//		list4.addLast("Niche");
//		for(String j:list4)
//			System.out.println(j);
//		list4.subList(0,1).clear();
//		System.out.println(list4);
		//String bkash[]= {"1","2","3","4"};
		String A[]=list4.toArray(new String [list4.size()]);
//		for(String a:A)
//			System.out.println(a);
		LinkedList<String> list5=new LinkedList<String>();
		list5=(LinkedList<String>) list4.subList(0,1);
		System.out.println(list5);
		
		
		
		}


}
