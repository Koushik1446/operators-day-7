package com.codegnan.operatorsassignment;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your income: ");
		        double income = scanner.nextDouble();
		        double taxRate = (income < 300000) ? 0.05 :
		                         (income <= 1000000) ? 0.10 : 0.15;
		        double tax = income * taxRate;
		        tax += (income > 2000000) ? tax * 0.01 : 0;
		        System.out.println("Income: " + income);
		        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
		        System.out.println("Total Tax: " + tax);
		        scanner.close();
		    }
		}


	


