package StringInitilazation;

import java.util.Scanner;

public class SubsetsOfString 
{

	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.nextLine();  
        int l = st.length();  
        int temp = 0;  
        String ar[] = new String[l*(l+1)/2];
        for(int i = 0; i < l; i++) 
        {  
        	 for(int j = i; j < l; j++) 
        	 {  
                 ar[temp] = st.substring(i, j+1);  
                 temp++;  
        	 }
        }
        System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < ar.length; i++) 
        {  
            System.out.println(ar[i]);  
        }
        sc.close();
	}
}
