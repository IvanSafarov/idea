import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FinanceReportProcessorTest {

    // Тест для метода getPaymentsByName, который должен возвращать платежи людей с заданной первой буквой фамилии
    @Test
    void testGetPaymentsByName() {
        FinanceReport report = new FinanceReport("John Doe", 20230501);

        Payment p1 = new Payment("Alice Smith", 10, 5, 2023, 1000);
        Payment p2 = new Payment("Bob Johnson", 15, 5, 2023, 2000);
        Payment p3 = new Payment("Charlie Brown", 20, 5, 2023, 3000);

        report.setPayment(0, p1);
        report.setPayment(1, p2);
        report.setPayment(2, p3);

        FinanceReport result = FinanceReportProcessor.getPaymentsByName(report, 'B');

        Assertions.assertEquals(1, result.getSize());
        Assertions.assertSame(p2, result.getPayment(0));
    }

    // Тест для метода getPaymentsBySumLessThan, который должен возвращать платежи с суммой меньше заданного значения
    @Test
    void testGetPaymentsBySumLessThan() {
        FinanceReport report = new FinanceReport("John Doe", 20230501);

        Payment p1 = new Payment("Alice Smith", 10, 5, 2023, 1000);
        Payment p2 = new Payment("Bob Johnson", 15, 5, 2023, 2000);
        Payment p3 = new Payment("Charlie Brown", 20, 5, 2023, 3000);

        report.setPayment(0, p1);
        report.setPayment(1, p2);
        report.setPayment(2, p3);

        FinanceReport result = FinanceReportProcessor.getPaymentsBySumLessThan(report, 2500);

        Assertions.assertEquals(2, result.getSize());
        Assertions.assertSame(p1, result.getPayment(0));
        Assertions.assertSame(p2, result.getPayment(1));
    }

    // Тест для метода getTotalPaymentsByDate, который должен возвращать общую сумму платежей на заданную дату
    @Test
    void testGetTotalPaymentsByDate() {
        FinanceReport report = new FinanceReport("John Doe", 20230501);

        Payment p1 = new Payment("Alice Smith", 10, 5, 2023, 1000);
        Payment p2 = new Payment("Bob Johnson", 15, 5, 2023, 2000);
        Payment p3 = new Payment("Charlie Brown", 20, 5, 2023, 3000);
        Payment p4 = new Payment("David Lee", 10, 6, 2023, 4000);

        report.setPayment(0, p1);
        report.setPayment(1, p2);
        report.setPayment(2, p3);
        report.setPayment(3, p4);

        int totalPayments = FinanceReportProcessor.getTotalPaymentsByDate(report, 10, 5, 2023);
        Assertions.assertEquals(1000, totalPayments);

        totalPayments = FinanceReportProcessor.getTotalPaymentsByDate(report, 15, 5, 2023);
        Assertions.assertEquals(2000, totalPayments);

        totalPayments = FinanceReportProcessor.getTotalPaymentsByDate(report, 20, 5, 2023);
        Assertions.assertEquals(3000, totalPayments);

        totalPayments = FinanceReportProcessor.getTotalPaymentsByDate(report, 10, 6, 2023);
        Assertions.assertEquals(4000, totalPayments);
    }

    // Тест для метода getMonthsWithoutPayments, который должен возвращать список месяцев без платежей в течение года
    @Test
    void testGetMonthsWithoutPayments() {
        FinanceReport report = new FinanceReport("John Doe", 20230501);

        Payment p1 = new Payment("Alice Smith", 10, 5, 2023, 1000);
        Payment p2 = new Payment("Bob Johnson", 15, 5, 2023, 2000);
        Payment p3 = new Payment("Charlie Brown", 20, 5, 2023, 3000);
        Payment p4 = new Payment("David Lee", 10, 6, 2023, 4000);

        report.setPayment(0, p1);
        report.setPayment(1, p2);
        report.setPayment(2, p3);
        report.setPayment(3, p4);

        Assertions.assertEquals(10, FinanceReportProcessor.getMonthsWithoutPayments(report, 2023).size());
        Assertions.assertTrue(FinanceReportProcessor.getMonthsWithoutPayments(report, 2023).contains("Январь"));
        Assertions.assertTrue(FinanceReportProcessor.getMonthsWithoutPayments(report, 2023).contains("Февраль"));
        Assertions.assertFalse(FinanceReportProcessor.getMonthsWithoutPayments(report, 2023).contains("Май"));
        Assertions.assertFalse(FinanceReportProcessor.getMonthsWithoutPayments(report, 2023).contains("Июнь"));
    }
}
