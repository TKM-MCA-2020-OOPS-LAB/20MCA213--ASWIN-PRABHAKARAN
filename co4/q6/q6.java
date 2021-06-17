package c04;
import java.util.Scanner;

class fibon implements Runnable
{
	public void run()
        {
		int a=0,b=1,c,i,n=30;
		c=a+b;
		System.out.println("Fibonacci series up to "  +n+  "is:\n");
		System.out.print(a+" "+b+" ");
		for(i=3;i<=n;i++)
                {
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
                 }
		}
}

class even implements Runnable
{
	public void run()
	{
		int n;
		Scanner o=new Scanner(System.in);
		System.out.println("\nEnter the limit : ");
		n=o.nextInt();
		System.out.println("Even numbers are:");
		for(int i=1;i<=n;i++) 
		{
			if(i%2==0) 
			{
				System.out.print(" "+i);
			}
		}
	}
}


public class Thr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibon f=new fibon();
		Thread t1=new Thread(f);
		t1.start();
		
		
		even e=new even();
		Thread t2=new Thread(e);
		t2.start();
	}

}
