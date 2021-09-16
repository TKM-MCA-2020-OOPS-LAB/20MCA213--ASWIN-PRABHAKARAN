package co6;
import java.io.*;
public class Q3 {
	public static void main(String args[]){ 
		try 
		{
			FileReader r= new FileReader("C:\\Users\\ASWIN\\Desktop\\mca\\OOPS LAB\\co6\\q3\\file1.txt");
			BufferedReader br= new BufferedReader(r);           
			FileWriter w= new FileWriter("C:\\Users\\ASWIN\\Desktop\\mca\\OOPS LAB\\co6\\q3\\file2.txt", true);
			String str;
			while ((str= br.readLine())!= null) 
			{ 
				w.write(str); 
				w.flush();
			}
			br.close();
			w.close();
            System.out.println("File copied to new file !!!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
