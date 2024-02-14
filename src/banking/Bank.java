package banking;

import java.util.ArrayList;

public class Bank 
{
	ArrayList<Account> list;;
	
	public Bank()
	{
		list=new ArrayList<>();
	}
	
    public void addaccount(Account acc)
    {
    	System.out.println("Adding bank account");
    	list.add(acc);
    }
    	
    	public ArrayList getallaccount() {
    		return list;
    }
}
