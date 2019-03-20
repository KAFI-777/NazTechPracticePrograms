package exercise1;

enum Month{
	
	JANUARY, FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER
	,NOVEMBER,DECEMBER
}

public class EnumTest {
	
	Month month;
	
	EnumTest(Month month){
		this.month=month;
	}
	
	public String getMonth() {
		
		//System.out.println(this.month);
		
		switch(month) {
			
		case JANUARY:
			//System.out.println("1st");
			String s="1st";
			return s;
			//break;
		
		case FEBRUARY:
			System.out.println("2nd");
			break;
		
		case MARCH:
			System.out.println("3rd");
			break;
		
		case APRIL:
			System.out.println("4th");
			break;
		
		case MAY:
			System.out.println("5th");
			break;
		
		case JUNE:
			System.out.println("6th");
			break;
		
		case JULY:
			System.out.println("7th");
			break;
		
		case AUGUST:
			System.out.println("8th");
			break;
		
		case SEPTEMBER:
			System.out.println("9th");
			break;
		
		case OCTOBER:
			System.out.println("10th");
			break;
		
		case NOVEMBER:
			System.out.println("11th");
			break;
		
		case DECEMBER:
			System.out.println("12th");
			break;
			
			default :
				String a = "N00000";
				return a;
		
		}
		//String ss="1st";
		//return ss;
		return null;
		
	}

}
