package ArrayProgram;
import java.util.Scanner;
public class ArrayDublicatElement 
{
	public static void main(String[] args)
	{
		int ar[] = {10,14,15,16,16};
		Scanner sca =new Scanner(System.in);
		System.out.println("Enter any Value  to Search in the array:");
		int s=sca.nextInt();
		int c=0;
		for(int i=0; i< ar.length;i++)
		{
			if(ar[i]==s)
			{
				c=c+1;
			}
		}
		if(c==0)
		{
			System.out.println("Not present");
		}
		else if(c==1)
		{
			System.out.println("Unique Element");
		}
		else
		{
			System.out.println("Duplicate Element");
		}
		sca.close();
	}
}