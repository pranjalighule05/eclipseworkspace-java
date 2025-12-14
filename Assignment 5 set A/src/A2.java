import java.util.*;
public class A2 {

public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter number of your Friends");
	int n=input.nextInt();
	input.nextLine();
	
	LinkedList<String> Friends=new LinkedList<String>();
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter name of" +(i+1)+ "friend");
		String name=input.nextLine();
		Friends.add(name);
	}


System.out.println("\nFriends List: " + Friends );
}
}
	