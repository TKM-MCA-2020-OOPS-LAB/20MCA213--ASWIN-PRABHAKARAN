package c04;
import java.util.*;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //double brace initialization
        Map<String, String> country_map = new HashMap<String, String>();
        country_map.put("USA", "Washington");
        country_map.put("UK", "London");
        country_map.put("IND", "Delhi");
        country_map.put("GER", "Berlin");
        System.out.println("\nMap values:" + country_map);
        
        //Removing the 4th instance
        country_map.remove(4);
  
        // Map becomes
        System.out.println("\n\nAfter Removing 4th entry, Final Country Map  is:"+country_map);
	}

}
