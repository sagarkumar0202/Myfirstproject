package StringInitilazation;

public class StringReplaceProgramm {

	public static void main(String[] args) 
	{
		String st="Hello World",st1="";
		int index=6;
		char ch='w';
		
		for(int i=0;i<st.length();i++)
		{
			if(i==index)
			{
				st1=st1+ch;
			}
			else
			{
				st1=st1+st.charAt(i);
			}
		}
		st=st1;
		
		System.out.println(st);
	}
}


