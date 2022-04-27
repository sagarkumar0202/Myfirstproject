package OOPConcept;

public class Employee 
{
	int eid;
	String ename;
	double esalary;
	
	Employee()//Default Constructor
	{
		eid=0;
		ename=" ";
		esalary=0.0;
		System.out.println("This is the Default Constructor");
	}
	Employee(int id,String name,double salary)// Parameterized Constructor
	{
		this.eid=id;
		this.ename=name;
		this.esalary=salary;
	}
	Employee(Employee a)//Copy Constructor
	{
		this.eid=a.eid;
		this.ename=a.ename;
		this.esalary=a.esalary;
	}
	void display()
	{
		System.out.println(eid+" "+ename+" "+esalary+" ");
	}
	
	
}
