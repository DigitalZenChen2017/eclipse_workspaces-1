import java.text.NumberFormat;
import java.util.Scanner;

public class Chapter3App {

	public static void main(String[] args) {
		
//		int a = 14;
//		int b = 8;
//		
//		int c = a/b;
//		int d = a%b;
//		
//		System.out.println("a / b = "+c);
//		System.out.println("a % b = "+d);
		
//		int a = 100;
//		a += 50;
//		System.out.println(a);
//		
//		a -= 20;
//		System.out.println(a);
//		
//		int i = 1;
//		System.out.println(i);
//		i = i + 1;
//		System.out.println(i);
//		i ++;
//		System.out.println(i);
//		i += 2;
//		System.out.println(i);
		
//		int a = 5;
//		double b = 6;
//		int c = a * (int)b;
//		System.out.println(c);
		
//		Integer a = new Integer(5);
//		Integer b = new Integer(7);
		
//		int a = 10;
//		int b = 20;
//		int c = Math.max(a, b);
//		int d = Math.min(a, b);
//		
//		System.out.println("max = "+c);
//		System.out.println("max = "+d);
//		
//		
//		Scanner sc = new Scanner(System.in);
//		String choice = "y";
//		while (choice.equalsIgnoreCase("y")) {
//			int r = (int)(100*Math.random()+1);
//			System.out.println("random #: "+r);
//			System.out.print("Continue? ");
//			choice = sc.next();
//		}
		
		double sales = 350000.33;
		double interestRate = .025;
		double distanceToParisYards = 7268800;
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		percentFormat.setMinimumFractionDigits(1);
		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		System.out.println(currencyFormat.format(sales));
		System.out.println(percentFormat.format(interestRate));
		System.out.println(numberFormat.format(distanceToParisYards));
	}
	

}
