import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

    // Тест для метода calculateTax, который должен рассчитывать налог на доход физического лица
    @Test
    void testCalculateTax() {
        Assertions.assertEquals(0, TaxCalculator.calculateTax(23_999));
        Assertions.assertEquals(1_000, TaxCalculator.calculateTax(25_000));
        Assertions.assertEquals(28_000, TaxCalculator.calculateTax(250_000));
    }
}
