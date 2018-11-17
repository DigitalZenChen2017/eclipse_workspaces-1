package ch04_prj4_CommonDivisorCalculator;

import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Denominator Finder\n");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter first number: ");
			int num1 = sc.nextInt();

			System.out.print("Enter second number: ");
			int num2 = sc.nextInt();
			
			int cd = getCommonDivisor(num1, num2);
			
			System.out.println("Greatest Common Divisor: "+cd+"\n");
			System.out.print("Continue? ");
			choice = sc.next();
		}
	}

	private static int getCommonDivisor(int x, int y) {
		int commonDivisor = 0;
		if (y < x) {
			int z = y;
			y = x;
			x = z;
		}
		while (y >= x) {
			y -= x;
		}
		
		

		return commonDivisor;
	}
}