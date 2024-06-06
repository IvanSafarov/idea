public class Task7 {
    public static double expTaylorAccuracy(double x, double eps)
    {
        int i = 1;
        double t, sum, fact, add;
        fact = 1; // Факториал
        add = eps + 1;
        sum = 1;
        while (Double.compare(eps,Math.abs(add)) < 0) { // Пока точность меньше слагаемого
            fact *= i;
            add = Math.pow(x, i) / fact;
            sum += add;
            i++;
        }
        return sum;
    }
}
