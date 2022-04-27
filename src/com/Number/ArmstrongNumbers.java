package com.Number;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = sc.nextInt();
		int r, s = 0, k = n;
		while (n > 0) 
		{
			r = n % 10; //r contains right most digit
			s = s+(r*r*r);
			n = n / 10;
		}
		if (s == k) 
		{
			System.out.println(k + "is an ArmstrongNumbers");
		} else {
			System.out.println(k + "is not an ArmstrongNumbers");
		}
		sc.close();

	}

}