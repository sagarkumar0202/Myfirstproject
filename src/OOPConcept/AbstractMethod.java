package OOPConcept;

abstract class AbstractMethod 
{
	abstract void test(); //Unimplemented method
	void test1()
	{
		System.out.println("Non Abstract method");
	}
}
class child1 extends AbstractMethod
{

	@Override
	void test() 
	{
		System.out.println("Abstract method");
		
	}
	
}
