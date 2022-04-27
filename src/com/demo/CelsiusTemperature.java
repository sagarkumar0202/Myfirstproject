package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CelsiusTemperature {

	public static void main(String[] args) throws NumberFormatException, IOException {

		double f, c;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader ob = new BufferedReader(in);

		System.out.println("Enter the Fahrenheitto temperature:");
		f = Double.parseDouble(ob.readLine());

		// f = (9 * c / 5) + 32;
		// c = (5 (f - 32)) * 9;
		c = (f - 32) * 5 / 9;

		System.out.println("CelsiusTemperature is" + c);

	}
}
