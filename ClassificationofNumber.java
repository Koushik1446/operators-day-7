package com.codegnan.operatorsassignment;

import java.util.Scanner;

public class ClassificationofNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number :");
		int number = scanner.nextInt();
		String  result = (number>0)?"Positive":(number<0)?"Negative":"Zero";
		System.out.println(result);
		scanner.close();

	}

}
