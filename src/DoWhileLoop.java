import java.util.Scanner;

public class DoWhileLoop 
{

	public static void main(String[] args) 
	{

		boolean status = true;
		Scanner scan = new Scanner(System.in);
		do 
		{
			System.out.println("Hello world!");
			System.out.println("enter true to continue and false to stop");
			status = scan.nextBoolean();
		} 
		while (status);
		scan.close();
	}

}
