package StringInitilazation;

public class StringBuilderTest 
{

	public static void main(String[] args)
	{
		StringBuilder st = new StringBuilder("Hi sagar Welcome to java Programming");
		
		StringBuilder st1 = new StringBuilder();
		System.out.println(st1.capacity());
		st1.ensureCapacity(22);
		System.out.println(st1.capacity());
		
		System.out.println(st.length());
		System.out.println(st.capacity());
		//st.ensureCapacity(st.ensureCapacity(20));
		System.out.println(st.indexOf("w"));
		System.out.println(st.append(" welcome"));
		System.out.println(st.insert(0, "O "));
		System.out.println(st.lastIndexOf("m"));
		System.out.println(st.delete(0, 1));
		
		
		
		
		for(int i=0;i<st.length();i++)
		{
			System.out.print(st.charAt(i));
		}
	
	}

}
