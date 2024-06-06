import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SineFunctionTest {

    @Test
    public void testGetValue() {
        SineFunction function = new SineFunction(1, 1);
        double value = function.getValue(0);
        assertEquals(0, value);
    }

    @Test
    public void testGetLeftBound() {
        SineFunction function = new SineFunction(1, 1);
        double leftBound = function.getLeftBound();
        assertTrue(leftBound < 0);
    }

    @Test
    public void testGetRightBound() {
        SineFunction function = new SineFunction(1, 1);
        double rightBound = function.getRightBound();
        assertTrue(rightBound > 0);
    }

}
