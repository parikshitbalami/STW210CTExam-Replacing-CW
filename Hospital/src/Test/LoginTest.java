package Test;

import static org.junit.Assert.*;  
import org.junit.Test;

import hospital.login;  

public class LoginTest {
	@Test
	public void testLogin() {
		assertEquals(1,login.logindata("admin","ak","aaaaa"));
	}

}
