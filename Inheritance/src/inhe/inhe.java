package inhe;

import java.util.Scanner;

import country.State;

public class inhe {
		 public static void main(String args[]) {
		        Scanner input= new Scanner(System.in);

		        System.out.print("Enter Continent: ");
		        String continent = input.nextLine();

		        System.out.print("Enter Country: ");
		        String country = input.nextLine();

		        System.out.print("Enter State: ");
		        String state = input.nextLine();

		        System.out.print("Enter Place: ");
		        String place = input.nextLine();

		        State s = new State(continent, country, state, place); 
		        s.displayDetails();
		        input.close();
		    
		}

}
