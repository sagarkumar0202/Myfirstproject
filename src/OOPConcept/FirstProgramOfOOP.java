package OOPConcept;

public class FirstProgramOfOOP 
{
		int sid,sroll;
		//String name;
		double marks;
		String sname;
		
		public void insert(int id, int roll,String name,double marks)
		{
			this.sid = id;
			this.sroll=roll;
			this.sname=name;
			this.marks=marks;
		}
		public void display()
		{
			System.out.println(sid);
			System.out.println(sroll);
			System.out.println(sname);
			System.out.println(marks);
		}
		
	}


