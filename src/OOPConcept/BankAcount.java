package OOPConcept;

public class BankAcount 
{
	int ac_holder_id;
	String ac_holder_name;
	double ac_balance;
	
	public void account_initialization(int id,String name,double bal)
	{
		this.ac_holder_id = id;
		this.ac_holder_name = name;
		this.ac_balance = bal;
	}
	
	public void check_balance()
	{
		System.out.println("Current Available Balence: "+this.ac_balance);
	}
	public void balance_withdrawal(double amount)
	{
		this.ac_balance =this.ac_balance-amount;
	}
	public void balance_deposit(double amount)
	{
		this.ac_balance =this.ac_balance+amount;
	}
}
