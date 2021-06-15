package c04;
import java.util.*;
class mul extends Thread{
	  public void run() {
		 int p=5;
			System.out.println("multiplication table of"+p+"is :"); 
		        for(int i=1; i <= 10; i++)
		        {
		            System.out.println(p+" * "+i+" = "+p*i);
		        }
	  }
		
	}
	class Prime extends Thread{
		public void run() {
		 int i, j,flag;
		 Scanner l = new Scanner(System.in);
		 System.out.println("***PRIME THREAD EXECUTION***");
		 System.out.println("Enter the limit :");
		 int N = l.nextInt();
		 
		    
		 System.out.println("Prime numbers between 1 and " + N + " are:");
		
		    for (i = 1; i <= N; i++)
		    {
		 
		        if (i == 1 || i == 0)
		            continue;
		 
		        flag = 1;
		 
		        for (j = 2; j <= i / 2; ++j)
		        {
		            if (i % j == 0)
		            {
		                flag = 0;
		                break;
		            }
		        }
		 
		        if (flag == 1)
		            System.out.print(i + "\n");
		    }
		}
	  }	


public class Q5 {

	public static void main(String[] args)  throws InterruptedException {
		mul m = new mul();
		m.start();
		m.sleep(500);
		
		Prime p = new Prime();
		p.start();
		p.sleep(500);
		

	}
  }

