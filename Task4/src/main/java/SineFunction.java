/**
 * Класс SineFunction (реализующий f(x) = Asin(Bx)):
 */
public class SineFunction implements RealFunctionOnSegment {

    private double a;
    private double b;

    public SineFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue(double x) {
        return a * Math.sin(b * x);
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
