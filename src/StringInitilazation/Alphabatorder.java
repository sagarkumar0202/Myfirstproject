package StringInitilazation;

import java.util.Scanner;

public class Alphabatorder {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String st = sc.nextLine();
	        st = st.toLowerCase();
	        int len = st.length();
	        String r = "  "; 
	        for (char ch = 'a'; ch <= 'z'; ch++) 
	        {
	            for (int i = 0; i < len; i++) 
	            {
	                char st1 = st.charAt(i);
	                if (ch == st1) 
	                {
	                    r += st1;
	                }
	            }
	        }
	        System.out.println("Alphabetical order:");
	        System.out.println(r);
	       
	        String s = "  ";
	        for (int i = 0; i < len - 1; i++) 
	        {
	            char st2 = r.charAt(i);
	            s += st2;
	            for (int j = st2 + 1; j < r.charAt(i+1); j++) 
	            {
	                s += (char)j;
	            }
	        }
	        s += r.charAt(len - 1);
	        
	        System.out.println("Filled String:");
	        System.out.println(s);
	}
}
