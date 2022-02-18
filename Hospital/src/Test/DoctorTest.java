package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import hospital.DocRec;


public class DoctorTest {
	public void testdoctorList() {
		assertNotNull(DocRec.get_all("Doctor"));
	}
	@Test
	public void DoctorLogin() {
		assertEquals(1,DocRec.login("Doctor", "Doctor_2", "asd"));
	}
	
	
}
