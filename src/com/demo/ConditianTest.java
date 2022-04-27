package com.demo;

import java.util.Scanner;

public class ConditianTest {

	public static void main(String[] args) {

		int a, b, c;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter avalue of  a:");
		a = ob.nextInt();

		System.out.println("Enter avalue of  b:");
		b = ob.nextInt();

		System.out.println("Enter avalue of  c:");
		c = ob.nextInt();

		if (a > b && a > c) {
			System.out.println(a + "is greater number");
		} else if (b > a && b > c) {
			System.out.println(b + "is greater number");
		} else {
			System.out.println(c + "is greater2 number");
			ob.close();
		}

	}

}
