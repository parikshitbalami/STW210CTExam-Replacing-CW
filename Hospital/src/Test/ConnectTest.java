package Test;

import static org.junit.Assert.assertEquals;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hospital.Connect;

public class ConnectTest {
	Connect	connect;
	@Before
	public void testOpenConnection() throws SQLException {
	  connect = (Connect) DriverManager.getConnection("jdbc:mysql://localhost:3306/hp_mgmt_db","root","");
	}

	@Test
	public void connectiontest() {
		assertEquals("jdbc:mysql://localhost:3306/hp_mgmt_db","root","");
	}
	
}
