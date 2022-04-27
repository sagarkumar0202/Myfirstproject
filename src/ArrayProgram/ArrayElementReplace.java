package ArrayProgram;

import java.util.Scanner;

public class ArrayElementReplace {

	public static void main(String[] args) 
	{
		int ar[] = {10,14,15,16,16,17,18,21,22};
		Scanner sca =new Scanner(System.in);
		System.out.println("Enter the Value Where you want to Replace the Element :");
		int s=sca.nextInt();
		
		if(s<0  || s>=ar.length)
		{
			System.out.println("Wrong Index Value");
		}
		else
		{
			System.out.println("Enter the value:");
			int a=sca.nextInt();
		ar[s]=a;
		System.out.println("the value is replaced");
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print(" "+ar[i]);
			
		}
		sca.close();
	}
	}
}
