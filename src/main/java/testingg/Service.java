package testingg;

import java.util.HashMap;

public class Service {

	private HashMap<Integer, Account> accounts;
	private static int accCounter=0;
	
	public Account retrieveById(int Id)
	{
		if(accounts.containsKey(Id))
		{
		return accounts.get(Id);
		}
		else return null;
	}
	
	public void addAccount(Account newAccount)
	{
		accounts.put(accCounter, newAccount);
		accCounter++;
	}
}
