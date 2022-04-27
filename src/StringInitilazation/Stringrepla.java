package StringInitilazation;

public class Stringrepla 
{

	public static void main(String[] args)
{
		String st = "Hello Sagar this is your String Program";
		st=st+' ';
		
	int c=0,k=0,s=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
	{	
				if(k>c)
				{
					c=k;
				}
				if(k<s)
				{
					s=k;
				}
				k=0;
			}
			else
			{
				if((st.charAt(i)>='a' && st.charAt(i)<='z') || (st.charAt(i)>='A' && st.charAt(i)<='Z'))
					k=k+1;
			}
		}
		System.out.println(c);
		System.out.println(s);
	}

}
