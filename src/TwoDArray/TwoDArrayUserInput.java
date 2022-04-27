package TwoDArray;

import java.util.Scanner;

public class TwoDArrayUserInput
{

	public static void main(String[] args)
{
		int row,col;
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter the Row Number");
		row=sca.nextInt();
		System.out.println("Enter the Colum Number");
		col=sca.nextInt();
		
		int ar[][] =new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the Element:");
				ar[i][j]=sca.nextInt();
				System.out.println(ar[i][j]);
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			sca.close();
			System.out.println();
		}
	}

}
