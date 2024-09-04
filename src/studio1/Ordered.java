package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean ascending1 = (x > y);
		boolean ascending2 = (y > z);
		boolean ascending = (ascending1 && ascending2);
		
		boolean descending1 = (x < y);
		boolean descending2 = (y < z);
		boolean descending = (descending1 && descending2);
		
		System.out.println(ascending || descending);

	}

}
