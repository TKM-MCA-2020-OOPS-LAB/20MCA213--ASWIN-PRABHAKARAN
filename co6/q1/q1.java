package co6;
import java.io.File;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\movies and series");


	    String[] fileList = file.list();

	    for(String str : fileList) {
	      System.out.println(str);
	    }
	}

}
