package c04;
import java.util.*;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          l_list.add("Honningsvåg");
	          l_list.add("Jotunheimen");
	          l_list.add("Trondheim");
	          l_list.add("Sognefjord");
	          l_list.add("Nærøyfjord");
	      
	     // print the list
	   System.out.println("The Original linked list: " + l_list);

	  // Removing all the elements from the linked list
	    l_list.clear();
	 
	    System.out.println("The  linked list after removal of elements is: " + l_list);
	}

}
