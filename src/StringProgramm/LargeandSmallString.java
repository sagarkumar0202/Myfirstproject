package StringProgramm;

import java.util.Scanner;

public class LargeandSmallString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		String  [ ] wo = new String [100];
		String w = "",l = "", s = "";
		int length=0;
		st = st + " ";
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)!=' ')
			{
				w = w + st.charAt(i);
			}
			else
			{
				wo[length]=w;
				length++;
				w=" ";
			}
		}
		s=l=wo[0];
		for(int k=0;k<length;k++)
		{
			if(s.length()>wo[k].length())
				s = wo[k];
			if(l.length()<wo[k].length())
				l = wo[k];
		}
		System.out.println("Length of largest words it's self"+l.length()+l);
		System.out.println("Length of Smalest word is :- "+s.length()+s);
	}

}
