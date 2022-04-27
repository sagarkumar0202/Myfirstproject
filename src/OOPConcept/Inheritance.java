package OOPConcept;

public class Inheritance 
{
		int a=200;
	    public void test()
	    {
	    	System.out.println("This is a parent class method");
	    }
	}
	 class Child extends Inheritance
	{
		int b=300;
		public void childTest()
		{
			System.out.println("This is a child class method");
		}
	
		public static void main(String[] args) 
		{
			Child ob=new Child();
			
			System.out.println(ob.b);
			ob.childTest();
			
			System.out.println(ob.a);
			ob.test();

		}

	}


