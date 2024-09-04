package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("The first of two numbers to be averaged?");
		double n1 = in.nextDouble();
		System.out.print("The second of two numbers to be averaged?");
		double n2 = in.nextDouble();
		
		System.out.println("The average is of " + n1 + " and " + n2 + " is "+ (n1 + n2) / 2 + ".");
		
		
	}

}
