package StringInitilazation;

import java.util.Scanner;

public class StringProblemOne {

	public static void main(String[] args) 
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sca.nextLine();
		//StringBuilder st = new StringBuilder("Hi sagar Welcome to java Programming,This is Your String 2");
		System.out.print(st);
		System.out.println(" ");
		
		int vo = 0, co = 0, sc = 0,d = 0,b=0;
		
		for (int i = 0; i < st.length(); i++) 
		{
			char ch = st.charAt(i);
            if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) 
            {
            	ch = Character.toLowerCase(ch);
                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vo++;
                }
                else 
                {
                	co++;
                }
            }
            else if (ch==' ')
            {
            	b++;
            }
            else if (ch >= '0' && ch <= '9')
            {
                d++;
            }
            else
            {
                sc++;
            }
		 }
			System.out.println("Number of Alphabets:- "+(vo+co));
            System.out.println("Number of Vowels: " + vo);
            System.out.println("Number of Consonant: " + co);
            System.out.println("Number of Digit: " + d);
            System.out.println("Number of Special Character: " + sc);
            System.out.println("Number of Blank Spacece: " + (b+1));
            sca.close();
	}
}


