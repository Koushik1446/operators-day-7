package com.codegnan.operatorsassignment;

import java.util.Scanner;

public class DayGreeting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the  time in 0-23(24 hrs):");
		int time= scanner.nextInt();
		String greeting = (time >= 5 && time < 12) ? "Good Morning" :
            (time >= 12 && time < 17) ? "Good Afternoon" :
            (time >= 17 && time < 22) ? "Good Evening" :"Good Night";
		System.out.println(greeting);
		scanner.close();

	}

}
