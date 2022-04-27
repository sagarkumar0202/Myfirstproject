package OOPConcept;

public class Teacher 
{
	int salary=20000;
	Teacher()
	{
		System.out.println("This is Teacher class Constructor");
	}
	public void teacherMethod()
	{
		System.out.println("This is Teacher class method");
	}
}
class Student extends Teacher
{
	int totalMarks=300;
	Student()
	{
		super();
	}
	public void StudentTest()
	{
		System.out.println(super.salary);
		super.teacherMethod();//invok super class method
	}
	
}
