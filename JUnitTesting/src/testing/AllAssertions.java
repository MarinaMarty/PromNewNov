package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllAssertions {

	@Test
	void testAssertions() {
		String str1 ="Hello", str2 = "Hello", str3 = null,
		str4 = "Hello", str5 = "Hello";
		int num1 = 10, num2 = 20;
		String [] expectedArray= {"One", "Two", "Three"};
		String [] resultArray= {"One", "Two", "Three"};
		
		assertEquals(str1, str2);
		//check to see if true
		assertTrue(num1 <num2);
		//checks to see if false
		assertFalse(num1>num2);
		//checks to see if notnull
		assertNotNull(str1);
		//check if it is null
		assertNull(str3);
		//checks if the reference is to the same object
		assertSame(str4, str5);
		
		
	}

}
