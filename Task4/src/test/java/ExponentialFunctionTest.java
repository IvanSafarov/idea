import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExponentialFunctionTest {

    @Test
    public void testGetValue() {
        ExponentialFunction function = new ExponentialFunction(1, 2);
        assertEquals(3, function.getValue(0));
        assertEquals(Math.E + 2, function.getValue(1));
    }

    @Test
    public void testGetLeftBound() {
        ExponentialFunction function = new ExponentialFunction(1, 2);
        assertTrue(function.getLeftBound() < 0);
    }

    @Test
    public void testGetRightBound() {
        ExponentialFunction function = new ExponentialFunction(1, 2);
        assertTrue(function.getRightBound() > 0);
    }
}