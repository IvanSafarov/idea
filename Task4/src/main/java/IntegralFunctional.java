/**
 * Класс IntegralFunctional (реализующий определенный интеграл на отрезке [a, b]):
 */
public class IntegralFunctional implements Functional<RealFunctionOnSegment> {

    private double a;
    private double b;

    public IntegralFunctional(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue(RealFunctionOnSegment function) {
        double leftBound = function.getLeftBound();
        double rightBound = function.getRightBound();

        if (a < leftBound || b > rightBound) {
            throw new IllegalArgumentException("Область определения функции не содержится в заданном отрезке.");
        }

        // Вычисляем интеграл методом прямоугольников
        double step = 0.001;
        double sum = 0;
        for (double x = a; x < b; x += step) {
            sum += function.getValue(x) * step;
        }

        return sum;
    }
}
