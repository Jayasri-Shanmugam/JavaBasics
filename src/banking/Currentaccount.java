package banking;

public class Currentaccount implements Account
{

	    private double balance;
		@Override
		public void deposit(int depo) {
			balance+=depo;
			
		}
	 
		@Override
		public void withdraw(int amnt) {
			balance-=amnt;
			
		}
	 
		@Override
		public double calculateinterest() {
			return (0.3*balance);
		}
		 
		@Override
		public double viewbalance() {
			return balance;
		}
	 
	}
	

