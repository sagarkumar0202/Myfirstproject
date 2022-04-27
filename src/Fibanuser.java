import java.util.Scanner;

public class Fibanuser {

	public static void main(String[] args) 
	{
		int a,b,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
		
		System.out.println("Enter the number:");
		b=sc.nextInt();
		
		System.out.println("Enter the length of number:");
		n=sc.nextInt();
		int c=0;
		//System.out.print(a+" ");
		//System.out.print(b+" ");
		for(int i=0;i<n;i++) 
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		sc.close();
	}
}
