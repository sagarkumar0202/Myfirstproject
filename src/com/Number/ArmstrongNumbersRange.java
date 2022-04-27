package com.Number;

import java.util.Scanner;

public class ArmstrongNumbersRange {

	public static void main(String[] args)
	{
					Scanner in=new Scanner(System.in);
					System.out.println("Enter lower limit:");
					int l=in.nextInt();
					System.out.println("Enter upper limit:");
					int u=in.nextInt();
					
					int r,s,n;
					
					while(l<=u) // 1 to 100
					{
					n=l;
					s=0;
					while(n>0)
					{
						r=n%10; //r contains the rightmost or last digit
						s=s+(r*r*r);
						n=n/10;
					}
					
					if(s==l)
					{
						System.out.println(l + ",");
					}
					
						l=l+1;
					}
					in.close();
				}
			
		}
