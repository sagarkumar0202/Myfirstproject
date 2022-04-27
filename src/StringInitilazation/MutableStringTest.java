package StringInitilazation;

public class MutableStringTest {

	public static void main(String[] args) 
	{
		StringBuffer st=new StringBuffer("Hello Sagar this is your first");
	
	st.append(" program");
	System.out.println(st);
	
	st.deleteCharAt(0);
	System.out.println(st);
	
	st.delete(0, 5);
	System.out.println(st);
	
	st.insert(6,"java ");
	System.out.println(st);
	
	for(int i=0;i<st.length();i++)
	{
		System.out.print(st.charAt(i));
	}

}

}
