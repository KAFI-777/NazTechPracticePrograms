
public class MAIN {
	
	public static void main(String [] args) {
		
		Calculator c1= new Calculator();
		int result=c1.add(10,20);
		System.out.println(result);
		int result1=c1.add(10,20,30);
		System.out.println(result1);
		double result2=c1.add(10,10);
		System.out.println(result2);
	}

}
