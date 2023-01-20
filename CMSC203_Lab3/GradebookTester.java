import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	private GradeBook gbObj1;
	private GradeBook gbObj2;

	@BeforeEach
	void setUp() throws Exception {//task 3
		gbObj1 = new GradeBook(5);
		gbObj2 = new GradeBook(5);
		
		gbObj1.addScore(87);
		gbObj1.addScore(79);
		
		gbObj2.addScore(88);
		gbObj2.addScore(63);
		
	}

	@AfterEach
	void tearDown() throws Exception {//task 3
		gbObj1 = null;
		gbObj2 = null;
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		assertTrue(gbObj1.toString().equals("87 79"));
		assertTrue(gbObj2.toString().equals("88 63"));
	}

	@Test
	void testSum() {
		assertEquals(166, gbObj1.sum(), 0.001);
		assertEquals(151, gbObj2.sum(), 0.001);
	}

	@Test
	void testMinimum() {
		assertEquals(79, gbObj1.minimum(), 0.01);
		assertEquals(63, gbObj2.minimum(), 0.01);
	}

	@Test
	void testFinalScore() {
		assertEquals(87, gbObj1.finalScore(), 0.001);
		assertEquals(88, gbObj2.finalScore(), 0.001);
	}

}
