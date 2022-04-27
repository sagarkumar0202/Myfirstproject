package ArrayProgram;
import java.util.Scanner;
public class ArrayInsertElement 
{
	public static void main(String[] args) 
	{
		int ar[] =new int[10];
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i=0;i<9;i++)
		{
			ar[i]=sca.nextInt();
			
		}
		System.out.println("Before the insert operation");
		for(int i=0;i<9;i++)
		{
			System.out.print(ar[i]+ " ");
			
		}
		System.out.print("Enter index position where you want to insert new element:");
		int index=sca.nextInt();
		
		if(index<0 || index>=ar.length)
		{
			System.out.println("Wrong index!! ");
		}
		else
		{
		System.out.println("Enter New value:");
		int v=sca.nextInt();
		
		for(int i=ar.length-1;i>=index;i--)
		{
			ar[i]=ar[i-1];
		}
		
		ar[index]=v;
		
		System.out.println("After  the insert operation");
		for(int i=0;i<10;i++)
		{
			System.out.print(ar[i]+ " ");
			
		}
		
		sca.close();
		}

	}

}