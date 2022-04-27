package StringProgramm;

import java.util.Scanner;

public class MinAndMaxLengthOfString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String st = sc.nextLine();
		int c=0,j=0,k=0;
		st = st +' ';
		int ar[] = new int [100];
		for(int i=0; i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			{
				ar[j]=k;
				j=j+1;
				k=0;
			}
			else
			{
				//if((st.char At(i)>"a" && st.char At(i)<"z") || (st.char At(i)>"A" && st.char At(i)<"Z"))
					k=k+1;
			}
		}
		
	}

}
