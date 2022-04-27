package OOPConcept;

public class XYZMain {

	public static void main(String[] args) 
	{
		Y y=new Y();
		System.out.println(y.a);
		y.XTest();
		
		Z z=new Z();
		System.out.println(z.a);
		z.XTest();
		System.out.println(z.b);
		z.YTest();
		System.out.println(z.c);
		z.ZTest();
		
	}

}
