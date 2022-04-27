package com.demo;

import java.util.Scanner;

public class SannerTest {

	public static void main(String[] args) {

		Scanner ob = new Scanner(System.in);
		long a, b;
		float c, d;
		boolean e;
		String name = null;

		System.out.println("Enter the name:");
		name = ob.next();
		System.out.println(name);

		System.out.println("Please enter Boolean value");
		e = ob.nextBoolean();
		System.out.println(e);

		System.out.println("Enter the valu of  a:");
		a = ob.nextLong();

		System.out.println("Enter the valu of  b:");
		b = ob.nextLong();

		System.out.println("Addition=" + (a + b));

		System.out.println("Enter the valu of  c:");
		c = ob.nextFloat();

		System.out.println("Enter the valu of  d:");
		d = ob.nextFloat();

		System.out.println("Addition=" + (c + d));
		ob.close();

	}

}
