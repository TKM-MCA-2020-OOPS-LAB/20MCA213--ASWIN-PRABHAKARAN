package c04;
import java.util.*;
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> nor_map = new HashMap<>();
	      nor_map.put("1","Tromsø");
	      nor_map.put("2","Trøndelag");
	      nor_map.put("3","Trondheim");
	      
	      //hash map
	      System.out.println("\nHashMap:"+nor_map);
	      Map<String, String> treeMap = new TreeMap<>();
	      treeMap.putAll(nor_map);
	      
	      //tree map
	      System.out.println("\nTreeMap:"+treeMap);
	}

}
