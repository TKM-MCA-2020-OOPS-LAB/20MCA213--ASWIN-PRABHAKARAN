package employee;
import java.util.Scanner;
public class emp_details {
	int Empid;
	String Name,Address;
	double Salary;
	Scanner emp=new Scanner(System.in);

	public emp_details() 
	{
		System.out.println("Enter Employee id: ");
		Empid=emp.nextInt();
		System.out.println("Enter Name: ");
		Name=emp.next();
		System.out.println("Enter Salary: ");
		Salary=emp.nextDouble();
		System.out.println("Enter Address: ");
		Address=emp.next();
	}
}

	 class Teacher extends emp_details
	{
		String department,subject;
		Scanner tea=new Scanner(System.in);
		
		public Teacher()
		{
			System.out.println("Enter department: ");
			department=tea.next();
			System.out.println("Enter Subject: ");
			subject=tea.next();
		}
		
		public void display()
		{
			System.out.println("Employee Details");
			System.out.println("Employee id: "+Empid);
			System.out.println("Name: "+Name);
			System.out.println("Salary: "+Salary);
			System.out.println("Address: "+Address);
			System.out.println("Department: "+department);
			System.out.println("Subject: "+subject);
		}
	


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter number of employees: ");
		int ne=sc.nextInt();
		Teacher e[]=new Teacher[ne];
		for(i=0;i<ne;i++) 
		{
			e[i]=new Teacher();	
	   }
		
		for(i=0;i<ne;i++) 
		{
			e[i].display();
		}
		
		

	}
}
