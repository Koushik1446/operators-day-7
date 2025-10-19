package com.codegnan.operatorsassignment;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the total amount:");
		Double amount = scanner.nextDouble();
		Double discountAmount = (amount<500)?amount:(amount<=999)?amount*0.9:amount*0.8;
		System.out.println(discountAmount);
		scanner.close();

	}

}
