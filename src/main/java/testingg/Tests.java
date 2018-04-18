package testingg;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Tests {


	@Test
	public void test() 
	{
		Account testAccount = new Account("Edward", "Hawksworth","001");
		Account testAccount2 = new Account("John", "Gordon", "002");
		Service testService = new Service();
		testService.addAccount(testAccount);
		testService.addAccount(testAccount2);
		assertEquals("Edward", testAccount.getFirstName());
		assertEquals("Hawksworth", testAccount.getLastName());
		assertEquals("001", testAccount.getAccountNumber());
		testService.addAccount(testAccount);
		assertEquals(testAccount, testService.retrieveById(0));
	}
	
	@Test
	public void jsonTest()
	{
		Account testAccount = new Account("Edward", "Hawksworth","001");
		Account testAccount2 = new Account("John", "Gordon", "002");
		Service testService = new Service();
		testService.addAccount(testAccount);
		testService.addAccount(testAccount2);
		ObjectWriter ob = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			String json = ob.writeValueAsString(testService.getMap());
			System.out.println(json);
			assertEquals("{\r\n" + 
					"  \"0\" : {\r\n" + 
					"    \"firstName\" : \"Edward\",\r\n" + 
					"    \"lastName\" : \"Hawksworth\",\r\n" + 
					"    \"accountNumber\" : \"001\"\r\n" + 
					"  },\r\n" + 
					"  \"1\" : {\r\n" + 
					"    \"firstName\" : \"John\",\r\n" + 
					"    \"lastName\" : \"Gordon\",\r\n" + 
					"    \"accountNumber\" : \"002\"\r\n" + 
					"  }\r\n" + 
					"}", json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
