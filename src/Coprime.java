import java.util.Scanner;

public class Coprime {

	public static void main(String[] args) 
	{

		
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		a=scan.nextInt();
		System.out.println("Enter any number:");
		b=scan.nextInt();
		int gcd=0;
		for(int i=1;i<=a && i<=b;i++)
		{	
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		
		if(gcd==1)
		{
			System.out.println("co-prime");
		}
		else
		{
			System.out.println("Not co-prime");
		}
		
		scan.close();
	}

}
		

