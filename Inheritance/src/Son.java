
public class Son extends Parent {
	
	String language="English";
	
	@Override
	public void details() {
		name="Jon";
		skinColor="White";
		height="6";

		System.out.println("The Details: \n"+name+"\n"+skinColor+"\n"+height+"\n"+language);
		
		
		
	}

}
