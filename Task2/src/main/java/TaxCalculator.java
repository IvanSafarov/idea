public class TaxCalculator {
    public static int calculateTax(int income) {
        if (income <= 24_000) {
            return 0;
        } else if (income <= 50_000) {
            return (int) ((income - 24_000) * 0.13);
        } else {
            return (int) ((50_000 - 24_000) * 0.13 + (income - 50_000) * 0.20);
        }
    }
}
