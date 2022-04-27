package ExceptionHandling;

public class ExceptionHandlingDemo 
{

	public static void main(String[] args) 
	{
		int a=100;
		int b=10;
		try
		{
			int result=a/b;
			int ar[] =new int[10];
			System.out.println(ar[9]);
		} 
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(a*b);
		} 
	}

}
