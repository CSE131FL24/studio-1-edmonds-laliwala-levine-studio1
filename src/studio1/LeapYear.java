package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = in.nextInt();
		
		boolean four = (0 == year % 4);
		boolean hundred = !(0 == year % 100);
		boolean fourHundred = (0 == year % 400);
		boolean leap = ((hundred && four) || fourHundred);
		
		System.out.println( year + " is a leap year? " + leap);
	}

}
