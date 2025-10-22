package com.codegnan.operatorsassignment;

import java.util.Scanner;

public class TemperatureClassification {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Temperature(celsius) :");
		Double temperature = scanner.nextDouble();
		String result = (temperature>30)?"Hot":(temperature>=15)?"Moderate":"Cold";
		System.out.println(result);
		scanner.close();
	}

}
