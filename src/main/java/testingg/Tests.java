package testingg;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void test() 
	{
		Account testAccount = new Account("Edward", "Hawksworth","001");
		assertEquals("Edward", testAccount.getFirstName());
		assertEquals("Hawksworth", testAccount.getLastName());
		assertEquals("001", testAccount.getAccountNumber());
		Service testService = new Service();
		testService.addAccount(testAccount);
		assertEquals(testAccount, testService.retrieveById(0));
	}

}
