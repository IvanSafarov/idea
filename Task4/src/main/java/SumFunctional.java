/**
 * Класс SumFunctional (реализующий сумму значений функции на концах отрезка и в его середине):
 */
public class SumFunctional implements Functional<RealFunctionOnSegment> {

    @Override
    public double getValue(RealFunctionOnSegment function) {
        double a = function.getLeftBound();
        double b = function.getRightBound();
        double middle = (a + b) / 2;
        return function.getValue(a) + function.getValue(b) + function.getValue(middle);
    }
}