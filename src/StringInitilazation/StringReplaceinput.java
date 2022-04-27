package StringInitilazation;

import java.util.Scanner;

public class StringReplaceinput 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter index");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		
		char arr[]=s.toCharArray();
		char ar1=sc.next().charAt(0);
		for(int i=0;i<arr.length;i++)
		{
			if(i==n) 
			{
				arr[i]=ar1;
			}
		}
		//String s1=Arrays.toString(arr);
		System.out.println(arr);
		sc.close();
	}

	}


