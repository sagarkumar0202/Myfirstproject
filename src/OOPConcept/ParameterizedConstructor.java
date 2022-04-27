package OOPConcept;

public class ParameterizedConstructor 
{
	long fact,i,n;
	ParameterizedConstructor(int n)
	{
		this.n=n;
		this.fact = 1;
		this.i = 1;
		System.out.println("Parameterized Constructor Invoked");
	}
	public long factorial_calculation()
	{
		while(this.i<=this.n)
		{
			this.fact=this.fact*this.i;
			this.i=this.i+1;
		}
		
		return this.fact;
	}

}


