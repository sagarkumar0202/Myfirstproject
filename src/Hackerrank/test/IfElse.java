package Hackerrank.test;
import java.util.*;
public class IfElse {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value ");
        int N= sc.nextInt();
        
        
        if (N % 2 != 0)
        {
            System.out.print("Weird"); 
        }
        else if (N >= 2 && N <= 5)
        {
            System.out.print("Not Weird");
        }
        else if (N >= 6 && N <= 20)
        {
            System.out.print("Weird");
        }
         else if(N > 20)
        {
            System.out.print("Not Weird");
        }
        

        sc.close();
    }
}
