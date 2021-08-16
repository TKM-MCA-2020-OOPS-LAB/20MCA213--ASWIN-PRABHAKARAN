package c04;
import java.util.*;
import java.util.ArrayDeque;  
import java.util.Deque;  
  
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<String>();   
		 // Inserts the elements 
	    Scanner B=new Scanner(System.in);
		System.out.println("Enter the elements you want to insert:");
		int n=B.nextInt();
		System.out.println("Enter the elements : ");
		for(int i =0;i<n;i++)
		{
			String obj=B.next();
			deque.add(obj);
	 
		}
	   
	    // Popping the element  
	    deque.pop();  
	    System.out.println("After popping : ");  
	    for (String string : deque) {  
	        System.out.println(string);  
	    }  
	    deque.remove("qwerty");  
	    System.out.println("Queue becomes"+deque);  
	}

}
