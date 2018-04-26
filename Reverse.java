import java.io.*;
import java.util.*;



public class reverse {
	
	public static void backwards (String name) {
		
		String input = name;
		
		StringBuilder input1 = new StringBuilder();
		
		input1.append(input);
		
		input1 = input1.reverse();
		
		System.out.println(input1);;
		
		
	}
	
	public static void wrong(String name) {
		
		String input = name;
		
		StringBuilder str = new StringBuilder(name);
		
		str.setCharAt(0, 'X');
		str.toString();
		
		System.out.println("Your new name is " + str);
	}
	
	/*'static' means that a member variable or method can be accessed without requiring 
	 * an instantiation of the class to which it belongs.
	 */
	public static void append(String name) {
		
		String a = name;
		StringBuffer t = new StringBuffer();
		a = t.append(a).append("'s").toString();
		
		System.out.println("If you owned a pencil, people would say 'that's " + a + " pencil.'");
		
		
		
		
		
	}
	

}
