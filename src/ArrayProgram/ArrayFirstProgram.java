package ArrayProgram;

import java.io.*;
import java.io.IOException;

public class ArrayFirstProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int ar[]=new int[20];
		
		int i;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter elements:");
		for(i=0;i<10;i++)
		{
			ar[i]=Integer.parseInt(ob.readLine());
		}
		
		for(i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}