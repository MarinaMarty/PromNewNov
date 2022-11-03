package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sqrtTest {

	@Test
	void testSqrt() {
		JUnitTesting test = new JUnitTesting();
		double output = test.sqrt(5);
		assertEquals(25, output);
	}
	
}
