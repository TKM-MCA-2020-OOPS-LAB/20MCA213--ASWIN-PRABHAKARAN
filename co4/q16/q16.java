package c04;
import java.util.*;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a empty hash set
        HashSet<String> hset1 = new HashSet<String>();
     // use add() method to add values in the hash set
          hset1.add("Red");
          hset1.add("Green");
          hset1.add("Black");
          hset1.add("White");
          System.out.println("First HashSet content: "+hset1);
          HashSet<String>hset2 = new HashSet<String>();
          hset2.add("Red");
          hset2.add("Pink");
          hset2.add("Black");
          hset2.add("Orange");
          System.out.println("Second HashSet content: "+hset2);
          hset1.retainAll(hset2);
         
 	        
 	      //retaining common elements in hash set
          System.out.println("Common elements in Hashset:");
          System.out.println(hset1);
          
	}

}
