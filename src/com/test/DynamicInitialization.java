package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicInitialization {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader ise = new InputStreamReader(System.in);

		BufferedReader ob = new BufferedReader(ise);

		// BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;
		String name;
		//long d;
		//double e;
		char f;

		System.out.println("Enter the character");
		f = (char) ob.read();
		System.out.println(f);

		System.out.println("Enter your name:");
		name = ob.readLine();
		System.out.println(name);

		System.out.println("Enter your name:");
		//d = Long.parseLong(ob.readLine());

		System.out.println("Enter the value of  a:");
		a = Integer.parseInt(ob.readLine());

		System.out.println("Enter the value of  b:");
		b = Integer.parseInt(ob.readLine());

		System.out.println("Enter the value of  c:");
		c = Integer.parseInt(ob.readLine());

		System.out.println("sum=" + (a + b + c));// concatenation operator

	}

}
