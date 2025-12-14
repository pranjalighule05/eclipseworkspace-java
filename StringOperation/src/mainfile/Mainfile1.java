package mainfile;

import string.*;
import java.util.Scanner;


public class Mainfile1 {
	public static void main(String arg[]) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first string");
	String s1=input.nextLine();
	
	System.out.println("Enter second string");
	String s2=input.nextLine();
	
	Con c1=new Con();
	Comp c2=new Comp();
	
	System.out.println("****String Operation****");
	System.out.println("String Concatenation");
	c1.concatenate(s1,s2);
	System.out.println("String Comparison");
	c2.compare(s1,s2);
	
	input.close();
	}
	
}
