import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumFunctionalTest {

    @Test
    public void testGetValue() {
        // Создание функции, для которой вычисляется сумма значений
        RealFunctionOnSegment function = new LinearFunction(1, 2);

        // Создание объекта класса SumFunctional
        SumFunctional sumFunctional = new SumFunctional();

        // Вычисление суммы значений функции на границах отрезка и в его середине
        double result = sumFunctional.getValue(function);

        // Ожидаемый результат (сумма значений функции в точках a, b и (a + b) / 2)
        double expectedResult = function.getValue(function.getLeftBound()) + function.getValue(function.getRightBound()) + function.getValue((function.getLeftBound() + function.getRightBound()) / 2);

        // Проверка того, что вычисленный результат равен ожидаемому
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetValueWithNegativeFunction() {
        // Создание функции, для которой вычисляется сумма значений
        RealFunctionOnSegment function = new LinearFunction(-1, -2);

        // Создание объекта класса SumFunctional
        SumFunctional sumFunctional = new SumFunctional();

        // Вычисление суммы значений функции на границах отрезка и в его середине
        double result = sumFunctional.getValue(function);

        // Ожидаемый результат (сумма значений функции в точках a, b и (a + b) / 2)
        double expectedResult = function.getValue(function.getLeftBound()) + function.getValue(function.getRightBound()) + function.getValue((function.getLeftBound() + function.getRightBound()) / 2);

        // Проверка того, что вычисленный результат равен ожидаемому
        assertEquals(expectedResult, result);
    }

    @Test
    public void testGetValueWithZeroFunction() {
        // Создание функции, для которой вычисляется сумма значений
        RealFunctionOnSegment function = new LinearFunction(0, 0);

        // Создание объекта класса SumFunctional
        SumFunctional sumFunctional = new SumFunctional();

        // Вычисление суммы значений функции на границах отрезка и в его середине
        double result = sumFunctional.getValue(function);

        // Ожидаемый результат (сумма значений функции в точках a, b и (a + b) / 2)
        double expectedResult = function.getValue(function.getLeftBound()) + function.getValue(function.getRightBound()) + function.getValue((function.getLeftBound() + function.getRightBound()) / 2);

        // Проверка того, что вычисленный результат равен ожидаемому
        assertEquals(expectedResult, result);
    }
}
