package OOPConcept;

public class MethodOverloading 
{
	public int addition (int a,int b )
	{
		return a+b;
	}
	public int addition (int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) 
	{
		MethodOverloading ob =new MethodOverloading();
		System.out.println(ob.addition(14, 10));
		System.out.println(ob.addition(14, 10,88));
	
	}

}
