package com.codegnan.operatorsassignment;

import java.util.Scanner;

public class CategorizePerson {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the age of person:");
		int age = scanner.nextInt();
		String result = (age<12)?"Child":(age<=19)?"Teeneger":(age<=64)?"Adult":"Senior";
		System.out.println(result);
		scanner.close();

	}

}
