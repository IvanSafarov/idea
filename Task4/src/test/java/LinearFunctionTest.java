import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearFunctionTest {

    @Test
    public void testGetValue() {
        // Создаем объект LinearFunction с коэффициентами a = 2 и b = 3
        LinearFunction linearFunction = new LinearFunction(2, 3);

        // Проверяем, что getValue(1) возвращает ожидаемое значение 5
        assertEquals(5.0, linearFunction.getValue(1.0));

        // Проверяем, что getValue(-2) возвращает ожидаемое значение -1
        assertEquals(-1.0, linearFunction.getValue(-2.0));
    }

    @Test
    public void testGetLeftBound() {
        LinearFunction linearFunction = new LinearFunction(2, 3);
        assertTrue(linearFunction.getLeftBound() < 0);
    }

    @Test
    public void testGetRightBound() {
        LinearFunction linearFunction = new LinearFunction(2, 3);
        assertTrue(linearFunction.getRightBound() > 0);
    }
}