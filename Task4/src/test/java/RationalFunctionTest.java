import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RationalFunctionTest {

    @Test
    public void testGetValue() {
        RationalFunction function = new RationalFunction(1, 2, 3, 4);
        assertEquals(3.0 / 7.0, function.getValue(1));
        assertEquals(0.4, function.getValue(2));
    }

    @Test
    public void testGetLeftBound() {
        RationalFunction function = new RationalFunction(1, 2, 3, 4);
        assertTrue(function.getLeftBound() < 0);
    }

    @Test
    public void testGetRightBound() {
        RationalFunction function = new RationalFunction(1, 2, 3, 4);
        assertTrue(function.getRightBound() > 0);
    }
}
