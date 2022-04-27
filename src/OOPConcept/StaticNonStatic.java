package OOPConcept;

public class StaticNonStatic {

	static int a=100;
	int b=200;
	
	public void test()
	{
		a=a+100;//static member
		b=b+100; //non static   //a
		System.out.println(a);  //ob -> b   ob1 ->b ob2->b
		System.out.println(b);
	}
	
	
	
	
	public static void main(String args[])
	{
		
		StaticNonStatic ob=new StaticNonStatic();
		StaticNonStatic ob2=new StaticNonStatic();
		StaticNonStatic ob3=new StaticNonStatic();
		//ob.test();
		ob.test(); //210
		ob2.test();//210 
		ob3.test();//210
		
		
	}

}
