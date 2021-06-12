package c04;
import java.util.*;
class neg_ex extends Exception
{
	neg_ex()
	{
		super("!!!!!!WARNING!!!!!!! \nNegative numbers are not allowed \n");
	}
}
public class Q4 {

	public static void main(String[] args) {
		
		int i,n,r,s=0;
		double avrg;
		System.out.println("Enter the limit:");
		Scanner l=new Scanner(System.in);
		n=l.nextInt();
		
		for(i=1;i<=n;i++)
		{
			try
			{
				System.out.println("Enter the number:");
				r=l.nextInt();
				
				if(r<0)
				{
					i--;
					throw new neg_ex();
				}
				else
				{
					s=s+r;
				}
				
			}
			catch(neg_ex e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Average="+(s/n));
	}

}
