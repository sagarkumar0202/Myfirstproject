package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		long a, b, c;
		System.out.println("Enter the value of  a:");
		a = Long.parseLong(ob.readLine());

		System.out.println("Enter the value of  b:");
		b = Long.parseLong(ob.readLine());

		System.out.println("Enter the value of  c:");
		c = Long.parseLong(ob.readLine());

		System.out.println("sum=" + (a * b * c));

	}

}
