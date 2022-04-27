package StringInitilazation;

import java.util.Scanner;

public class Stringlargestwords 
{

	public static void main(String[] args) 
	{
		//String st = "Hello Sagar this is your String Program";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		String sarray[]=st.split(" ");
		int l=0;
		for(String s:sarray)
		{
			if(s.length()>1)
				l=s.length();
		}
		System.out.println(l);
		sc.close();
	}  
		

	}

