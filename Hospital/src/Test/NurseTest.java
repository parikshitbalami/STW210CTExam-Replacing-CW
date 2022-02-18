package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import hospital.DocRec;

public class NurseTest {

	@Test
	public void testNurseList() {
		assertNotNull(DocRec.get_all("Nurse"));
	}

	@Test
	public void NurseLogin() {
		assertEquals(1, DocRec.login("Nurse", "nurse_3", "asd"));
	}
}