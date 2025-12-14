	
import java.util.*;
public class A4_1 {


	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("how many students name you want");
		int n=input.nextInt();
		input.nextLine();
		
		
		Hashtable<String,String> Contacts=new Hashtable<> ();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter name of" +(i+1)+ "Student");
			String name=input.nextLine();
			
			System.out.println("Enter number of" +(i+1)+ "Student");
			String number=input.nextLine();
			
			Contacts.put(name,number);
		}


	System.out.println(Contacts);
	}
	}
		

