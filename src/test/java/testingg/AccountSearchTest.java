package testingg;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountSearchTest {
	
	private Service service;
	private Account account1,account2,account3,account4,account5;

	@Test
	public void test() {
		service = new Service();
		account1 = new Account("John", "Gordon","001");
		account2 = new Account("James", "Gordon","002");
		account3 = new Account("John", "Cena","003");
		account4 = new Account("John", "Smith","004");
		account5 = new Account("Ben", "John","005");
		service.addAccount(account1);
		service.addAccount(account2);
		service.addAccount(account3);
		service.addAccount(account4);
		service.addAccount(account5);
		int numOfJohns =3;
		assertEquals(numOfJohns, service.getQuantityByName("John"));
		assertEquals(0, service.getQuantityByName("Tadas"));
		
	}

}
