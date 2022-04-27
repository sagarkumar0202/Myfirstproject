import java.util.Scanner;

public class EvenRange 
{
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter lower Limit:");
		int l = sca.nextInt();

		System.out.println("Enter Upper Limit:");
		int u = sca.nextInt();
		int c;

		for (int i = l; i <= u; i++) 
		{
			c = 0;
			for (int j = 1; j < i; j++)
			{
				if (i % j == 0)
				{
					c = c + j;
				}
			}
			if (c == i) 
			{
				System.out.println(i + " ");
			}
		}
		sca.close();
	}

}
