package c04;
import java.util.Scanner;

class Usrnm_exe extends Exception {
	public Usrnm_exe(String string) {
		super(string);
	}
}

class Paswrd_exe extends Exception {
	public Paswrd_exe(String string) {
		super(string);
	}
}
public class Q3 {
	public static void main(String[] args) {
		String user, pass;
		Scanner A = new Scanner(System.in);
	    
	  
	  System.out.print("Enter username:");
	  user = A.nextLine();
	  
	  System.out.print("Enter password:");
	  pass = A.nextLine();
	  
	  int length = user.length();
	 
	  try {
		 if(length<8)
			 throw new Usrnm_exe("username mus!");
		 if(!pass.equals("aswin__001"))
	    	 throw new Paswrd_exe("Incorrect password\nEnter the correct password??");
	     else
	    	 System.out.println("LOGIN SUCCESFUL.....fetching results");
	      }
	  catch (Usrnm_exe U) {
		  U.printStackTrace();
	  }
	  catch (Paswrd_exe P) {
	      P.printStackTrace();
	  }
	  finally {
		  System.out.println("WAITING............ ");
		  
	    }
	  }
}