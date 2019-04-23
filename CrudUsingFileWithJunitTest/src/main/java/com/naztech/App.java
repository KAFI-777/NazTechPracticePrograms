package com.naztech;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Formatter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class App {
	
	private String id,name,age,salary;
	private static String path;
	private static String path1;
	private static String path2;
	
public static void createFile() throws IOException {
	path="C:\\Users\\abdullah.kafi\\Desktop";
	File mydir= new File(path+"\\Folder");
	mydir.mkdir();
	path1=mydir.getAbsolutePath();
	File textFile=new File(path1+"\\index1.txt");
	textFile.createNewFile();
	path2=textFile.getAbsolutePath();
}
	
    /**
	 * @param id
	 * @param name
	 * @param age
	 * @param salary
	 */
	public App(String id, String name, String age, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getSalary() {
		return salary;
	}



	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public boolean add() {
		String check=this.getId()+"\t"+this.getName()+"\t"+this.getAge()+"\t"+this.getSalary();
		 try { 
           BufferedWriter out = new BufferedWriter(new FileWriter(path2,true)); 
           out.write(check+"\r\n"); 
           out.close(); 
       } 
       catch (IOException e) { 
           System.out.println("Exception Occurred" + e); 
       }
		 //check add method
		 try {
			 BufferedReader br = new BufferedReader(new FileReader(path2));
			 String line;
			 while((line=br.readLine())!=null) {
				if(line.trim().equals(check)) {
					br.close();
					//System.out.println("YOYO");
					return true;
				}
			 }
			 br.close();
			 
		 }
		 catch(IOException e){
			 System.out.println(e);
			 
		 }
		// System.out.println("HAHAHA");
		return false;	 
	}
	

	
	   public boolean removeFromFile( ) {
		   String lineToRemove=this.getId()+"\t"+this.getName()+"\t"+this.getAge()+"\t"+this.getSalary();

		    try {

		      File inFile = new File(path2);

		      if (!inFile.isFile()) {
		        System.out.println("Parameter is not an existing file");
		        
		      }

		      //Construct the new file that will later be renamed to the original filename.
		      File tempFile = new File(/*inFile.getAbsolutePath()*/path2 + "temp.txt");

		      BufferedReader br = new BufferedReader(new FileReader(inFile));
		      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

		      String line;

		      //Read from the original file and write to the new
		      //unless content matches data to be removed.
		      while ((line = br.readLine()) != null) {
		    	 // System.out.println(line);

		        if (!line.trim().equals(lineToRemove)) {

		          pw.println(line);
		          pw.flush();
		        }
		      }
		      pw.close();
		      br.close();

		      //Delete the original file
		      if (!inFile.delete()) {
		        System.out.println("Could not delete file");
		       
		      }

		      //Rename the new file to the filename the original file had.
		      if (!tempFile.renameTo(inFile))
		        System.out.println("Could not rename file");

		    }
		    catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
		    
		    //check the remove method
			 try {
				 BufferedReader br = new BufferedReader(new FileReader(path2));
				 String line;
				 while((line=br.readLine())!=null) {
					if(line==this.getId()+"\t"+this.getName()+"\t"+this.getAge()+"\t"+this.getSalary()) {
						br.close();
						return false;
					}
				 }
				 br.close();
				 
			 }
			 catch(IOException e){
				 System.out.println(e);
				 
			 }
		    
		    return true;
		    
		  }
	   
	   public boolean update(String id,String name,String age,String salary) {
		   String lineToRemove=this.getId()+"\t"+this.getName()+"\t"+this.getAge()+"\t"+this.getSalary();
		   String lineToUpdate=id+"\t"+name+"\t"+age+"\t"+salary;

		    try {

		      File inFile = new File(path2);

		      if (!inFile.isFile()) {
		        System.out.println("Parameter is not an existing file");
		        
		      }

		      //Construct the new file that will later be renamed to the original filename.
		      File tempFile = new File(/*inFile.getAbsolutePath()*/path2 + ".tmp");

		      BufferedReader br = new BufferedReader(new FileReader(inFile));
		      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

		      String line;

		      //Read from the original file and write to the new
		      //unless content matches data to be removed.
		      while ((line = br.readLine()) != null) {
		    	 // System.out.println(line);

		        if (!line.trim().equals(lineToRemove)) {

		          pw.println(line);
		          pw.flush();
		        }
		        if(line.trim().equals(lineToRemove)) {
		        	pw.println(lineToUpdate);
		        	pw.flush();
		        }
		      }
		      pw.close();
		      br.close();

		      //Delete the original file
		      if (!inFile.delete()) {
		        System.out.println("Could not delete file");
		        
		      }

		      //Rename the new file to the filename the original file had.
		      if (!tempFile.renameTo(inFile))
		        System.out.println("Could not rename file");

		    }
		    catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
		    
		    //check update method
		    try {
				 BufferedReader br = new BufferedReader(new FileReader(path2));
				 String line;
				 while((line=br.readLine())!=null) {
					if(line.trim().equals(lineToUpdate)) {
						br.close();
						return true;
					}
				 }
				 br.close();
				 
			 }
			 catch(IOException e){
				 System.out.println(e);
				 
			 }
		    
		   return false;
	   }
	   
	   public static boolean search(String a) {
		   try {
				 BufferedReader br = new BufferedReader(new FileReader(path2));
				 String line;
				 String split[];
			 
				 while((line=br.readLine())!=null) {
					 split=line.split("\t");
					 for(int i=0;i<split.length;i++) {
			
						 if(split[i].startsWith(a)) {
							 System.out.println(line);
							 br.close();
							 return true;
						 }
					 }
					 
				 }
				 br.close();
				 
			 }
			 catch(IOException e){
				 System.out.println(e);
				 
			 }
		   return false;
		   
	   }
	   



	@Override
	public String toString() {
		return "App [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

//	public static void main( String[] args )throws IOException{
//		App.createFile();
//		App a1=new App("101","kodumiaaa","30","50000");
//		App a2=new App("102","nurapagla","45","100000");
//		App a3=new App("103","abulmama","35","70000");
//		App a4=new App("104","goromkashem","50","80000");
//		App a5=new App("105","sanathjoysuria","43","10000");
//		a1.add();
//		a2.add();
//		a3.add();
//		a4.add();
//		a5.add();
//		a1.removeFromFile();
//		//a2.removeLineFromFile();
//		a4.update("401", "thandakashem", "50", "8000");
//		//System.out.println(a1.toString());
//		App.search("103");
//
//		
//		
//		
//    }
}
