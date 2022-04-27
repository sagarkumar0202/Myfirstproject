package com.Number;

import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter lower limit:");
		int n=in.nextInt();
		int r,fact,s=0,k=n;
		if(n>9)
		{
		while(n>0)
		{
			r=n%10;
			fact=1;
			while(r>0)
			{
				fact=fact*r;
				r=r-1;
			}
			s=s+fact;
			n=n/10;
		}
		if(s==k)
		{
			System.out.println(k+" I a peteron Number");
		}
		else
		{
			System.out.println(k+" I  not a peteron Number");
		}
		in.close();
	}
		else
		{
			System.out.println("The Number should be greater then 9");
		}
	}
	

}
