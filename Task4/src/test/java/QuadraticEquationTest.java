
// Набор unit-тестов для класса QuadraticEquation
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    public void testSolveWithPositiveDiscriminant() {
        QuadraticEquation equation = new QuadraticEquation(1, -5, 6);
        double[] roots = equation.solve();
        assertArrayEquals(new double[]{3, 2}, roots);
    }

    @Test
    public void testSolveWithZeroDiscriminant() {
        QuadraticEquation equation = new QuadraticEquation(1, -4, 4);
        double[] roots = equation.solve();
        assertArrayEquals(new double[]{2}, roots);
    }

    @Test
    public void testSolveWithNegativeDiscriminant() {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 5);
        double[] roots = equation.solve();
        assertArrayEquals(new double[0], roots);
    }
    @Test
    public void testSolveWithKnownRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, -5, 6);
        double[] roots = equation.solve();
        assertEquals(3, roots[0], 0.001);
        assertEquals(2, roots[1], 0.001);
    }
}
