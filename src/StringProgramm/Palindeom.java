package StringProgramm;

import java.util.Scanner;

public class Palindeom
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String st = sc.nextLine();
		
		String st1 = "";
		
		for (int i=st.length()-1;i>=0;i--)
		{
			st1=st1+st.charAt(i);
		}
		System.out.println("It's Your Reverce String:-"+st1);
		if(st1.equals(st))
		{
			System.out.println("The String is Palindeom");
		}
		else
		{
			System.out.println("The String is not Palindeom");
		}
		sc.close();
	}

}
