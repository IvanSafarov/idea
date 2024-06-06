public interface RealFunctionOnSegment {

    double getValue(double x);//вычисляет значение функции при заданном аргументе x

    double getLeftBound();//возвращает левую границу отрезка определения функции.

    double getRightBound();//возвращает правую границу отрезка определения функции.
}