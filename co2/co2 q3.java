package q3;

public class stroperations {
	
	public static void main(String[] args) {
		String st1="zack snyder";
		String st2=" justice league";
		System.out.println("string 1 is :"+ st1);
		System.out.println("string 2 is :"+ st2);
		String st=st1.concat(st2);
		System.out.println("string concatenation : " + st);
		System.out.println("length of string "+ st2 +" is " +st2.length());
		System.out.println("Character at position 5 of string 2 : " + st2.charAt(5));
		System.out.println("Index of character 'e'in string 2 : " + st2.indexOf('o'));
		System.out.println("Compare To 'zack snyder': " + st1.compareTo("zack snyder"));
		System.out.println("Contains sequence 'ing' in string 2 : " + st2.contains("ing"));
		System.out.println("EndsWith character 'A' in string 1 : " + st1.endsWith("A"));
		System.out.println("LowerCase of string 1 : " + st1.toLowerCase());
		System.out.println("UpperCase of string 2 : " + st2.toUpperCase());
		System.out.println("Replace 'zack snyder': " + st.replace("zack snyder", "whedon's"));

		

	}

}
