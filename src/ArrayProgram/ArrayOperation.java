package ArrayProgram;

import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args)
	{
		//int ar[] = {10,14,15,16,17,18};//static value
		int ar1[]=new int[10];
		 
		Scanner sca =new Scanner(System.in);
		System.out.println("Enter the Element");
		
		for(int i=0;i<10;i++)
		{
			ar1[i]=sca.nextInt(); //value initialization in the array
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(ar1[i]+",");
		}
		sca.close();
	}

}
