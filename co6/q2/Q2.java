package co6;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Importing class to handle errors
import java.io.FileWriter;
import java.io.IOException;  // Importing IOException class to handle errors
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		      File myObj = new File("Main.docx");
		      if (myObj.createNewFile()) 
		      {
		        System.out.println("File created: " + myObj.getName());
		      } 
		      else
		      {
		        System.out.println("File already exists.");
		      }
		    }
		    catch (IOException e) 
		    {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    try 
		    {
		    FileWriter myWriter = new FileWriter("Main.docx");
		    myWriter.write("This is Java programming");
		    myWriter.close();
		    System.out.println("Nothing to display here,come back after some time Dumbo!!!!!");
		    }
		    catch (IOException e)
		    {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		    try {
		        File myObj = new File("Main.docx");
		        Scanner myReader = new Scanner(myObj);
		        while (myReader.hasNextLine()) 
		        {
		          String data = myReader.nextLine();
		          System.out.println(data);
		        }
		        myReader.close();
		      } 
		    catch (FileNotFoundException e) 
		    {
		        System.out.println("404,Error Not Found");
		        e.printStackTrace();
		}
	}

}
