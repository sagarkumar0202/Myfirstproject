package OOPConcept;

public class X
{

	int a=100;
	public void XTest()
	{
		System.out.println("Method of X Class");
	}
}

class Y extends X
{
	int b=200;
	public void YTest()
	{
		System.out.println("Method of Y Class");
	}
}
class Z extends Y
{
	int c=300;
	public void ZTest()
	{
		System.out.println("Method of Z Class");
	}
}