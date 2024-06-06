import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @Test
    public void testNoRealRoots() {
        double[] roots = Task4.coefficientsQuadraticEquation(1, 2, 3);
        assertEquals(0, roots.length);
    }

    @Test
    public void testOneRealRoot() {
        double[] roots = Task4.coefficientsQuadraticEquation(0, 2, 1);
        assertEquals(1, roots.length);
        assertEquals(-0.5, roots[0], 0.001);
    }

    @Test
    public void testTwoRealRoots() {
        double[] roots = Task4.coefficientsQuadraticEquation(1, -3, 2);
        assertEquals(2, roots.length);
        assertEquals(2, roots[0], 0.001);
        assertEquals(1, roots[1], 0.001);
    }
}