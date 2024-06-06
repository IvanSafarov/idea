import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentTest {

    // Тест для конструктора и методов получения/установки значений класса Payment
    @Test
    void testPayment() {
        Payment payment = new Payment("John Doe", 15, 5, 2023, 12345);

        Assertions.assertEquals("John Doe", payment.getName());
        Assertions.assertEquals(15, payment.getDate());
        Assertions.assertEquals(5, payment.getMonth());
        Assertions.assertEquals(2023, payment.getYear());
        Assertions.assertEquals(12345, payment.getSum());

        payment.setName("Jane Doe");
        payment.setDate(20);
        payment.setMonth(6);
        payment.setYear(2024);
        payment.setSum(54321);

        Assertions.assertEquals("Jane Doe", payment.getName());
        Assertions.assertEquals(20, payment.getDate());
        Assertions.assertEquals(6, payment.getMonth());
        Assertions.assertEquals(2024, payment.getYear());
        Assertions.assertEquals(54321, payment.getSum());
    }

    // Тест для метода equals, проверяющий сравнение объектов Payment
    @Test
    void testEquals() {
        Payment p1 = new Payment("John Doe", 15, 5, 2023, 12345);
        Payment p2 = new Payment("John Doe", 15, 5, 2023, 12345);
        Payment p3 = new Payment("Jane Doe", 15, 5, 2023, 12345);
        Payment p4 = new Payment("John Doe", 20, 5, 2023, 12345);
        Payment p5 = new Payment("John Doe", 15, 6, 2023, 12345);
        Payment p6 = new Payment("John Doe", 15, 5, 2024, 12345);
        Payment p7 = new Payment("John Doe", 15, 5, 2023, 54321);

        Assertions.assertTrue(p1.equals(p2));
        Assertions.assertFalse(p1.equals(p3));
        Assertions.assertFalse(p1.equals(p4));
        Assertions.assertFalse(p1.equals(p5));
        Assertions.assertFalse(p1.equals(p6));
        Assertions.assertFalse(p1.equals(p7));
    }

    // Тест для метода hashCode, проверяющий корректность вычисления хэш-кода
    @Test
    void testHashCode() {
        Payment p1 = new Payment("John Doe", 15, 5, 2023, 12345);
        Payment p2 = new Payment("John Doe", 15, 5, 2023, 12345);
        Payment p3 = new Payment("Jane Doe", 15, 5, 2023, 12345);

        Assertions.assertEquals(p1.hashCode(), p2.hashCode());
        Assertions.assertNotEquals(p1.hashCode(), p3.hashCode());
    }

    // Тест для метода toString, проверяющий корректность строкового представления объекта Payment
    @Test
    void testToString() {
        Payment payment = new Payment("John Doe", 15, 5, 2023, 12345);
        Assertions.assertEquals("John Doe 15 5 2023 12345", payment.toString());
    }
}
