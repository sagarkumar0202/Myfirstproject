package StringInitilazation;

public class StringLength {

	public static void main(String[] args) 
	{
		String st = new String("Hi sagar Welcome to java Programming,This is Your String 2");
		String st1=".";
		String st2=" it's sagar";
				System.out.println(st.length());
				System.out.println(st.charAt( 1));
				System.out.println(st.substring(5,9));
				System.out.println(st.contains("Hi"));
				System.out.println(String.join("/","12","Sagar","It's your","First Program"));
				System.out.println(String.join(":","Today Time is:-","6","30","50"));
				System.out.println(st.isEmpty());
				System.out.println(st1.isBlank());
				System.out.println(st1.equals(st2));
				System.out.println(st.concat(st2).concat(st1));
				System.out.println(st.replace('i', 'I'));
				System.out.println(st.concat(st2).concat(st1));
				// Sir Program
				
				//String st="Welcome to String programming";
				//String st1="test";
				String st3="TEST";
				//String st2=" First Program";
				String a="Welcome to java. java is an Object oriented programming."; 
				System.out.println(st.length());
				System.out.println(st.charAt(0));
				System.out.println(st.substring(8,10));
				System.out.println(st.substring(11));
				System.out.println(st.contains("String"));
				System.out.println(st.join("-","12",  "06", "2021"));
				System.out.println(st.join("_","welcome",  "to", "java"));
				System.out.println(st.join(":","7",  "30", "50"));
				System.out.println(st1.isEmpty());
				System.out.println(st1.isBlank());
				System.out.println(st1.equals(st2));
				System.out.println(st.concat(st2).concat(st1));
				System.out.println(st.replace('r','R'));
				System.out.println(st.replace("programming","program"));
				System.out.println(a.replaceAll("java", "c++"));
				System.out.println(a.replaceFirst("java","c++"));
				System.out.println(st1.equals(st3));
				System.out.println(st1.equalsIgnoreCase(st3));
				System.out.println(st.indexOf('o'));
				System.out.println(st.lastIndexOf('o'));
				System.out.println(st.indexOf("String"));
				System.out.println(st.toUpperCase());
				System.out.println(st.toLowerCase());
	}

}
