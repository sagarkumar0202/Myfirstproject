package OOPConcept;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		Employee ob=new Employee();
		Employee ob2=new Employee(101,"Sagar",15000);
		ob2.display();
		Employee ob3=new Employee(ob2);
		ob3.display();


	}

}
