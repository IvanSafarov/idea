public class Task4 {
    /**
     * Вычисляет коэффициенты квадратного уравнения ax^2 + bx + c = 0.
     * @param a Коэффициент при x^2
     * @param b Коэффициент при x
     * @param c Свободный член
     * @return Массив действительных корней уравнения. Корни упорядочены в порядке возрастания.
     *         Если действительных корней нет, возвращается пустой массив.
     */
    public static double[] coefficientsQuadraticEquation(double a, double b, double c) {
        double d, x1, x2;

        if (Double.compare(a, 0) == 0) {
            // Если a равно 0, уравнение является линейным.
            x1 = -c / b;
            double[] roots = new double[1];
            roots[0] = x1;
            return roots;
        } else {
            // Вычисляем дискриминант.
            d = b * b - 4 * a * c;

            if (Double.compare(d, 0) < 0) {
                // Если дискриминант отрицательный, действительных корней нет.
                double[] roots = new double[0];
                return roots;
            } else if (Double.compare(d, 0) == 0) {
                // Если дискриминант равен 0, уравнение имеет один действительный корень.
                x1 = -b / (2 * a);
                double[] roots = new double[1];
                roots[0] = x1;
                return roots;
            } else {
                // Если дискриминант положительный, уравнение имеет два действительных корня.
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                double[] roots = new double[2];
                roots[0] = x1;
                roots[1] = x2;
                return roots;
            }
        }
    }
}
