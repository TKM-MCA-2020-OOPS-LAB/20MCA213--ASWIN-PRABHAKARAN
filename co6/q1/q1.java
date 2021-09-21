package co6;
import java.io.File;
import java.io.FilenameFilter;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\movies and series");


	    String[] fileList = file.list();

	    for(String str : fileList) {
	      System.out.println(str);
	    }
	    System.out.println("\nSEARCHING FOR FILENAMES STARTING WITH 'M':\n");
	    FilenameFilter filter = new FilenameFilter() {
	    public boolean accept(File dir, String fname) { return fname.startsWith("M");
	    }
	    };
	    String[] search = file.list(filter); if(search == null) {
	    System.out.println("File does not exist. . ");
	    }
	    else {
	    for(int i=0; i<search.length;i++) 
	    { 
	    	String fn = search[i]; System.out.println(fn);
	    }
	
	    }}}
