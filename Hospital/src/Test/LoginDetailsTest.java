package Test;

import org.junit.Before;

import com.mysql.jdbc.Connection;

public class LoginDetailsTest {
	Connection connection;
	@Before
	public void before() {
		connection = SybaseDBConnection.getConnection("ase")
	}
}
