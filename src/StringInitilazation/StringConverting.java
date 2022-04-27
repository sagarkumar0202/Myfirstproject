package StringInitilazation;

public class StringConverting {

	public static void main(String[] args)
	{
		String st="Hello World";
		System.out.println(st.charAt(0));
		
		int a=st.charAt(0); //converting to integer i.e. ASCII value
		System.out.println(a);
		
		char space=' ';
		int b=(int)space;
		System.out.println(b);
		
		char ch=(char)a; //converting the integer to character(ASCII to character)
		System.out.println(ch);
	 
	}

}
