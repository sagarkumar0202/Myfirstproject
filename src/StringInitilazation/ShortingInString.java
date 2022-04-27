package StringInitilazation;

import java.util.Scanner;

public class ShortingInString 
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();  
        int l = st.length();  
        int temp = 0;  
        for(int i = 0; i < l; i++) 
        {  
        	for(int j=i+1;j<=l;j--)
        	{
        		temp=j;
        		j=i;
        		i=temp;
        		System.out.println(i);
        	}
        	sc.close();
        }      
	}
}
