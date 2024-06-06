import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FinanceReportTest {

    // Тест для конструктора и методов получения/установки значений класса FinanceReport
    @Test

    void testFinanceReport() {
        FinanceReport report = new FinanceReport("John Doe", 20230501);

        Assertions.assertEquals("John Doe", report.getName());
        Assertions.assertEquals(20230501, report.getDate());
        Assertions.assertEquals(0, report.getSize());

        Payment p1 = new Payment("Alice Smith", 10, 5, 2023, 1000);
        Payment p2 = new Payment("Bob Johnson", 15, 5, 2023, 2000);
        Payment p3 = new Payment("Charlie Brown", 20, 5, 2023, 3000);

        report.setPayment(0, p1);
        report.setPayment(1, p2);
        report.setPayment(2, p3);

        Assertions.assertEquals(3, report.getSize());
        Assertions.assertSame(p1, report.getPayment(0));
        Assertions.assertSame(p2, report.getPayment(1));
        Assertions.assertSame(p3, report.getPayment(2));
    }

    // Тест для метода copyPayments, проверяющий корректность создания копии отчета
    @Test
    void testCopyPayments() {
        FinanceReport report = new FinanceReport("John Doe", 20230501);

        Payment p1 = new Payment("Alice Smith", 10, 5, 2023, 1000);
        Payment p2 = new Payment("Bob Johnson", 15, 5, 2023, 2000);
        Payment p3 = new Payment("Charlie Brown", 20, 5, 2023, 3000);

        report.setPayment(0, p1);
        report.setPayment(1, p2);
        report.setPayment(2, p3);

        FinanceReport copy = report.copyPayments();

        Assertions.assertEquals(report.getName(), copy.getName());
        Assertions.assertEquals(report.getDate(), copy.getDate());
        Assertions.assertEquals(report.getSize(), copy.getSize());

        for (int i = 0; i < report.getSize(); i++) {
            Assertions.assertEquals(report.getPayment(i), copy.getPayment(i));
            Assertions.assertNotSame(report.getPayment(i), copy.getPayment(i));
        }
    }

    // Тест для метода toString, проверяющий корректность строкового представления отчета
    @Test
    void testToString() {
        FinanceReport report = new FinanceReport("John Doe", 20230501);

        Payment p1 = new Payment("Alice Smith", 10, 5, 2023, 100000);
        Payment p2 = new Payment("Bob Johnson", 15, 5, 2023, 200000);
        Payment p3 = new Payment("Charlie Brown", 20, 5, 2023, 300000);

        report.setPayment(0, p1);
        report.setPayment(1, p2);
        report.setPayment(2, p3);

        String expected = "[Автор: John Doe, дата: 20230501, Платежи: [\n" +
                "\tПлательщик: Alice Smith, дата: 10.5.2023 сумма: 1000 руб. 0 коп.\n" +
                "\tПлательщик: Bob Johnson, дата: 15.5.2023 сумма: 2000 руб. 0 коп.\n" +
                "\tПлательщик: Charlie Brown, дата: 20.5.2023 сумма: 3000 руб. 0 коп.\n" +
                "]";

        Assertions.assertEquals(expected, report.toString());
    }

}
