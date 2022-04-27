package StringInitilazation;

public class StringDemo {

	public static void main(String[] args) 
	{
		 String st = "Hello World";
		 String st1 = new String("Hi sagar it your first String Program:");
		 System.out.println(st.charAt(4));
		 for(int i=0;i<st.length();i++)
		 {
			 char ch = st.charAt(i);
			 System.out.print(ch);
		 }
		 
		 System.out.println(" ");
		 for(int i=0;i<st1.length();i++)
		 {
			 char ch = st1.charAt(i);
			 System.out.print(ch);
		 }

	}

}
