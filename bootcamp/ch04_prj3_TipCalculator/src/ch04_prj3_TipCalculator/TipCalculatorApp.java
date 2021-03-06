package ch04_prj3_TipCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator\n");
		
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        while (choice.equalsIgnoreCase("y")) {
        	
        	System.out.print("Cost of meal: ");
        	BigDecimal cost = sc.nextBigDecimal();
        	System.out.println("");
        	
        	for (double tp = .15; tp < .3; tp += .05) {
        		BigDecimal tipPercent = new BigDecimal(tp);
        		BigDecimal tipAmount = cost.multiply(tipPercent);
        			
        		System.out.println(percent.format(tipPercent) + "\n" +
        						   "Tip Amount:\t" + currency.format(tipAmount) + "\n" +
        						   "Total Amount:\t" + currency.format(cost.add(tipAmount)) + "\n");
        	}
        	System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        	
        }
        System.out.println("Goodbye!");
        sc.close();
	}

}
