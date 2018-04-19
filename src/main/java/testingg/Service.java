package testingg;

import java.util.HashMap;

public class Service {

	private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	private static int accCounter;
	
	public Service()
	{
		accCounter=0;
	}
	
	public Account retrieveById(int Id)
	{
		return accounts.get(Id);
	}
	
	public void addAccount(Account newAccount)
	{
		accounts.put(accCounter, newAccount);
		accCounter++;
	}
	
	public HashMap<Integer, Account> getMap()
	{
		return accounts;
	}

	public int getQuantityByName(String name) {
		int counter=0;
		for(Account iter: accounts.values())
		{
			if(iter.getFirstName()==name)
			{
				counter++;
			}
		}
		return counter;
	}
}
