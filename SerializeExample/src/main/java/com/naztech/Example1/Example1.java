package com.naztech.Example1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7118733520390018636L;
	public String name;
	public static int integer;
	transient int a;
	

	public Example1(String name, int integer,int a) {
		this.name = name;
		this.integer = integer;
		this.a=a;
	}


	public static void main(String[] args) {
		Example1 e1 = new Example1("kafi",10000,210); 
        String filename = "C:\\Users\\abdullah.kafi\\Desktop\\file.txt"; 
          
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(e1); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized");
            e1.integer=500;
            
        } 
          
        catch(IOException ex) 
        { 
            System.out.println(ex); 
        } 
  
  
        Example1 e2 = null; 
  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            e2 = (Example1)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("Name = " + e2.name); 
            System.out.println("Integer = " + e2.integer); 
            System.out.println("Transient= "+e2.a);
        } 
          
        catch(IOException ex) 
        { 
            System.out.println(ex); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println(ex); 
        } 
  
    } 
		

	}


