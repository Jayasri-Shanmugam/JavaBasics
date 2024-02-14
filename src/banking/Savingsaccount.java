package banking;

public class Savingsaccount implements Account
{

	private double balance;
	@Override
	public void deposit(int depo) {
		balance+=depo;
		
	}
 
	@Override
	public void withdraw(int amnt) {
		if(balance>=amnt)
			balance-=amnt;
		else
			System.out.println("No sufficient Balance");
		
	}
 
	@Override
	public double calculateinterest()
	{
		// TODO Auto-generated method stub
		double i1=(0.4)*balance;
		return i1;
	}
 
	@Override
	public double viewbalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
}
