package OOPConcept;

public class BankMain {

	public static void main(String[] args) 
	{
		Bank b= new AxisBank();
		System.out.println(b.rateOfInterest());
		
		Bank b1= new SBIBank();
		System.out.println(b1.rateOfInterest());

	}

}
