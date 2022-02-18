package Test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import hospital.Connect;


public class DatabaseConnectTest {
	@Test
	public void testLogin() {
		assertNotNull(Connect.ConnectDB());
	}
}
