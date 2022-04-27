package com.Number;

import java.util.Scanner;

public class EvenOard 
{

	public static void main(String[] args) 
	{
				Scanner in=new Scanner(System.in);
				System.out.println("Enter Lower limit:");
				int l=in.nextInt();
				
				System.out.println("Enter upper limit:");
				int u=in.nextInt();
				
				
				for(int i=l;i<=u;i++)
				{
					if(i%2!=0)
					{
						System.out.print(i+" " );
					}
				}
				in.close();
	}
}
	

