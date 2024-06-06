public class Task6 {

    public static void systemTwoLinearEquationsReal(double a1, double b1, double c1, double a2, double b2, double c2) {
        // Коэффициенты системы уравнений
        double determinant = a1 * b2 - a2 * b1;
            if (determinant == 0) {
                if (c1 * b2 == c2 * b1) {
                    System.out.println("Бесконечное число решений");
                } else {
                    System.out.println("Решений нет");
                }
            } else {
                double x = (c1 * b2 - c2 * b1) / determinant;
                double y = (a1 * c2 - a2 * c1) / determinant;
                System.out.printf("%.1f %.1f Решение системы", x, y);
            }
        }
}
