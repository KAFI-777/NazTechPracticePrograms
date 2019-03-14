
public class Validation {
	
	public String verifyEmail(String email) {
		int count=0;
		if(email.length()>5) {
		for(int i=1;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				
				for(int j=i+1;j<email.length();j++) {
					if(email.charAt(j)=='.') {
						count=1;
					}
				}
				
			}
			
		}
		}
		if(count==1) {
			return "Valid";
		}else {
			return "Not Valid";
		}
		
	}
	
	public String verifyPhone(String phone) {
		if(phone.length()==11) {
			if(phone.startsWith("017")||phone.startsWith("018")||phone.startsWith("019")||phone.startsWith("016")||phone.startsWith("015")){
				return "Valid";
			}
		}
			return "Not Valid";
		
	}

}