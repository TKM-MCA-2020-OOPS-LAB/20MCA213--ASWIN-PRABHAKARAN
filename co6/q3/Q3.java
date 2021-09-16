package co6;
import java.io.*;
public class Q3 {
	public static void main(String args[])throws IOException { 
        FileInputStream fr =new FileInputStream("file1.txt"); 
        FileOutputStream fw=new FileOutputStream("file2.txt") ; 
        System.out.println("Task completed!"); 
        int c; 
        while((c=fr.read())!=-1) 
        fw.write((char)c); 
        fr.close(); 
        fw.close(); 
	}
}
