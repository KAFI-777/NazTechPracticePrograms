import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class FileClass {


	public static void main(String[] args) throws IOException {
		
		
		
		
		String path="C:\\Users\\abdullah.kafi\\Desktop";
		File mydir= new File(path+"\\Folder");
		mydir.mkdir();
		String path1=mydir.getAbsolutePath();
		System.out.println(path1);
		
		File textFile=new File(path1+"\\index1.txt");
		if(!textFile.exists()) {
			textFile.createNewFile();
			Formatter format=new Formatter(path1+"\\index1.txt");
			format.format("%s\r\n%d\r\n%s\r\n", "kodumia",10,"lau");
			format.close();

		}else {
			System.out.println("Already Exist");
		}
		
		
		

	}
	

		

	
}
