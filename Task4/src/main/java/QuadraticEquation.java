// Класс для хранения квадратного трехчлена
class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Метод решения квадратного уравнения
    public double[] solve() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return new double[0]; // Нет действительных корней
        } else if (discriminant == 0) {
            return new double[]{-b / (2 * a)}; // Один действительный корень
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            return new double[]{(-b + sqrtDiscriminant) / (2 * a), (-b - sqrtDiscriminant) / (2 * a)}; // Два действительных корня
        }
    }
}