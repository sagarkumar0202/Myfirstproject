package OOPConcept;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) 
	{
		BankAcount ac1 = new BankAcount();
		ac1.account_initialization(201245845, "Sagar kumar", 10000);
		boolean status = true;
		do
		{
			System.out.println("Input a value to perform operation:");
			System.out.println("-----------------------------------");
			System.out.println("1 -> Balance Check");
			System.out.println("2 -> Balance Withdrawal");
			System.out.println("3 -> Balance Deposit");
			System.out.println("4 -> Quit");
			System.out.println("-----------------------------------");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1: ac1.check_balance();
					break;
					
				case 2: System.out.println("Enter the withdrawal amount :");
						double amount=scan.nextDouble();
						ac1.balance_withdrawal(amount);
						System.out.println("Available amount is: "+ac1.ac_balance);
					break;
					
				case 3: System.out.println("Enter the deposit amount :");		
						double amount1=scan.nextDouble();
						ac1.balance_deposit(amount1);
						System.out.println("Available amount is: "+ac1.ac_balance);
					break;
					
				case 4:System.out.println("Good Bye!!!");
						status=false;
				    break;
				
				default:System.out.println("wrong input!!");	    
		}
	}
	while(status);
}
}