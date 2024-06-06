public class LinearFunction implements RealFunctionOnSegment {
/**
 Класс LinearFunction (реализующий f(x) = Ax + B)
 */
    private double a;
    private double b;

    public LinearFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue(double x) {
        return a * x + b;
    }

    @Override
    public double getLeftBound() {
        return -Double.MAX_VALUE; // Предположим, что функция определена на всей числовой прямой
    }

    @Override
    public double getRightBound() {
        return Double.MAX_VALUE; // Предположим, что функция определена на всей числовой прямой
    }
}