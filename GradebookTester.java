import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
    private GradeBook gradeBook1;
    private GradeBook gradeBook2;

    @Before
    public void setUp() {
        // Create two GradeBook objects to hold 5 scores each
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        // Add scores to gradeBook1
        gradeBook1.addScore(95);
        gradeBook1.addScore(87);
        gradeBook1.addScore(92);

        // Add scores to gradeBook2
        gradeBook2.addScore(80);
        gradeBook2.addScore(85);
        gradeBook2.addScore(90);
        gradeBook2.addScore(95);
    }

    @After
    public void tearDown() {
        // Set the GradeBook objects to null
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    public void testAddScore() {
        // Check the contents of the scores array using toString() and compare with expected
        assertEquals("95.0 87.0 92.0", gradeBook1.toString());
        assertEquals("80.0 85.0 90.0 95.0", gradeBook2.toString());

        // Compare the scoreSize with the expected number of scores
        assertEquals(3, gradeBook1.getScoreSize());
        assertEquals(4, gradeBook2.getScoreSize());
    }

    @Test
    public void testSum() {
        // Compare the sum() result with the expected sum of scores
        assertEquals(274.0, gradeBook1.sum(), 0.001);
        assertEquals(350.0, gradeBook2.sum(), 0.001);
    }

    @Test
    public void testMinimum() {
        // Compare the minimum() result with the expected minimum score
        assertEquals(87.0, gradeBook1.minimum(), 0.001);
        assertEquals(80.0, gradeBook2.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() {
        // Compare the finalScore() result with the expected final score
        assertEquals(187.0, gradeBook1.finalScore(), 0.001);
        assertEquals(270.0, gradeBook2.finalScore(), 0.001);
    }
}
