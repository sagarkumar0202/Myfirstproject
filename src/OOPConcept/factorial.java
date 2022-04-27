package OOPConcept;

public class factorial 
{
	int fact,i;
	factorial()
	{
		fact = 1;
		i = 1;
		System.out.println("Default constructor Invoked");
	}
	public long factorial_calculation(long n)
	{
		while(i<=n)
		{
			fact=fact*i;
			i=i+1;
		}
		
		return fact;
	}

}
