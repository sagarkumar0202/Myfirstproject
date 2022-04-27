package OOPConcept;

public class DemoClass implements DemoInterface {

	public static void main(String[] args)
	{
		DemoClass d=new DemoClass();
		d.test();
		d.test1();

	}

	@Override
	public void test() 
	{
		System.out.println("Body of test method");
		
	}

	@Override
	public void test1() 
	{
		
			System.out.println("Body of test method");
		
	}

}
