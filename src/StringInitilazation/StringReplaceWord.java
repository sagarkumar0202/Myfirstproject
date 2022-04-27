package StringInitilazation;

import java.util.Scanner;

public class StringReplaceWord
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();// "Helo sagar This is a  java String Programm";  
		String w = "",  l="",s="";  
        String[] wo = new String[100];  
        int length = 0;
        st = st + " ";  
        for(int i = 0; i < st.length(); i++)
        {  
            if(st.charAt(i) != ' ')
            {  
                w = w + st.charAt(i);  
                //System.out.println(w);
                //System.out.println( );
           }  
           else
            {  
                wo[length] = w;  
                length++;   
                w = "";  
            }
        }
        s = l = wo[0];
        for(int k = 0; k < length; k++)
        {
        	 if(s.length() > wo[k].length())  
                 s = wo[k];
        	 if(l.length() < wo[k].length())  
	                l = wo[k];  
	     }  
        System.out.println("Largest word: " + l +" Length is: "+l.length());  
	    System.out.println("Smallest word: " + s+" Length is: "+s.length());
	}
}


