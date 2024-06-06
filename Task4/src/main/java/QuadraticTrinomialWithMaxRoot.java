public class QuadraticTrinomialWithMaxRoot {

    private QuadraticEquation trinomial;

    public QuadraticTrinomialWithMaxRoot(QuadraticEquation trinomial) {
        this.trinomial = trinomial;
    }

    public double getMaxRoot() {
        double[] roots = trinomial.solve();
        if (roots.length == 0) {
            throw new IllegalArgumentException("Уравнение не имеет действительных корней.");
        } else if (roots.length == 1) {
            return roots[0]; // Возвращаем единственный корень
        } else {
            return Math.max(roots[0], roots[1]); // Возвращаем наибольший корень
        }
    }
}