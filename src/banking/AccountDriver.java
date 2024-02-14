package banking;

import java.util.ArrayList;

public class AccountDriver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Account savingsaccount1=new Savingsaccount();
		
		Account currentaccount1=new Currentaccount();
		
		Bank bank=new Bank();
		
		bank.addaccount(savingsaccount1);
		bank.addaccount(currentaccount1);
		
		 savingsaccount1.deposit(10000);
		 savingsaccount1.withdraw(5000);
		 	
		 currentaccount1.deposit(15000);
		 currentaccount1.withdraw(2000);
		 ArrayList<Account> list=bank.getallaccount();
		 for(Account account:list) {
			 System.out.println("Interest : "+account.calculateinterest());
			 System.out.println("Balance : "+account.viewbalance());
			 System.out.println();
		 }
		
	}

}
