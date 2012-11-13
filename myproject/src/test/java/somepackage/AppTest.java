package somepackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void shouldReturnOk() {
		assertEquals(true, App.isOk());
	}

}
