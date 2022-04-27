package com.demo;

public class OperaterTest {

	public static void main(String[] args) {
		int a = 23, b = 43, c = 32;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(b % a);

		if (b > a && b > c) {
			System.out.println("Hi am sagar");
		} else {
			System.out.println("Hi am sagar some things is worng");
		}

		if (b > a || b > c) {
			System.out.println("Hi am sagar");
		} else {
			System.out.println("Hi am sagar some things is worng");
		}
		System.out.println(a > b && b > c);
		System.out.println(a > b || b > c);
		System.out.println(a > b == b > c);
		System.out.println(a == b);

		a = a + 5;
		System.out.println(a);
		a += 5;
		System.out.println(a);
		a = a / 2;
		System.out.println(a);
		a /= 2;
		System.out.println(a);

		System.out.println(a);
	}

}
