import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class MAIN {

	public static void main(String[] args) {
		String str="123";
		int x = Integer.parseInt(str);
		int z = Integer.valueOf(str);
		float y = Float.parseFloat(str);
		//System.out.println(z);
		int a=0;
		
//		LocalDate obj=LocalDate.now();
//		System.out.println(obj);
		
//		Date date =new Date();
//		//System.out.println(date);
//		SimpleDateFormat ft = new SimpleDateFormat("dd-mm-yyyy");
//		System.out.println(ft.format(date));
//		
//		SimpleDateFormat ft1 = new SimpleDateFormat("hh:mm:ss");
//		System.out.println(ft1.format(date));
//		 
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
//		DateTimeFormatter tf =  DateTimeFormatter.ofPattern("hh:mm:ss"); 
//		System.out.println(tf.format(time));		
//		
		
		String str1[]=Student.std;
		System.out.println(str1[1].startsWith("K"));
		String str2=Student.std[1].trim();
		String str3=str2.toLowerCase();
		Boolean strcheck2=str3.startsWith("k");
		System.out.println(strcheck2);
		if(str1[0].isEmpty()) {
			System.out.println("Mamu");
		}else {
			System.out.println("Kailla Mamu");
		}
		
		for(String ss:Student.std) {
			System.out.println(ss);
			}
		int passCheck=str3.indexOf("d");
		System.out.println(passCheck);
		
		int len=str3.length();
		for(int i=0;i<len;i++) {
			System.out.println(str3.charAt(i));
		}
		
		String abc=str3.replace("kuddus", "oooooo");
		System.out.println(abc);
		int zz=10;
		String xyz= zz==20 ? "111111111111111111":"222222222222222";
		System.out.println(xyz);

	}
	


}
