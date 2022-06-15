package com.github.testproject;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int first = sc.nextInt();
		System.out.print("Please enter second number: ");
		int second = sc.nextInt();
		System.out.println("Sum of "+first+" and "+second+" = "+(first+second));

	}

}
