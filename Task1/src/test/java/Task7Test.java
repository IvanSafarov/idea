import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task7Test {

    @Test
    void testSimple() {
        double x = 1.0;
        double eps = 0.001;
        double expected = Math.exp(x);
        double actual = Task7.expTaylorAccuracy(x, eps);
        assertEquals(expected, actual, eps);
    }

    @Test
    void testLargeX() {
        double x = 10.0;
        double eps = 0.001;
        double expected = Math.exp(x);
        double actual = Task7.expTaylorAccuracy(x, eps);
        assertEquals(expected, actual, eps);
    }

    @Test
    void testHighPrecision() {
        double x = 1.0;
        double eps = 0.000001;
        double expected = Math.exp(x);
        double actual = Task7.expTaylorAccuracy(x, eps);
        assertEquals(expected, actual, eps);
    }
}
