package com.Number;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = sc.nextInt();
		int r, s = 0, k = n;
		while (n > 0) {
			r = n % 10;
			s = s * 10 + r;
			n = n / 10;
		}
		if (s == k) {
			System.out.println(k + "is a palindrome number");
		} else {
			System.out.println(k + "is not a palindrome number");
		}
		sc.close();

	}

}