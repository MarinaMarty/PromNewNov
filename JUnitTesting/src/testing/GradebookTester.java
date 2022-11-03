package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradebookTester {

	@Test
	void Ftest() {
		gradebook grader = new gradebook();
		assertEquals("F", grader.grade(59));
	}
	@Test
	void Dtest() {
		gradebook grader = new gradebook();
		assertEquals("D", grader.grade(69));
	}
	@Test
	void Ctest() {
		gradebook grader = new gradebook();
		assertEquals("C", grader.grade(79));
	}
	@Test
	void Btest() {
		gradebook grader = new gradebook();
		assertEquals("B", grader.grade(89));
	}
	@Test
	void Atest() {
		gradebook grader = new gradebook();
		assertEquals("A", grader.grade(90));
	}

}
