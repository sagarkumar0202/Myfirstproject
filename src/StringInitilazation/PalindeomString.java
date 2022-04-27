package StringInitilazation;

import java.util.Scanner;

public class PalindeomString {

	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sca.nextLine();
		String st1 = " ";
		
		System.out.println(" ");
		
		for(int i=st.length()-1;i>=0;i--)
		{
			st1=st1+st.charAt(i);
		}
		System.out.println(st1);
		if(st1.equals(st))
		{
			System.out.println("It is a Palindrom String");
		}
		else
		{
			System.out.println("It is a not Palindrom String");
		}
		
	}

}
