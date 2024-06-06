/**
 * Класс RationalFunction (реализующий f(x) = (Ax + B) / (Cx + D)):
 */
public class RationalFunction implements RealFunctionOnSegment {

    private double a;
    private double b;
    private double c;
    private double d;

    public RationalFunction(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getValue(double x) {
        return (a * x + b) / (c * x + d);
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
