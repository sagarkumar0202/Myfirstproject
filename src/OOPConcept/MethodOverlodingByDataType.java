package OOPConcept;

public class MethodOverlodingByDataType 
{
	static int addition(int a,int b)
	{
		return a+b;
	}
	static double addition(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(MethodOverlodingByDataType.addition(44.2, 40.33));
		System.out.println(MethodOverlodingByDataType.addition(44, 40));

	}

}
