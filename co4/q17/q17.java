package c04;
import java.util.*;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //double brace initialization
		Map<Integer,String> nor_map=new HashMap<>();

		nor_map.put(1, "Storsæterfossen");
		nor_map.put(2, "Ørnesvingen");
		nor_map.put(3, "Lysefjord");
	        System.out.println("\nInitial Map: "+ nor_map);
	        
	        nor_map.put( (2), "Flørlitrappene");
	        nor_map.put((4), "Jotunheimen");
	        //Updating elements
	        System.out.println("\nUpdated Map " + nor_map);
	  
	        //Removing elements
	        nor_map.remove(3);
	  
	        // Map becomes
	        System.out.println("\nAfter Removing 3rd entry, Final Map  is : "+nor_map);
	}

}
