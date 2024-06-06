/**
 * Класс ExponentialFunction (реализующий f(x) = Aexp(x) + B):
 */
public class ExponentialFunction implements RealFunctionOnSegment {

    private double a;
    private double b;

    public ExponentialFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue(double x) {
        return a * Math.exp(x) + b;
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
