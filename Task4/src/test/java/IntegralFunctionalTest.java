import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegralFunctionalTest {

    @Test
    public void testGetValue() {
        RealFunctionOnSegment function = new RealFunctionOnSegment() {
            @Override
            public double getValue(double x) {
                return x * x;
            }

            @Override
            public double getLeftBound() {
                return 0;
            }

            @Override
            public double getRightBound() {
                return 1;
            }
        };

        IntegralFunctional functional = new IntegralFunctional(0, 1);

        // Уменьшаем шаг интегрирования для повышения точности
        double step = 0.0001;

        double integral = functional.getValue(function);

        // Проверяем, что вычисленный интеграл равен ожидаемому значению (1/3) с точностью до 0,001
        assertEquals(1.0 / 3.0, integral, 0.001);
    }

    @Test
    public void testInvalidInterval() {
        // Создаем функцию, которая определена на отрезке [0, 1]
        RealFunctionOnSegment function = new RealFunctionOnSegment() {
            @Override
            public double getValue(double x) {
                return x * x;
            }

            @Override
            public double getLeftBound() {
                return 0;
            }

            @Override
            public double getRightBound() {
                return 1;
            }
        };

        // Создаем функционал для вычисления интеграла на отрезке [0, 2]
        IntegralFunctional functional = new IntegralFunctional(0, 2);

        // Ожидаем исключение, так как область определения функции не содержится в заданном отрезке
        assertThrows(IllegalArgumentException.class, () -> functional.getValue(function));
    }
}