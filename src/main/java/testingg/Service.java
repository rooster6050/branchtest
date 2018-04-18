package testingg;

import java.util.HashMap;

public class Service {

	private HashMap<Integer, Account> accounts;
	private static int accCounter=0;
	
	public Account retrieveById(int Id)
	{
		return accounts.get(Id);
	}
	
	public void addAccount(Account newAccount)
	{
		accounts.put(accCounter, newAccount);
		accCounter++;
	}
}
