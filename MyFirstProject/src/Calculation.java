
public class Calculation {
	
	public int x;
	public double y;
	public double z;
	
	public Calculation(int i , double j){
		
		this.x=i;
		this.y=j;
	}
	
	public  void add() {
		 //x=i;  y=j;
		 z=x+y;
		//String a="Kafi";
		
		System.out.println(z+" ");
		//System.out.print(a);
	}
	public void sub() {
		// x=i;  y=j;
		 z=x-y;
		//String a="Kafi";
		
		System.out.println(z+" ");
		//System.out.print(a);
	}
	
	public void mul() {
		//x=i;  y=j;
		 z=x*y;
		//String a="Kafi";
		
		System.out.println(z+" ");
		//System.out.print(a);
	}
	
	public void div() {
		//x=i;  y=j;
		 z=x/y;
		//String a="Kafi";
		
		System.out.println(z+" ");
		//System.out.print(a);
	}
}
