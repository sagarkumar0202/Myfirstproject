package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleIntrest {

	public static void main(String[] args) throws NumberFormatException, IOException {

		double p, r, t, i;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader ob = new BufferedReader(in);

		System.out.println("Enter the Princdipal Amount:");
		p = Double.parseDouble(ob.readLine());

		System.out.println("Enter the Rate of  Interest:");
		r = Double.parseDouble(ob.readLine());

		System.out.println("Enter the Time Amount0:");
		t = Double.parseDouble(ob.readLine());

		i = (p * t * r) / 100;

		System.out.println("Interest" + i);

	}

}
