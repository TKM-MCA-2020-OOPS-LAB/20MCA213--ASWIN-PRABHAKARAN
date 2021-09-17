package co6;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Q4 {
	 public static void main(String[] args) throws IOException 
	    {
	        FileInputStream source = new FileInputStream ("C:\\Users\\ASWIN\\eclipse-workspace\\project\\src\\co6\\main.txt");
	        FileOutputStream odd = new FileOutputStream ("C:\\Users\\ASWIN\\eclipse-workspace\\project\\src\\co6\\odd.txt");
	        FileOutputStream even = new FileOutputStream ("C:\\Users\\ASWIN\\eclipse-workspace\\project\\src\\co6\\even.txt");
	        int i;
	        while((i = source.read()) != -1){
	            if(i%2==0) 
	            {

	                even.write(i);
	            }
	            else 
	            {
	                odd.write(i);
	            }
	        }
	        System.out.println("THE GIVEN NUMBERS ARE ARRANGED IN RESPECTIVE FILES  !!!");
	        source.close();
	        even.close();
	        odd.close();



	    }

}
