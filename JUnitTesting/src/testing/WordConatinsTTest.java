package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordConatinsTTest {

	@Test
	void testContainsT() {
		JUnitTesting test = new JUnitTesting();
		boolean output = test.foundT("Theory");
		assertTrue(output);
	}
}
