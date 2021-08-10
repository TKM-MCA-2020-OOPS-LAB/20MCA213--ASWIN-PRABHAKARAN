package c04;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
        String str;
        PriorityQueue<String> pqu = new PriorityQueue<String>();
        System.out.println("Enter the no. of elements to be inserted in Queue :");
        Scanner X = new Scanner(System.in);
        no = X.nextInt();
        X.nextLine();
        System.out.println("Enter the data:");
        for(int i=0;i<no;i++)
        {
            str = X.nextLine();
            pqu.add(str);
        }
        Iterator it = pqu.iterator();
        System.out.println("\n Priority Queue :\n");
        while(it.hasNext())
            System.out.println(it.next()+" ");
	}

}
