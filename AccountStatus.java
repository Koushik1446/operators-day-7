package com.codegnan.operatorsassignment;

import java.util.Scanner;

public class AccountStatus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the account balance:");
		Double balance = scanner.nextDouble();
		String accountStatus = (balance<500)?"Account Overdrawn":(balance<=999)?"Low Balance":"Good Standing";
		System.out.println(accountStatus);
		scanner.close();

	}

}
