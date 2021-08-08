package c04;
import java.util.*;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty Stack
        Stack<String> stack = new Stack<String>();
  
        // Using add() method to add elements into the Stack
        stack.add("Honningsvåg");
        stack.add("Jotunheimen");
        stack.add("Trondheim");
        stack.add("Sognefjord");
        stack.add("Nærøyfjord");
  
        // Output of the given Stack
        System.out.println(" Given Stack: " + stack);
  
        // Removing the element using remove()
        String rem_ele = stack.remove(4);
  
        // Printing the removed element
        System.out.println("Removed element: "
                           + rem_ele);
  
        // Printing the final Stack
        System.out.println("Final Stack after removal of " + rem_ele+ " is :"+ stack);
	}

}
