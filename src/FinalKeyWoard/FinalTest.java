package FinalKeyWoard;

 public class FinalTest 
{
	final int a=200;
	final public void test()
	{
		//a=100 compilation error
		System.out.println("Parent testMethod");
	}
}
class ac 
{
	public static void main (String args[])
	{
		FinalTest ob = new FinalTest();
	}
}