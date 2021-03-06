package ch03_prj1_TemperatureConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
        System.out.println();
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	System.out.print("Enter degrees in Fahrenheit: ");
        	BigDecimal fahrenheit = sc.nextBigDecimal();
        	BigDecimal celcius = new BigDecimal((fahrenheit.doubleValue() - 32) * 5/9);
        	System.out.println("Degrees in Celsius: " + celcius.setScale(2, RoundingMode.HALF_UP));
        	
        	System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Goodbye!");

	}

}
